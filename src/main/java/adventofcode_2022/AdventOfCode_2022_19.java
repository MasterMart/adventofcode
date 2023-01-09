//package adventofcode_2022;
//
//
//import utils.AdventOfCodeUtil;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class AdventOfCode_2022_19 {
//
//
//	static Map<Integer, Map<String, oreCosts>> blueprints = new HashMap<>();
//
//    static Map<String, Integer> robots = new HashMap<>();
//	static Map<String, Integer> temprobots = new HashMap<>();
//	static Map<String, Integer> ores = new HashMap<>();
//
//	static Map<Integer, Integer> blueprintresults = new HashMap<>();
//
//	static {
//        robots.put("ore robot", 1);
//		robots.put("clay robot", 0);
//		robots.put("obsidian robot", 0);
//		robots.put("geode robot", 0);
//
//		ores.put("ore", 0);
//		ores.put("clay", 0);
//		ores.put("obsidian", 0);
//		ores.put("geode", 0);
//
//    }
//
//
//    static String input = "Blueprint 1:Each ore robot costs 4 ore.Each clay robot costs 2 ore. Each obsidian robot costs 3 ore and 14 clay.Each geode robot costs 2 ore and 7 obsidian." +
//            "\n" +
//            "Blueprint 2:Each ore robot costs 2 ore.Each clay robot costs 3 ore.Each obsidian robot costs 3 ore and 8 clay. Each geode robot costs 3 ore and 12 obsidian.";
//
//    public static void main(String... args) {
//        int total = 0;
//
//        for (int i = 0; i < input.split("\n").length; i++) {
//
//			Map<String, oreCosts> stringoreCostsMap = new HashMap<>();
//
//			String ii = input.split("\n")[i];
//			int blueprint = AdventOfCodeUtil.getFirstNumberOfString(ii.split("Blueprint")[1]);
//
//			oreCosts oreCosts = new oreCosts();
//            oreCosts.ore = AdventOfCodeUtil.getFirstNumberOfString(ii.split(" ore robot costs ")[1]);
//            stringoreCostsMap.put("ore robot", oreCosts);
//
//            oreCosts oreCosts2 = new oreCosts();
//			oreCosts2.ore = AdventOfCodeUtil.getFirstNumberOfString(ii.split(" clay robot costs ")[1]);
//            stringoreCostsMap.put("clay robot", oreCosts2);
//
//            oreCosts oreCosts3 = new oreCosts();
//			oreCosts3.ore = AdventOfCodeUtil.getFirstNumberOfString(ii.split(" obsidian robot costs ")[1]);
//			oreCosts3.clay = AdventOfCodeUtil.getSecondNumberOfString(ii.split(" obsidian robot costs ")[1]);
//            stringoreCostsMap.put("obsidian robot", oreCosts3);
//
//            oreCosts orecosts4 = new oreCosts();
//			orecosts4.ore = AdventOfCodeUtil.getFirstNumberOfString(ii.split(" geode robot costs ")[1]);
//			orecosts4.obsidian = AdventOfCodeUtil.getSecondNumberOfString(ii.split(" geode robot costs ")[1]);
//            stringoreCostsMap.put("geode robot", orecosts4);
//			blueprints.put(blueprint, stringoreCostsMap);
//        }
//
//		for (Map.Entry<Integer, Map<String, oreCosts>> entry: blueprints.entrySet()) {
//			int blueprint = entry.getKey();
//			Map<String, oreCosts> stringoreCostsMap = entry.getValue();
//			for (int i = 0; i < 24; i++) {
//
//				oreCosts oreCosts = stringoreCostsMap.get("geode robot");
//				if (canAfford(oreCosts, ores)) {
//					int geoderobots = robots.get("geode robot");
//					temprobots.put("geode robot", ++geoderobots);
//
//					int ore = ores.get("ore");
//					ore -= oreCosts.ore;
//					ores.put("ore", ore);
//
//					int obsidian = ores.get("obsidian");
//					obsidian -= oreCosts.obsidian;
//					ores.put("obsidian", obsidian);
//				}
//
//				oreCosts oreCosts2 = stringoreCostsMap.get("obsidian robot");
//				if (canAfford(oreCosts2, ores) && shouldBuild(i, ores, stringoreCostsMap, "obsidian robot", robots)) {
//					int obsidianrobots = robots.get("obsidian robot");
//					temprobots.put("obsidian robot", ++obsidianrobots);
//
//					int ore = ores.get("ore");
//					ore -= oreCosts.ore;
//					ores.put("ore", ore);
//
//					int clay = ores.get("clay");
//					clay -= oreCosts.clay;
//					ores.put("clay", clay);
//				}
//
//				oreCosts oreCosts3 = stringoreCostsMap.get("clay robot");
//				if (canAfford(oreCosts3, ores) && shouldBuild(i, ores, stringoreCostsMap, "clay robot", robots)) {
//					int clayrobots = robots.get("clay robot");
//					temprobots.put("clay robot", ++clayrobots);
//
//					int ore = ores.get("ore");
//					ore -= oreCosts.ore;
//					ores.put("ore", ore);
//				}
//
//				oreCosts oreCosts4 = stringoreCostsMap.get("ore robot");
//				if (canAfford(oreCosts4, ores) && shouldBuild(i, ores, stringoreCostsMap, "ore robot", robots)) {
//					int orerobots = robots.get("ore robot");
//					temprobots.put("ore robot", ++orerobots);
//
//					int ore = ores.get("ore");
//					ore -= oreCosts.ore;
//					ores.put("ore", ore);
//				}
//
//
//				if (ores.containsKey("ore")) {
//					int ores2 = ores.get("ore");
//					ores2 += robots.get("ore robot");
//					ores.put("ore", ores2);
//				} else {
//					ores.put("ore", robots.get("ore robot"));
//				}
//
//				if (ores.containsKey("clay")) {
//					int ores2 = ores.get("clay");
//					ores2 += robots.get("clay robot");
//					ores.put("clay", ores2);
//				} else {
//					ores.put("clay", robots.get("clay robot"));
//				}
//
//				if (ores.containsKey("obsidian")) {
//					int ores2 = ores.get("obsidian");
//					ores2 += robots.get("obsidian robot");
//					ores.put("obsidian", ores2);
//				} else {
//					ores.put("obsidian", robots.get("obsidian robot"));
//				}
//
//				if (ores.containsKey("geode")) {
//					int ores2 = ores.get("geode");
//					ores2 += robots.get("geode robot");
//					ores.put("geode", ores2);
//				} else {
//					ores.put("geode", robots.get("geode robot"));
//				}
//
//				for (Map.Entry<String, Integer> entry2 : temprobots.entrySet()) {
//					int robot2s = robots.get(entry2.getKey());
//					robots.put(entry2.getKey(), ++robot2s);
//				}
//				temprobots = new HashMap<>();
//			}
//			blueprintresults.put(blueprint, ores.get("geode"));
//		}
//
//		for (Map.Entry<Integer, Integer> entry: blueprintresults.entrySet()) {
//			total += entry.getValue() * entry.getKey();
//		}
//
//		System.out.println(total);
//
//
//    }
//
//    static class oreCosts {
//        public int ore;
//        public int clay;
//        public int obsidian;
//    }
//
//	static boolean canAfford(oreCosts oreCosts, Map<String, Integer> ores) {
//		if (ores.get("ore") < oreCosts.ore || oreCosts.clay > ores.get("clay") || oreCosts.obsidian > ores.get("obsidian")) {
//			return false;
//		}
//		return true;
//	}
//
//	static boolean shouldBuild(int i, Map<String, Integer> ores, Map<String, oreCosts> stringoreCostsMap, String robot, Map<String, Integer> robots) {
//		int totaleverneeded = 0;
//		int totalwillproduce = 0;
//		if (robot.equals("ore robot")) {
//			for (Map.Entry<String, oreCosts> entry: stringoreCostsMap.entrySet()) {
//				if (entry.getValue().ore > totaleverneeded) {
//					totaleverneeded = entry.getValue().ore;
//				}
//			}
//			totaleverneeded *= (24 -  (i + 1));
//			totalwillproduce = ores.get("ore") + (robots.get("ore robot") + 1) * (24 - (i + 1));
//		}
//
//		if (robot.equals("clay robot")) {
//			totaleverneeded = stringoreCostsMap.get("obsidian robot").clay;
//			totaleverneeded *= (24 -  (i + 1));
//			totalwillproduce = ores.get("clay") + (robots.get("clay robot") + 1) * (24 - (i + 1));
//		}
//
//		if (robot.equals("obsidian robot")) {
//			totaleverneeded = stringoreCostsMap.get("geode robot").obsidian;
//			totaleverneeded *= (24 -  (i + 1));
//			totalwillproduce = ores.get("obsidian") + (robots.get("obsidian robot") + 1) * (24 - (i + 1));
//		}
//
//		if (totalwillproduce > totaleverneeded) {
//			return false;
//		}
//		return true;
//	}
//
//	static boolean robotNeeded(String robot, int i, Map<String, Integer> ores, Map<String, Integer> robots, Map<String, oreCosts> stringoreCostsMap) {
//		if (robot.equals("obsidian robot")) {
//			int obsidian = ores.get("obsidian");
//			int obsrobots = robots.get("obsidian robot");
//
//			for (int j = i; j < 24; j++) {
//
//				if (canAfford(stringoreCostsMap.get("geode robot"), ores)) {
//					obsrobots++;
//				}
//			}
//		}
//	}
//
//}
