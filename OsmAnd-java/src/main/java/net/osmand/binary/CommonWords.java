package net.osmand.binary;

import java.util.LinkedHashMap;
import java.util.Map;

public class CommonWords {
	private static Map<String, Integer> commonWordsDictionary = new LinkedHashMap<>();
	private static Map<String, Integer> frequentlyUsedWordsDictionary = new LinkedHashMap<>();
	private static void addCommon(String string) {
		commonWordsDictionary.put(string, commonWordsDictionary.size());
	}
	private static void addFrequentlyUsed(String string) {
		frequentlyUsedWordsDictionary.put(string, frequentlyUsedWordsDictionary.size());
	}
	public static int getCommon(String name) {
//		if(true) {
//			// not ready for old versions yet
//			return -1;
//		}
		Integer i = commonWordsDictionary.get(name);
		return i == null ? -1 : i.intValue();
	}

	public static int getFrequentlyUsed(String name) {
		Integer i = frequentlyUsedWordsDictionary.get(name);
		return i == null ? -1 : i.intValue();
	}

	public static int getCommonSearch(String name) {
		Integer i = commonWordsDictionary.get(name);
		return i == null ? getFrequentlyUsed(name) : i.intValue();
	}
	
	public static int getCommonGeocoding(String name) {
		Integer i = commonWordsDictionary.get(name);
		return i == null ? -1 : i.intValue();
	}
	
	static {
		addFrequentlyUsed("santa");
		addFrequentlyUsed("west");
		addFrequentlyUsed("east");
		addFrequentlyUsed("north");
		addFrequentlyUsed("northeast");
		addFrequentlyUsed("northwest");
		addFrequentlyUsed("southwest");
		addFrequentlyUsed("san");
		addFrequentlyUsed("southeast");
		addFrequentlyUsed("old");
		addFrequentlyUsed("main");
		addFrequentlyUsed("ridge");
		addFrequentlyUsed("josé");
		addFrequentlyUsed("view");
		addFrequentlyUsed("range");
		addFrequentlyUsed("pine");
		addFrequentlyUsed("church");
		addFrequentlyUsed("mill");
		addFrequentlyUsed("green");
		addFrequentlyUsed("point");
		addFrequentlyUsed("cove");
		addFrequentlyUsed("gardens");
		addFrequentlyUsed("francisco");
		addFrequentlyUsed("mountain");
		addFrequentlyUsed("jean");
		addFrequentlyUsed("joão");
		addFrequentlyUsed("meadow");
		addFrequentlyUsed("farm");
		addFrequentlyUsed("juan");
		addFrequentlyUsed("bay");
		addFrequentlyUsed("run");
		addFrequentlyUsed("national");
		addFrequentlyUsed("cedar");
		addFrequentlyUsed("hollow");
		addFrequentlyUsed("new");
		addFrequentlyUsed("high");
		addFrequentlyUsed("maple");
		addFrequentlyUsed("antonio");
		addFrequentlyUsed("walk");
		addFrequentlyUsed("maria");
		addFrequentlyUsed("spring");
		addFrequentlyUsed("pedro");
		addFrequentlyUsed("vista");
		addFrequentlyUsed("grand");
		addFrequentlyUsed("giuseppe");
		addFrequentlyUsed("antônio");
		addFrequentlyUsed("saint");
		addFrequentlyUsed("development");
		addFrequentlyUsed("washington");
		addFrequentlyUsed("john");
		addFrequentlyUsed("white");
		addFrequentlyUsed("silva");
		addFrequentlyUsed("willow");
		addFrequentlyUsed("school");
		addFrequentlyUsed("giovanni");
		addFrequentlyUsed("canyon");
		addFrequentlyUsed("general");
		addFrequentlyUsed("charles");
		addFrequentlyUsed("king");
		addFrequentlyUsed("moulin");
		addFrequentlyUsed("monte");
		addFrequentlyUsed("wood");
		addFrequentlyUsed("glen");
		addFrequentlyUsed("rock");
		addFrequentlyUsed("elm");
		addFrequentlyUsed("center");
		addFrequentlyUsed("mount");
		addFrequentlyUsed("tree");
		addFrequentlyUsed("red");
		addFrequentlyUsed("central");
		addFrequentlyUsed("norte");
		addFrequentlyUsed("delle");
		addFrequentlyUsed("église");
		addFrequentlyUsed("carlos");
		addFrequentlyUsed("springs");
		addFrequentlyUsed("doutor");
		addFrequentlyUsed("grande");
		addFrequentlyUsed("martin");
		addFrequentlyUsed("station");
		addFrequentlyUsed("statale");
		addFrequentlyUsed("alte");
		addFrequentlyUsed("paul");
		addFrequentlyUsed("hills");
		addFrequentlyUsed("beach");
		addFrequentlyUsed("brook");
		addFrequentlyUsed("walnut");
		addFrequentlyUsed("gate");
		addFrequentlyUsed("oaks");
		addFrequentlyUsed("cross");
		addFrequentlyUsed("pierre");
		addFrequentlyUsed("rural");
		addFrequentlyUsed("service");
		addFrequentlyUsed("manuel");
		addFrequentlyUsed("country");
		addFrequentlyUsed("blue");
		addFrequentlyUsed("miguel");
		addFrequentlyUsed("branch");
		addFrequentlyUsed("cherry");
		addFrequentlyUsed("don");
		addFrequentlyUsed("lincoln");
		addFrequentlyUsed("orchard");
		addFrequentlyUsed("little");
		addFrequentlyUsed("memorial");
		addFrequentlyUsed("clos");
		addFrequentlyUsed("club");
		addFrequentlyUsed("bois");
		addFrequentlyUsed("james");
		addFrequentlyUsed("ranch");
		addFrequentlyUsed("louis");
		addFrequentlyUsed("sunset");
		addFrequentlyUsed("pond");
		addFrequentlyUsed("george");
		addFrequentlyUsed("général");
		addFrequentlyUsed("costa");
		addFrequentlyUsed("santos");
		addFrequentlyUsed("victoria");
		addFrequentlyUsed("albert");
		addFrequentlyUsed("manor");
		addFrequentlyUsed("hall");
		addFrequentlyUsed("cemetery");
		addFrequentlyUsed("rose");
		addFrequentlyUsed("luis");
		addFrequentlyUsed("fox");
		addFrequentlyUsed("doctor");
		addFrequentlyUsed("long");
		addFrequentlyUsed("alameda");
		addFrequentlyUsed("smith");
		addFrequentlyUsed("padre");
		addFrequentlyUsed("woods");
		addFrequentlyUsed("villa");
		addFrequentlyUsed("lotissement");
		addFrequentlyUsed("indian");
		addFrequentlyUsed("pleasant");
		addFrequentlyUsed("jackson");
		addFrequentlyUsed("water");
		addFrequentlyUsed("wilson");
		addFrequentlyUsed("hickory");
		addFrequentlyUsed("deer");
		addFrequentlyUsed("birch");
		addFrequentlyUsed("chestnut");
		addFrequentlyUsed("eagle");
		addFrequentlyUsed("laurel");
		addFrequentlyUsed("heights");
		addFrequentlyUsed("jana");
		addFrequentlyUsed("shore");
		addFrequentlyUsed("highland");
		addFrequentlyUsed("roma");
		addFrequentlyUsed("oliveira");
		addFrequentlyUsed("garden");
		addFrequentlyUsed("château");
		addFrequentlyUsed("provincial");
		addFrequentlyUsed("thomas");
		addFrequentlyUsed("camp");
		addFrequentlyUsed("largo");
		addFrequentlyUsed("access");
		addFrequentlyUsed("georges");
		addFrequentlyUsed("college");
		addFrequentlyUsed("chapel");
		addFrequentlyUsed("house");
		addFrequentlyUsed("rosa");
		addFrequentlyUsed("johnson");
		addFrequentlyUsed("upper");
		addFrequentlyUsed("union");
		addFrequentlyUsed("crest");
		addFrequentlyUsed("gare");
		addFrequentlyUsed("market");
		addFrequentlyUsed("ленина");
		addFrequentlyUsed("jefferson");
		addFrequentlyUsed("stone");
		addFrequentlyUsed("franklin");
		addFrequentlyUsed("résidence");
		addFrequentlyUsed("francesco");
		addFrequentlyUsed("railroad");
		addFrequentlyUsed("black");
		addFrequentlyUsed("fontaine");
		addFrequentlyUsed("silver");
		addFrequentlyUsed("lower");
		addFrequentlyUsed("mile");
		addFrequentlyUsed("henri");
		addFrequentlyUsed("big");
		addFrequentlyUsed("brown");
		addFrequentlyUsed("kennedy");
		addFrequentlyUsed("pereira");
		addFrequentlyUsed("airport");
		addFrequentlyUsed("spruce");
		addFrequentlyUsed("woodland");
		addFrequentlyUsed("robert");
		addFrequentlyUsed("victor");
		addFrequentlyUsed("manoel");
		addFrequentlyUsed("meadows");
		addFrequentlyUsed("vicente");
		addFrequentlyUsed("ash");
		addFrequentlyUsed("rise");
		addFrequentlyUsed("pike");
		addFrequentlyUsed("luigi");
		addFrequentlyUsed("sant");
		addFrequentlyUsed("santo");
		addFrequentlyUsed("western");
		addFrequentlyUsed("poplar");
		addFrequentlyUsed("советская");
		addFrequentlyUsed("croix");
		addFrequentlyUsed("real");
		addFrequentlyUsed("vittorio");
		addFrequentlyUsed("mews");
		addFrequentlyUsed("taylor");
		addFrequentlyUsed("davis");
		addFrequentlyUsed("jose");
		addFrequentlyUsed("frontage");
		addFrequentlyUsed("gaulle");
		addFrequentlyUsed("bank");
		addFrequentlyUsed("ferry");
		addFrequentlyUsed("nord");
		addFrequentlyUsed("holly");
		addFrequentlyUsed("castle");
		addFrequentlyUsed("sierra");
		addFrequentlyUsed("acceso");
		addFrequentlyUsed("royal");
		addFrequentlyUsed("praça");
		addFrequentlyUsed("williams");
		addFrequentlyUsed("souza");
		addFrequentlyUsed("madison");
		addFrequentlyUsed("joseph");
		addFrequentlyUsed("riverside");
		addFrequentlyUsed("adams");
		addFrequentlyUsed("nacional");
		addFrequentlyUsed("oude");
		addFrequentlyUsed("tee");
		addFrequentlyUsed("port");
		addFrequentlyUsed("private");
		addFrequentlyUsed("mayo");
		addFrequentlyUsed("carlo");
		addFrequentlyUsed("york");
		addFrequentlyUsed("ferreira");
		addFrequentlyUsed("giacomo");
		addFrequentlyUsed("parade");
		addFrequentlyUsed("field");
		addFrequentlyUsed("professor");
		addFrequentlyUsed("jones");
		addFrequentlyUsed("maría");
		addFrequentlyUsed("lakeview");
		addFrequentlyUsed("great");
		addFrequentlyUsed("alves");
		addFrequentlyUsed("miller");
		addFrequentlyUsed("william");
		addFrequentlyUsed("henry");
		addFrequentlyUsed("coronel");
		addFrequentlyUsed("industrial");
		addFrequentlyUsed("maréchal");
		addFrequentlyUsed("acres");
		addFrequentlyUsed("joaquim");
		addFrequentlyUsed("landing");
		addFrequentlyUsed("summit");
		addFrequentlyUsed("burgemeester");
		addFrequentlyUsed("magnolia");
		addFrequentlyUsed("trace");
		addFrequentlyUsed("presidente");
		addFrequentlyUsed("falls");
		addFrequentlyUsed("jules");
		addFrequentlyUsed("docteur");
		addFrequentlyUsed("pacific");
		addFrequentlyUsed("auzoa");
		addFrequentlyUsed("prairie");
		addFrequentlyUsed("luiz");
		addFrequentlyUsed("diagonal");
		addFrequentlyUsed("cypress");
		addFrequentlyUsed("mar");
		addFrequentlyUsed("harbor");
		addFrequentlyUsed("shady");
		addFrequentlyUsed("clark");
		addFrequentlyUsed("fort");
		addFrequentlyUsed("bluff");
		addFrequentlyUsed("grant");
		addFrequentlyUsed("fork");
		addFrequentlyUsed("fire");
		addFrequentlyUsed("petit");
		addFrequentlyUsed("sycamore");
		addFrequentlyUsed("nelson");
		addFrequentlyUsed("queen");
		addFrequentlyUsed("city");
		addFrequentlyUsed("vico");
		addFrequentlyUsed("józefa");
		addFrequentlyUsed("pietro");
		addFrequentlyUsed("bear");
		addFrequentlyUsed("lima");
		addFrequentlyUsed("центральная");
		addFrequentlyUsed("pablo");
		addFrequentlyUsed("golden");
		addFrequentlyUsed("mary");
		addFrequentlyUsed("hillside");
		addFrequentlyUsed("haven");
		addFrequentlyUsed("alberto");
		addFrequentlyUsed("lorong");
		addFrequentlyUsed("elizabeth");
		addFrequentlyUsed("kings");
		addFrequentlyUsed("dogwood");
		addFrequentlyUsed("scott");
		addFrequentlyUsed("beech");
		addFrequentlyUsed("lange");
		addFrequentlyUsed("andré");
		addFrequentlyUsed("verde");
		addFrequentlyUsed("front");
		addFrequentlyUsed("obere");
		addFrequentlyUsed("hidden");
		addFrequentlyUsed("centre");
		addFrequentlyUsed("hamilton");
		addFrequentlyUsed("arthur");
		addFrequentlyUsed("parc");
		addFrequentlyUsed("quail");
		addFrequentlyUsed("julio");
		addFrequentlyUsed("jan");
		addFrequentlyUsed("bell");
		addFrequentlyUsed("sandy");
		addFrequentlyUsed("back");
		addFrequentlyUsed("sud");
		addFrequentlyUsed("paulo");
		addFrequentlyUsed("lago");
		addFrequentlyUsed("locust");
		addFrequentlyUsed("martín");
		addFrequentlyUsed("gabriel");
		addFrequentlyUsed("chase");
		addFrequentlyUsed("palm");
		addFrequentlyUsed("liberty");
		addFrequentlyUsed("mairie");
		addFrequentlyUsed("jorge");
		addFrequentlyUsed("castro");
		addFrequentlyUsed("fernando");
		addFrequentlyUsed("alter");
		addFrequentlyUsed("salvador");
		addFrequentlyUsed("hillcrest");
		addFrequentlyUsed("cité");
		addFrequentlyUsed("rodrigues");
		addFrequentlyUsed("prospect");
		addFrequentlyUsed("golf");
		addFrequentlyUsed("dom");
		addFrequentlyUsed("jacques");
		addFrequentlyUsed("berliner");
		addFrequentlyUsed("santiago");
		addFrequentlyUsed("transversal");
		addFrequentlyUsed("садовая");
		addFrequentlyUsed("guglielmo");
		addFrequentlyUsed("pointe");
		addFrequentlyUsed("circuit");
		addFrequentlyUsed("rang");
		addFrequentlyUsed("françois");
		addFrequentlyUsed("lewis");
		addFrequentlyUsed("railway");
		addFrequentlyUsed("allen");
		addFrequentlyUsed("grange");
		addFrequentlyUsed("ronda");
		addFrequentlyUsed("link");
		addFrequentlyUsed("harrison");
		addFrequentlyUsed("tower");
		addFrequentlyUsed("garibaldi");
		addFrequentlyUsed("novembre");
		addFrequentlyUsed("heritage");
		addFrequentlyUsed("anderson");
		addFrequentlyUsed("evergreen");
		addFrequentlyUsed("ribeiro");
		addFrequentlyUsed("ford");
		addFrequentlyUsed("linden");
		addFrequentlyUsed("short");
		addFrequentlyUsed("walker");
		addFrequentlyUsed("marie");
		addFrequentlyUsed("twin");
		addFrequentlyUsed("untere");
		addFrequentlyUsed("university");
		addFrequentlyUsed("douglas");
		addFrequentlyUsed("marconi");
		addFrequentlyUsed("martins");
		addFrequentlyUsed("windsor");
		addFrequentlyUsed("мира");
		addFrequentlyUsed("david");
		addFrequentlyUsed("middle");
		addFrequentlyUsed("fairview");
		addFrequentlyUsed("stanisława");
		addFrequentlyUsed("timber");
		addFrequentlyUsed("thompson");
		addFrequentlyUsed("generała");
		addFrequentlyUsed("virginia");
		addFrequentlyUsed("broad");
		addFrequentlyUsed("pasteur");
		addFrequentlyUsed("promenade");
		addFrequentlyUsed("hugo");
		addFrequentlyUsed("montée");
		addFrequentlyUsed("gomes");
		addFrequentlyUsed("warren");
		addFrequentlyUsed("luther");
		addFrequentlyUsed("columbia");
		addFrequentlyUsed("lakes");
		addFrequentlyUsed("campo");
		addFrequentlyUsed("puerto");
		addFrequentlyUsed("république");
		addFrequentlyUsed("enrico");
		addFrequentlyUsed("champ");
		addFrequentlyUsed("lawrence");
		addFrequentlyUsed("monroe");
		addFrequentlyUsed("alessandro");
		addFrequentlyUsed("władysława");
		addFrequentlyUsed("pod");
		addFrequentlyUsed("campbell");
		addFrequentlyUsed("pinto");
		addFrequentlyUsed("школьная");
		addFrequentlyUsed("estates");
		addFrequentlyUsed("howard");
		addFrequentlyUsed("orange");
		addFrequentlyUsed("croft");
		addFrequentlyUsed("star");
		addFrequentlyUsed("est");
		addFrequentlyUsed("triq");
		addFrequentlyUsed("beaver");
		addFrequentlyUsed("principale");
		addFrequentlyUsed("paz");
		addFrequentlyUsed("sol");
		addFrequentlyUsed("vieux");
		addFrequentlyUsed("southern");
		addFrequentlyUsed("greenway");
		addFrequentlyUsed("rocky");
		addFrequentlyUsed("roosevelt");
		addFrequentlyUsed("mai");
		addFrequentlyUsed("aspen");
		addFrequentlyUsed("russell");
		addFrequentlyUsed("pines");
		addFrequentlyUsed("concession");
		addFrequentlyUsed("wellington");
		addFrequentlyUsed("barrio");
		addFrequentlyUsed("neue");
		addFrequentlyUsed("post");
		addFrequentlyUsed("vale");
		addFrequentlyUsed("молодёжная");
		addFrequentlyUsed("октябрьская");
		addFrequentlyUsed("london");
		addFrequentlyUsed("four");
		addFrequentlyUsed("machado");
		addFrequentlyUsed("parque");
		addFrequentlyUsed("augusto");
		addFrequentlyUsed("carvalho");
		addFrequentlyUsed("markt");
		addFrequentlyUsed("division");
		addFrequentlyUsed("marina");
		addFrequentlyUsed("almeida");
		addFrequentlyUsed("horse");
		addFrequentlyUsed("berg");
		addFrequentlyUsed("mitchell");
		addFrequentlyUsed("pearl");
		addFrequentlyUsed("governador");
		addFrequentlyUsed("side");
		addFrequentlyUsed("robin");
		addFrequentlyUsed("iii");
		addFrequentlyUsed("vignes");
		addFrequentlyUsed("dale");
		addFrequentlyUsed("oriente");
		addFrequentlyUsed("coast");
		addFrequentlyUsed("baker");
		addFrequentlyUsed("ann");
		addFrequentlyUsed("europa");
		addFrequentlyUsed("maurice");
		addFrequentlyUsed("plac");
		addFrequentlyUsed("prince");
		addFrequentlyUsed("jardins");
		addFrequentlyUsed("ocean");
		addFrequentlyUsed("harris");
		addFrequentlyUsed("oxford");
		addFrequentlyUsed("kirchweg");
		addFrequentlyUsed("sunrise");
		addFrequentlyUsed("moore");
		addFrequentlyUsed("apple");
		addFrequentlyUsed("birkenweg");
		addFrequentlyUsed("flores");
		addFrequentlyUsed("marcel");
		addFrequentlyUsed("morgan");
		addFrequentlyUsed("ana");
		addFrequentlyUsed("cesare");
		addFrequentlyUsed("comunale");
		addFrequentlyUsed("mário");
		addFrequentlyUsed("olive");
		addFrequentlyUsed("rené");
		addFrequentlyUsed("vine");
		addFrequentlyUsed("rafael");
		addFrequentlyUsed("champs");
		addFrequentlyUsed("nova");
		addFrequentlyUsed("brasil");
		addFrequentlyUsed("privada");
		addFrequentlyUsed("barbosa");
		addFrequentlyUsed("mare");
		addFrequentlyUsed("dias");
		addFrequentlyUsed("leclerc");
		addFrequentlyUsed("daniel");
		addFrequentlyUsed("dante");
		addFrequentlyUsed("parker");
		addFrequentlyUsed("francis");
		addFrequentlyUsed("prés");
		addFrequentlyUsed("knoll");
		addFrequentlyUsed("torre");
		addFrequentlyUsed("contrada");
		addFrequentlyUsed("località");
		addFrequentlyUsed("mesa");
		addFrequentlyUsed("stade");
		addFrequentlyUsed("hampton");
		addFrequentlyUsed("alfredo");
		addFrequentlyUsed("peak");
		addFrequentlyUsed("ross");
		addFrequentlyUsed("лесная");
		addFrequentlyUsed("ivy");
		addFrequentlyUsed("filho");
		addFrequentlyUsed("mills");
		addFrequentlyUsed("major");
		addFrequentlyUsed("fratelli");
		addFrequentlyUsed("garcía");
		addFrequentlyUsed("wild");
		addFrequentlyUsed("gordon");
		addFrequentlyUsed("diego");
		addFrequentlyUsed("cerro");
		addFrequentlyUsed("cambridge");
		addFrequentlyUsed("alta");
		addFrequentlyUsed("home");
		addFrequentlyUsed("ramón");
		addFrequentlyUsed("raymond");
		addFrequentlyUsed("juniper");
		addFrequentlyUsed("redwood");
		addFrequentlyUsed("crystal");
		addFrequentlyUsed("mulberry");
		addFrequentlyUsed("новая");
		addFrequentlyUsed("poniente");
		addFrequentlyUsed("alten");
		addFrequentlyUsed("гагарина");
		addFrequentlyUsed("bellevue");
		addFrequentlyUsed("veterans");
		addFrequentlyUsed("hope");
		addFrequentlyUsed("jaurès");
		addFrequentlyUsed("summer");
		addFrequentlyUsed("bahnhof");
		addFrequentlyUsed("r-c");
		addFrequentlyUsed("oakwood");
		addFrequentlyUsed("richmond");
		addFrequentlyUsed("paris");
		addFrequentlyUsed("lorenzo");
		addFrequentlyUsed("hof");
		addFrequentlyUsed("mariano");
		addFrequentlyUsed("navajo");
		addFrequentlyUsed("комсомольская");
		addFrequentlyUsed("kleine");
		addFrequentlyUsed("lodge");
		addFrequentlyUsed("torres");
		addFrequentlyUsed("leśna");
		addFrequentlyUsed("cardinal");
		addFrequentlyUsed("marsh");
		addFrequentlyUsed("fern");
		addFrequentlyUsed("campos");
		addFrequentlyUsed("nationale");
		addFrequentlyUsed("berry");
		addFrequentlyUsed("commerce");
		addFrequentlyUsed("ignacio");
		addFrequentlyUsed("acesso");
		addFrequentlyUsed("madrid");
		addFrequentlyUsed("mission");
		addFrequentlyUsed("gang");
		addFrequentlyUsed("oeste");
		addFrequentlyUsed("cherokee");
		addFrequentlyUsed("paolo");
		addFrequentlyUsed("stewart");
		addFrequentlyUsed("cliff");
		addFrequentlyUsed("eduardo");
		addFrequentlyUsed("marshall");
		addFrequentlyUsed("dam");
		addFrequentlyUsed("pioneer");
		addFrequentlyUsed("alfred");
		addFrequentlyUsed("greenwood");
		addFrequentlyUsed("robinson");
		addFrequentlyUsed("acacias");
		addFrequentlyUsed("lópez");
		addFrequentlyUsed("tadeusza");
		addFrequentlyUsed("leonardo");
		addFrequentlyUsed("hilltop");
		addFrequentlyUsed("diamond");
		addFrequentlyUsed("quarry");
		addFrequentlyUsed("het");
		addFrequentlyUsed("temple");
		addFrequentlyUsed("scenic");
		addFrequentlyUsed("alexander");
		addFrequentlyUsed("победы");
		addFrequentlyUsed("osiedle");
		addFrequentlyUsed("écoles");
		addFrequentlyUsed("cleveland");
		addFrequentlyUsed("lynn");
		addFrequentlyUsed("top");
		addFrequentlyUsed("mont");
		addFrequentlyUsed("polna");
		addFrequentlyUsed("leaf");
		addFrequentlyUsed("vieira");
		addFrequentlyUsed("cottonwood");
		addFrequentlyUsed("perry");
		addFrequentlyUsed("morris");
		addFrequentlyUsed("oberer");
		addFrequentlyUsed("domingo");
		addFrequentlyUsed("hawthorne");
		addFrequentlyUsed("autumn");
		addFrequentlyUsed("alto");
		addFrequentlyUsed("chapelle");
		addFrequentlyUsed("kelly");
		addFrequentlyUsed("sherwood");
		addFrequentlyUsed("garcia");
		addFrequentlyUsed("bruce");
		addFrequentlyUsed("cour");
		addFrequentlyUsed("petite");
		addFrequentlyUsed("gap");
		addFrequentlyUsed("sea");
		addFrequentlyUsed("émile");
		addFrequentlyUsed("murray");
		addFrequentlyUsed("tangenziale");
		addFrequentlyUsed("mühlenweg");
		addFrequentlyUsed("gonçalves");
		addFrequentlyUsed("eastern");
		addFrequentlyUsed("belle");
		addFrequentlyUsed("northern");
		addFrequentlyUsed("xxiii");
		addFrequentlyUsed("vicinale");
		addFrequentlyUsed("hemlock");
		addFrequentlyUsed("hunter");
		addFrequentlyUsed("лет");
		addFrequentlyUsed("roberts");
		addFrequentlyUsed("heather");
		addFrequentlyUsed("bernardo");
		addFrequentlyUsed("verte");
		addFrequentlyUsed("arbor");
		addFrequentlyUsed("puits");
		addFrequentlyUsed("mine");
		addFrequentlyUsed("stefana");
		addFrequentlyUsed("güterweg");
		addFrequentlyUsed("newton");
		addFrequentlyUsed("кирова");
		addFrequentlyUsed("riverview");
		addFrequentlyUsed("clay");
		addFrequentlyUsed("sint");
		addFrequentlyUsed("aldo");
		addFrequentlyUsed("tilleuls");
		addFrequentlyUsed("claude");
		addFrequentlyUsed("kossuth");
		addFrequentlyUsed("edward");
		addFrequentlyUsed("communale");
		addFrequentlyUsed("fuente");
		addFrequentlyUsed("cooper");
		addFrequentlyUsed("trails");
		addFrequentlyUsed("nieuwe");
		addFrequentlyUsed("sebastião");
		addFrequentlyUsed("roberto");
		addFrequentlyUsed("overlook");
		addFrequentlyUsed("первомайская");
		addFrequentlyUsed("roger");
		addFrequentlyUsed("turner");
		addFrequentlyUsed("france");
		addFrequentlyUsed("mario");
		addFrequentlyUsed("iv");
		addFrequentlyUsed("sugar");
		addFrequentlyUsed("hudson");
		addFrequentlyUsed("lopes");
		addFrequentlyUsed("evans");
		addFrequentlyUsed("cottage");
		addFrequentlyUsed("raya");
		addFrequentlyUsed("branco");
		addFrequentlyUsed("vernon");
		addFrequentlyUsed("traverse");
		addFrequentlyUsed("emerald");
		addFrequentlyUsed("dove");
		addFrequentlyUsed("felipe");
		addFrequentlyUsed("wildwood");
		addFrequentlyUsed("moro");
		addFrequentlyUsed("marechal");
		addFrequentlyUsed("köz");
		addFrequentlyUsed("marion");
		addFrequentlyUsed("marco");
		addFrequentlyUsed("léon");
		addFrequentlyUsed("mt");
		addFrequentlyUsed("veneto");
		addFrequentlyUsed("mazzini");
		addFrequentlyUsed("plum");
		addFrequentlyUsed("boundary");
		addFrequentlyUsed("barros");
		addFrequentlyUsed("tour");
		addFrequentlyUsed("andrews");
		addFrequentlyUsed("wiesenweg");
		addFrequentlyUsed("maggio");
		addFrequentlyUsed("ricardo");
		addFrequentlyUsed("pennsylvania");
		addFrequentlyUsed("myrtle");
		addFrequentlyUsed("matteotti");
		addFrequentlyUsed("hinter");
		addFrequentlyUsed("линия");
		addFrequentlyUsed("ouest");
		addFrequentlyUsed("maja");
		addFrequentlyUsed("kent");
		addFrequentlyUsed("stanley");
		addFrequentlyUsed("jacob");
		addFrequentlyUsed("principal");
		addFrequentlyUsed("rogers");
		addFrequentlyUsed("homestead");
		addFrequentlyUsed("collins");
		addFrequentlyUsed("richard");
		addFrequentlyUsed("crown");
		addFrequentlyUsed("moss");
		addFrequentlyUsed("moreno");
		addFrequentlyUsed("garfield");
		addFrequentlyUsed("belmont");
		addFrequentlyUsed("rolling");
		addFrequentlyUsed("sportplatz");
		addFrequentlyUsed("côte");
		addFrequentlyUsed("hospital");
		addFrequentlyUsed("sun");
		addFrequentlyUsed("горького");
		addFrequentlyUsed("flat");
		addFrequentlyUsed("colonial");
		addFrequentlyUsed("ramos");
		addFrequentlyUsed("lilas");
		addFrequentlyUsed("mason");
		addFrequentlyUsed("forge");
		addFrequentlyUsed("shadow");
		addFrequentlyUsed("gold");
		addFrequentlyUsed("rocha");
		addFrequentlyUsed("linda");
		addFrequentlyUsed("young");
		addFrequentlyUsed("estate");
		addFrequentlyUsed("martiri");
		addFrequentlyUsed("verdi");
		addFrequentlyUsed("augusta");



		addCommon("la");
		addCommon("via");
		addCommon("rua");
		addCommon("de");
		addCommon("du");
		addCommon("des");
		addCommon("del");
		addCommon("am");
		addCommon("da");
		addCommon("a");
		addCommon("der");
		addCommon("do");
		addCommon("los");
		addCommon("di");
		addCommon("im");
		addCommon("el");
		addCommon("e");
		addCommon("an");
		addCommon("g.");
		addCommon("rd");
		addCommon("dos");
		addCommon("dei");
		addCommon("b");
		addCommon("st");
		addCommon("the");
		addCommon("las");
		addCommon("f");
		addCommon("u");
		addCommon("jl.");
		addCommon("j");
		addCommon("sk");
		addCommon("w");
		addCommon("a.");
		addCommon("of");
		addCommon("k");
		addCommon("r");
		addCommon("h");
		addCommon("mc");
		addCommon("sw");
		addCommon("g");
		addCommon("v");
		addCommon("m");
		addCommon("c.");
		addCommon("r.");
		addCommon("ct");
		addCommon("e.");
		addCommon("dr.");
		addCommon("j.");
		addCommon("in");
		addCommon("al");
		addCommon("út");
		addCommon("per");
		addCommon("ne");
		addCommon("p");
		addCommon("et");
		addCommon("s.");
		addCommon("f.");
		addCommon("t");
		addCommon("fe");
		addCommon("à");
		addCommon("i");
		addCommon("c");
		addCommon("le");
		addCommon("s");
		addCommon("av.");
		addCommon("den");
		addCommon("dr");
		addCommon("y");
		addCommon("un");
		addCommon("nw");

		
		
		addCommon("van");
		addCommon("road");
		addCommon("street");
		addCommon("drive");
		addCommon("avenue");
		addCommon("rue");
		addCommon("lane");
		addCommon("улица");
		addCommon("спуск");
		addCommon("straße");
		addCommon("chemin");
		addCommon("way");

		addCommon("court");
		addCommon("calle");

		addCommon("place");

		addCommon("avenida");
		addCommon("boulevard");
		addCommon("county");
		addCommon("route");
		addCommon("trail");
		addCommon("circle");
		addCommon("close");
		addCommon("highway");
		
		addCommon("strada");
		addCommon("impasse");
		addCommon("utca");
		addCommon("creek");
		addCommon("carrer");
		addCommon("вулиця");
		addCommon("allée");
		addCommon("weg");
		addCommon("площадь");
		addCommon("тупик");

		addCommon("terrace");
		addCommon("jalan");
		
		addCommon("parkway");
		addCommon("переулок");
		
		addCommon("carretera");
		addCommon("valley");
		
		addCommon("camino");
		addCommon("viale");
		addCommon("loop");
		
		addCommon("bridge");
		addCommon("embankment");
		addCommon("township");
		addCommon("town");
		addCommon("village");
		addCommon("piazza");
		addCommon("della");
		
		addCommon("plaza");
		addCommon("pasaje");
		addCommon("expressway");
		addCommon("ruta");
		addCommon("square");
		addCommon("freeway");
		addCommon("line");
		
		addCommon("track");
		
		addCommon("zum");
		addCommon("rodovia");
		addCommon("sokak");
		addCommon("sur");
		addCommon("path");
		addCommon("das");
		
		addCommon("yolu");
		
		addCommon("проспект");

		addCommon("auf");
		addCommon("alley");
		addCommon("são");
		addCommon("les");
		addCommon("paseo");
		addCommon("autostrada");
		addCommon("iela");
		addCommon("autovía");
		addCommon("d");
		addCommon("ulica");
		
		addCommon("na");
		addCommon("проезд");
		addCommon("n");
		addCommon("ул.");
		addCommon("voie");
		addCommon("ring");
		addCommon("ruelle");
		addCommon("vicolo");
		addCommon("avinguda");
		addCommon("шоссе");
		addCommon("zur");
		addCommon("corso");
		addCommon("autopista");
		addCommon("провулок");
		addCommon("broadway");
		addCommon("to");
		addCommon("passage");
		addCommon("sentier");
		addCommon("aleja");
		addCommon("dem");
		addCommon("valle");
		addCommon("cruz");

		addCommon("bypass");
		addCommon("rúa");
		addCommon("crest");
		addCommon("ave");
		
		addCommon("turnpike");

		addCommon("autoroute");
		addCommon("crossing");
		addCommon("camí");
		addCommon("bend");
		
		addCommon("end");
		addCommon("caddesi");
		addCommon("bis");
		
		addCommon("ქუჩა");
		addCommon("kalea");
		addCommon("pass");
		addCommon("ponte");
		addCommon("cruce");
		addCommon("se");
		addCommon("au");

		addCommon("allee");
		addCommon("autobahn");
		addCommon("väg");
		addCommon("sentiero");
		addCommon("plaça");
		addCommon("o");
		addCommon("vej");
		addCommon("aux");
		addCommon("spur");
		addCommon("ringstraße");
		addCommon("lindenstraße");
		addCommon("kirchstraße");
		addCommon("bergstraße");
		addCommon("mühlenstraße");
		addCommon("industriestraße");
		addCommon("schillerstraße");
		addCommon("talstraße");
		addCommon("gartenstraße");
		addCommon("prospect");
		addCommon("m.");
		addCommon("chaussee");
		addCommon("row");
		addCommon("link");
	
		addCommon("travesía");
		addCommon("degli");
		addCommon("piazzale");
		addCommon("vei");
		addCommon("waldstraße");
		addCommon("promenade");
		addCommon("puente");
		addCommon("rond-point");
		addCommon("vía");
		addCommon("pod");
		addCommon("triq");
		addCommon("hwy");
		addCommon("οδός");
		addCommon("dels");
		addCommon("and");

		addCommon("pré");
		addCommon("plac");
		addCommon("fairway");
	
// 		addCommon("farm-to-market");

		addCommon("набережная");

		addCommon("chaussée");

		addCommon("náměstí");
		addCommon("tér");
		addCommon("roundabout");
		addCommon("lakeshore");
		addCommon("lakeside");
		addCommon("alle");
		addCommon("gasse");
		addCommon("str.");
//		addCommon("p.");
		addCommon("ville");
		addCommon("beco");
		addCommon("platz");

// 		addCommon("porto");

		addCommon("sideroad");
		addCommon("pista");

		addCommon("аллея");
		addCommon("бульвар");
		addCommon("город");
		addCommon("городок");
		addCommon("деревня");
		addCommon("дер.");
		addCommon("пос.");
		addCommon("дорога");
		addCommon("дорожка");
		addCommon("кольцо");
		addCommon("мост");
		addCommon("остров");
		addCommon("островок");
		addCommon("поселок");
		addCommon("посёлок");
		addCommon("путепровод");
		addCommon("слобода");
		addCommon("станция");
		addCommon("тоннель");
		addCommon("тракт");
		addCommon("island");
		addCommon("islet");
		addCommon("tunnel");
		addCommon("stadt");
		addCommon("brücke");
		addCommon("damm");
		addCommon("insel");
		addCommon("dorf");
		addCommon("bereich");
		addCommon("überführung");
		addCommon("bulevar");
		addCommon("ciudad");
		addCommon("pueblo");
		addCommon("anillo");
		addCommon("muelle");
		addCommon("isla");
		addCommon("islote");
		addCommon("carril");
		addCommon("viaje");
		addCommon("città");
		addCommon("paese");
		addCommon("villaggio");
		addCommon("banchina");
		addCommon("isola");
		addCommon("isolotto");
		addCommon("corsia");
		addCommon("viaggio");
		addCommon("canale");
		addCommon("pont");
		addCommon("quai");
		addCommon("île");
		addCommon("îlot");
		addCommon("voyage");
		addCommon("descente");
		addCommon("straat");
		addCommon("stad");
		addCommon("dorp");
		addCommon("brug");
		addCommon("kade");
		addCommon("eiland");
		addCommon("eilandje");
		addCommon("laan");
		addCommon("plein");
		addCommon("reizen");
		addCommon("afkomst");
		addCommon("kanaal");
		addCommon("doodlopende");
		addCommon("stradă");
		addCommon("rutier");
		addCommon("alee");
		addCommon("municipiu");
		addCommon("oras");
		addCommon("drumuri");
		addCommon("poduri");
		addCommon("cheu");
		addCommon("insula");
		addCommon("ostrov");
		addCommon("sat");
		addCommon("călătorie");
		addCommon("coborâre");
		addCommon("statie");
		addCommon("tunel");
		addCommon("fundătură");
		addCommon("ulice");
		addCommon("silnice");
		addCommon("bulvár");
		addCommon("město");
		addCommon("obec");
		addCommon("most");
		addCommon("nábřeží");
		addCommon("ostrova");
		addCommon("ostrůvek");
		addCommon("vesnice");
		addCommon("jezdit");
		addCommon("sestup");
		addCommon("nádraží");
		addCommon("kanál");
		addCommon("ulička");
		addCommon("gata");
		addCommon("by");
		addCommon("bro");
		addCommon("kaj");
		addCommon("ö");
		addCommon("holme");
		addCommon("fyrkant");
		addCommon("resa");
		addCommon("härkomst");
		addCommon("kanal");
		addCommon("återvändsgränd");
		addCommon("cesty");
		addCommon("ostrovček");
		addCommon("námestie");
		addCommon("dediny");
		addCommon("jazdiť");
		addCommon("zostup");
		addCommon("stanice");
		addCommon("cesta");
		addCommon("pot");
		addCommon("mesto");
		addCommon("kraj");
		addCommon("vas");
		addCommon("pomol");
		addCommon("otok");
		addCommon("otoček");
		addCommon("trg");
		addCommon("potovanje");
		addCommon("spust");
		addCommon("postaja");
		addCommon("predor");
		addCommon("вуліца");
		addCommon("шаша");
		addCommon("алея");
		addCommon("горад");
		addCommon("мястэчка");
		addCommon("вёска");
		addCommon("дарога");
		addCommon("набярэжная");
		addCommon("востраў");
		addCommon("астравок");
		addCommon("завулак");
		addCommon("плошча");
		addCommon("пасёлак");
		addCommon("праезд");
		addCommon("праспект");
		addCommon("станцыя");
		addCommon("тунэль");
		addCommon("тупік");
		addCommon("افي.");
		addCommon("إلى");
		addCommon("تسوية");
		addCommon("جادة");
		addCommon("جزيرة");
		addCommon("جسر");
		addCommon("زقاق");
		addCommon("شارع");
		addCommon("طريق");
		addCommon("قرية");
		addCommon("مأزق");
		addCommon("محطة");
		addCommon("مدينة");
		addCommon("مرور");
		addCommon("مسار");
		addCommon("ممر");
		addCommon("منطقة");
		addCommon("نفق");
		addCommon("път");
		addCommon("булевард");
		addCommon("град");
		addCommon("село");
		addCommon("кей");
		addCommon("островче");
		addCommon("платно");
		addCommon("квадрат");
		addCommon("пътуване");
		addCommon("произход");
		addCommon("гара");
		addCommon("тунел");
		addCommon("канал");
		addCommon("körút");
		addCommon("híd");
		addCommon("rakpart");
		addCommon("állomás");
		addCommon("alagút");
		addCommon("đường");
		addCommon("đại");
		addCommon("làng");
		addCommon("cầu");
		addCommon("đảo");
		addCommon("phố");
		addCommon("gốc");
		addCommon("kênh");
		addCommon("δρόμο");
		addCommon("λεωφόρος");
		addCommon("πόλη");
		addCommon("κωμόπολη");
		addCommon("χωριό");
		addCommon("δρόμος");
		addCommon("γέφυρα");
		addCommon("αποβάθρα");
		addCommon("νησί");
		addCommon("νησίδα");
		addCommon("λωρίδα");
		addCommon("πλατεία");
		addCommon("χωριό");
		addCommon("ταξίδια");
		addCommon("ø");
		addCommon("bane");

	}


	
}
