package net.osmand.plus.plugins.openseamaps;

import static net.osmand.aidlapi.OsmAndCustomizationConstants.PLUGIN_NAUTICAL;

import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import net.osmand.plus.OsmandApplication;
import net.osmand.plus.R;
import net.osmand.plus.activities.MapActivity;
import net.osmand.plus.dashboard.DashboardOnMap;
import net.osmand.plus.dashboard.DashboardOnMap.DashboardType;
import net.osmand.plus.download.LocalIndexHelper;
import net.osmand.plus.download.LocalIndexHelper.LocalIndexType;
import net.osmand.plus.download.LocalIndexInfo;
import net.osmand.plus.plugins.OsmandPlugin;
import net.osmand.plus.plugins.PluginsHelper;
import net.osmand.plus.render.RendererRegistry;
import net.osmand.plus.settings.backend.ApplicationMode;
import net.osmand.plus.settings.backend.preferences.CommonPreference;
import net.osmand.plus.widgets.ctxmenu.ContextMenuAdapter;
import net.osmand.plus.widgets.ctxmenu.callback.ItemClickListener;
import net.osmand.plus.widgets.ctxmenu.callback.OnDataChangeUiAdapter;
import net.osmand.plus.widgets.ctxmenu.callback.OnRowItemClick;
import net.osmand.plus.widgets.ctxmenu.data.ContextMenuItem;
import net.osmand.render.RenderingRuleProperty;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class NauticalMapsPlugin extends OsmandPlugin {

	public static final String COMPONENT = "net.osmand.nauticalPlugin";
	public static final String DEPTH_CONTOURS = "depthContours";

	public NauticalMapsPlugin(OsmandApplication app) {
		super(app);
	}

	@Override
	public int getLogoResourceId() {
		return R.drawable.ic_plugin_nautical_map;
	}

	@Override
	public Drawable getAssetResourceImage() {
		return app.getUIUtilities().getIcon(R.drawable.nautical_map);
	}

	@Override
	public boolean isMarketPlugin() {
		return true;
	}

	@Override
	public String getComponentId1() {
		return COMPONENT;
	}

	@Override
	public CharSequence getDescription() {
		return app.getString(net.osmand.plus.R.string.plugin_nautical_descr);
	}

	@Override
	public String getName() {
		return app.getString(net.osmand.plus.R.string.plugin_nautical_name);
	}

	@Override
	public String getHelpFileName() {
		return "feature_articles/nautical-charts.html";
	}

	@Override
	public List<ApplicationMode> getAddedAppModes() {
		return Collections.singletonList(ApplicationMode.BOAT);
	}

	@Override
	public List<String> getRendererNames() {
		return Collections.singletonList(RendererRegistry.NAUTICAL_RENDER);
	}

	@Override
	public List<String> getRouterNames() {
		return Collections.singletonList("boat");
	}

	@Override
	public String getId() {
		return PLUGIN_NAUTICAL;
	}

	@Override
	public void registerLayerContextMenuActions(@NonNull ContextMenuAdapter menuAdapter, @NonNull MapActivity mapActivity, @NonNull List<RenderingRuleProperty> customRules) {
		LocalIndexHelper helper = new LocalIndexHelper(app);
		if (!isEnabled()) {
			List<LocalIndexInfo> locals = helper.getLocalIndexData(true, true, null);
			for (LocalIndexInfo info : locals) {
				if (info.getType() == LocalIndexType.DEPTH_DATA) {
					createNauticalItem(menuAdapter, mapActivity, customRules);
				}
			}
		} else {
			createNauticalItem(menuAdapter, mapActivity, customRules);
		}
	}

	private void createNauticalItem(ContextMenuAdapter adapter,
	                                MapActivity mapActivity, List<RenderingRuleProperty> customRules) {
		Iterator<RenderingRuleProperty> iterator = customRules.iterator();
		while (iterator.hasNext()) {
			RenderingRuleProperty property = iterator.next();
			if (DEPTH_CONTOURS.equals(property.getAttrName())) {
				CommonPreference<Boolean> pref = app.getSettings().getCustomRenderBooleanProperty(property.getAttrName());
				ItemClickListener listener = new OnRowItemClick() {

					@Override
					public boolean onRowItemClick(@NonNull OnDataChangeUiAdapter uiAdapter,
					                              @NonNull View view, @NonNull ContextMenuItem item) {
						DashboardOnMap dashboard = mapActivity.getDashboard();
						dashboard.setDashboardVisibility(true, DashboardType.NAUTICAL_DEPTH);
						return false;
					}

					@Override
					public boolean onContextMenuClick(@Nullable OnDataChangeUiAdapter uiAdapter,
					                                  @Nullable View view, @NotNull ContextMenuItem item,
					                                  boolean isChecked) {
						pref.set(isChecked);
						item.setSelected(pref.get());
						item.setColor(app, pref.get() ? R.color.osmand_orange : ContextMenuItem.INVALID_ID);
						item.setDescription(app.getString(isChecked ? R.string.shared_string_enabled : R.string.shared_string_disabled));
						uiAdapter.onDataSetChanged();
						mapActivity.refreshMapComplete();
						return true;
					}
				};

				adapter.addItem(new ContextMenuItem(DEPTH_CONTOURS)
						.setTitleId(R.string.nautical_depth, mapActivity)
						.setDescription(app.getString(pref.get() ? R.string.shared_string_enabled : R.string.shared_string_disabled))
						.setSelected(pref.get())
						.setColor(app, pref.get() ? R.color.osmand_orange : ContextMenuItem.INVALID_ID)
						.setIcon(R.drawable.ic_action_nautical_depth)
						.setSecondaryIcon(R.drawable.ic_action_additional_option)
						.setListener(listener));

				iterator.remove();
			}
		}
	}
}