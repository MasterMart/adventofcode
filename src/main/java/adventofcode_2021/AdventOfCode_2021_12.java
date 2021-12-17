package adventofcode_2021;


import utils.AdventOfCodeUtil;

import java.util.*;
import java.util.stream.Collectors;

public class AdventOfCode_2021_12 {

	static String input = "xx-xh\n" +
			"vx-qc\n" +
			"cu-wf\n" +
			"ny-LO\n" +
			"cu-DR\n" +
			"start-xx\n" +
			"LO-vx\n" +
			"cu-LO\n" +
			"xx-cu\n" +
			"cu-ny\n" +
			"xh-start\n" +
			"qc-DR\n" +
			"vx-AP\n" +
			"end-LO\n" +
			"ny-DR\n" +
			"vx-end\n" +
			"DR-xx\n" +
			"start-DR\n" +
			"end-ny\n" +
			"ny-xx\n" +
			"xh-DR\n" +
			"cu-xh";

	static Map<String, List<String>> paths = new HashMap<>();

	static List<String> seenLowercase = new ArrayList<>();

	public static void main(String... args) {
		for (int i = 0; i < input.split("\n").length; i++) {
			String str = input.split("\n")[i];
			String str2 = str.split("-")[0];
			String str3 = str.split("-")[1];
			if (paths.containsKey(str2)) {
				List<String> pathlist = new ArrayList<>(paths.get(str2));
				if (!pathlist.contains(str3)) {
					pathlist.add(str3);
				}
				paths.put(str2, pathlist);
			} else {
				paths.put(str2, Collections.singletonList(str3));
			}

			if (paths.containsKey(str3)) {
				List<String> pathlist = new ArrayList<>(paths.get(str3));
				if (!pathlist.contains(str2)) {
					pathlist.add(str2);
				}
				paths.put(str3, pathlist);
			} else {
				paths.put(str3, Collections.singletonList(str2));
			}


		}

		List<String> lists = new ArrayList<>();
		assembleRoutes("start", false,null, "", lists);
		lists = lists.stream().filter(entry -> entry.contains("end")).collect(Collectors.toList());
		lists = lists.stream().filter(entry -> entry.endsWith("end")).collect(Collectors.toList());
		System.out.println(lists.size());



	}

	static List<String> assembleRoutes(String start, boolean hasSmallCaveBeenVisitedTwice, String smallCaveVisitedTwice, String currentRoute, List<String> routessofar) {
		if ((start.equals("start") || start.equals("end")) && currentRoute.contains(start)) {
			return routessofar;
		}

		if (hasSmallCaveBeenVisitedTwice && start.toLowerCase().equals(start) && currentRoute.contains(start)) {
			return routessofar;
		}

		if (start.toLowerCase().equals(start) && currentRoute.contains(start) && smallCaveVisitedTwice == null) {
			smallCaveVisitedTwice = start;
			hasSmallCaveBeenVisitedTwice = true;
		}
		else if (start.equals(smallCaveVisitedTwice)) {
			return routessofar;
		}

		routessofar.add(currentRoute + "," + start);

		for (String str: paths.get(start)) {
			assembleRoutes(str, hasSmallCaveBeenVisitedTwice, smallCaveVisitedTwice, currentRoute + "," + start, routessofar);
		}
		return routessofar;
	}

}
