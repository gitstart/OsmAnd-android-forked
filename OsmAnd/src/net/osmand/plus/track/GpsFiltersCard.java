package net.osmand.plus.track;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.slider.RangeSlider;
import com.google.android.material.slider.Slider;

import net.osmand.plus.ColorUtilities;
import net.osmand.plus.FilteredSelectedGpxFile;
import net.osmand.plus.FilteredSelectedGpxFile.GpsFilter;
import net.osmand.plus.R;
import net.osmand.plus.UiUtilities;
import net.osmand.plus.activities.MapActivity;
import net.osmand.plus.helpers.AndroidUiHelper;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

public class GpsFiltersCard extends GpsFilterBaseCard {

	private View view;

	public GpsFiltersCard(@NonNull MapActivity mapActivity, @NonNull Fragment target) {
		super(mapActivity, target);
	}

	@Override
	protected int getMainContentLayoutId() {
		return R.layout.gps_filters_list;
	}

	@Override
	protected void updateMainContent() {
		if (view == null) {
			view = inflateMainContent();
		}

		FilteredSelectedGpxFile currentFilteredGpx = gpsFilterHelper.getCurrentFilteredGpxFile();
		if (currentFilteredGpx != null) {
			updatePointsRatio(currentFilteredGpx);
			setupSmoothingFilter(currentFilteredGpx);
			setupSpeedFilter(currentFilteredGpx);
			setupAltitudeFilter(currentFilteredGpx);
			setupHdopFilter(currentFilteredGpx);
		}
	}

	private void updatePointsRatio(@NonNull FilteredSelectedGpxFile gpxFile) {
		String pointsString = app.getString(R.string.shared_string_gpx_points);
		String leftPoints = String.valueOf(gpxFile.getLeftPointsCount());
		String totalPoints = String.valueOf(gpxFile.getTotalPointsCount());
		String ratio = app.getString(R.string.ltr_or_rtl_combine_via_slash_with_space, leftPoints, totalPoints);
		String fullText = app.getString(R.string.ltr_or_rtl_combine_via_colon, pointsString, ratio);
		SpannableString spannedText = new SpannableString(fullText);
		spannedText.setSpan(new StyleSpan(Typeface.BOLD), 0, pointsString.length() + 1,
				Spanned.SPAN_EXCLUSIVE_INCLUSIVE);

		TextView pointsRatio = view.findViewById(R.id.points_ratio);
		pointsRatio.setText(spannedText);
	}

	private void setupSmoothingFilter(@NonNull FilteredSelectedGpxFile gpxFile) {
		setupFilter(view.findViewById(R.id.smoothing_filter), gpxFile.getSmoothingFilter());
	}

	private void setupSpeedFilter(@NonNull FilteredSelectedGpxFile gpxFile) {
		setupFilter(view.findViewById(R.id.speed_filter), gpxFile.getSpeedFilter());
	}

	private void setupAltitudeFilter(@NonNull FilteredSelectedGpxFile gpxFile) {
		setupFilter(view.findViewById(R.id.altitude_filter), gpxFile.getAltitudeFilter());
	}

	private void setupHdopFilter(@NonNull FilteredSelectedGpxFile gpxFile) {
		setupFilter(view.findViewById(R.id.hdop_filter), gpxFile.getHdopFilter());
	}

	private void setupFilter(@NonNull View container, @NonNull GpsFilter filter) {
		View header = container.findViewById(R.id.filter_header);
		View content = container.findViewById(R.id.filter_content);
		AppCompatImageView upDownButton = container.findViewById(R.id.up_down_button);

		if (!filter.isNeeded()) {
			updateDisplayedFilterNumbers(container, filter);
			updateUpDownButton(upDownButton, false);
			AndroidUiHelper.updateVisibility(content, false);
			return;
		}

		header.setOnClickListener(v -> {
			boolean expanded = content.getVisibility() == View.VISIBLE;
			updateUpDownButton(upDownButton, !expanded);
			AndroidUiHelper.updateVisibility(content, !expanded);
		});

		setupSlider(container, filter);
		updateDisplayedFilterNumbers(container, filter);

		TextView minFilterValue = container.findViewById(R.id.min_filter_value);
		minFilterValue.setText(filter.getFormattedStyledValue(app, filter.getMinValue()));

		TextView maxFilterValue = container.findViewById(R.id.max_filter_value);
		maxFilterValue.setText(filter.getFormattedStyledValue(app, filter.getMaxValue()));

		TextView filterDescription = container.findViewById(R.id.filter_description);
		filterDescription.setText(filter.getDescriptionId());
	}

	private void updateUpDownButton(@NonNull AppCompatImageView upDownButton, boolean up) {
		int upDownIconId = up ? R.drawable.ic_action_arrow_up : R.drawable.ic_action_arrow_down;
		Drawable upDownIcon = getColoredIcon(upDownIconId, ColorUtilities.getDefaultIconColorId(nightMode));
		upDownButton.setImageDrawable(upDownIcon);
	}

	private void setupSlider(@NonNull final View container, @NonNull final GpsFilter filter) {
		boolean range = filter.isRangeSupported();
		Slider slider = container.findViewById(R.id.filter_slider);
		RangeSlider rangeSlider = container.findViewById(R.id.filter_range_slider);

		AndroidUiHelper.updateVisibility(slider, !range);
		AndroidUiHelper.updateVisibility(rangeSlider, range);

		if (range) {
			rangeSlider.setValues(((float) filter.getSelectedMinValue()), ((float) filter.getSelectedMaxValue()));
			rangeSlider.setValueFrom((float) filter.getMinValue());
			rangeSlider.setValueTo((float) filter.getMaxValue());
			rangeSlider.addOnChangeListener((slider1, value, fromUser) -> {
				List<Float> values = rangeSlider.getValues();
				if (fromUser && values.size() == 2) {
					filter.updateValues((values.get(0)), values.get(1));
					updateDisplayedFilterNumbers(container, filter);
					app.getGpsFilterHelper().filterGpxFile();
				}
			});
			UiUtilities.setupSlider(rangeSlider, nightMode, ColorUtilities.getActiveColor(app, nightMode), false);
		} else {
			slider.setValue((float) filter.getSelectedMaxValue());
			slider.setValueFrom((float) filter.getMinValue());
			slider.setValueTo((float) filter.getMaxValue());
			slider.addOnChangeListener((slider1, value, fromUser) -> {
				if (fromUser) {
					filter.updateValue((slider.getValue()));
					updateDisplayedFilterNumbers(container, filter);
					app.getGpsFilterHelper().filterGpxFile();
				}
			});
			UiUtilities.setupSlider(slider, nightMode, ColorUtilities.getActiveColor(app, nightMode));
		}
	}

	private void updateDisplayedFilterNumbers(@NonNull View container, @NonNull GpsFilter filter) {
		TextView title = container.findViewById(R.id.filter_title);
		title.setText(filter.getFilterTitle(app));

		TextView leftText = container.findViewById(R.id.left_text);
		leftText.setText(filter.getLeftText(app));

		TextView rightText = container.findViewById(R.id.right_text);
		rightText.setText(filter.getRightText(app));
	}

	@Override
	public void onFinishFiltering() {
		FilteredSelectedGpxFile currentFilteredGpxFile = gpsFilterHelper.getCurrentFilteredGpxFile();
		if (currentFilteredGpxFile != null) {
			updatePointsRatio(currentFilteredGpxFile);
		}
	}
}