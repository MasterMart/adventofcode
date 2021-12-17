package adventofcode_2020;


import utils.AdventOfCodeUtil;

import java.util.*;

public class AdventOfCode_2020_19 {

	static String input = "42: 9 14 | 10 1\n" +
			"9: 14 27 | 1 26\n" +
			"10: 23 14 | 28 1\n" +
			"1: \"a\"\n" +
			"11: 42 31 | 42 11 31\n" +
			"5: 1 14 | 15 1\n" +
			"19: 14 1 | 14 14\n" +
			"12: 24 14 | 19 1\n" +
			"16: 15 1 | 14 14\n" +
			"31: 14 17 | 1 13\n" +
			"6: 14 14 | 1 14\n" +
			"2: 1 24 | 14 4\n" +
			"0: 8 11\n" +
			"13: 14 3 | 1 12\n" +
			"15: 1 | 14\n" +
			"17: 14 2 | 1 7\n" +
			"23: 25 1 | 22 14\n" +
			"28: 16 1\n" +
			"4: 1 1\n" +
			"20: 14 14 | 1 15\n" +
			"3: 5 14 | 16 1\n" +
			"27: 1 6 | 14 18\n" +
			"14: \"b\"\n" +
			"21: 14 1 | 1 14\n" +
			"25: 1 1 | 1 14\n" +
			"22: 14 14\n" +
			"8: 42 | 42 8\n" +
			"26: 14 22 | 1 20\n" +
			"18: 15 15\n" +
			"7: 14 5 | 1 21\n" +
			"24: 14 1\n" +
			"\n" +
			"abbbbbabbbaaaababbaabbbbabababbbabbbbbbabaaaa\n" +
			"bbabbbbaabaabba\n" +
			"babbbbaabbbbbabbbbbbaabaaabaaa\n" +
			"aaabbbbbbaaaabaababaabababbabaaabbababababaaa\n" +
			"bbbbbbbaaaabbbbaaabbabaaa\n" +
			"bbbababbbbaaaaaaaabbababaaababaabab\n" +
			"ababaaaaaabaaab\n" +
			"ababaaaaabbbaba\n" +
			"baabbaaaabbaaaababbaababb\n" +
			"abbbbabbbbaaaababbbbbbaaaababb\n" +
			"aaaaabbaabaaaaababaa\n" +
			"aaaabbaaaabbaaa\n" +
			"aaaabbaabbaaaaaaabbbabbbaaabbaabaaa\n" +
			"babaaabbbaaabaababbaabababaaab\n" +
			"aabbbbbaabbbaaaaaabbbbbababaaaaabbaaabba";

	static int horizontal = 0;
	static int depth = 0;
	static int aim = 0;

	static Map<String, String> comb = new HashMap<>();
	static List<String> totals = new ArrayList<>();
	static {
		totals.add("");
	}

	public static void main(String... args) {


		String input2 = input.split("\n\n")[0];
		for (String str : input2.split("\n")) {
			String numberbefore = str.split(":")[0];
			String numberafter = str.split(":")[1];
			comb.put(numberbefore.trim().replaceAll("\"", ""), numberafter.trim().replaceAll("\"", ""));
		}

		List<String> start = new ArrayList<>();
		start.add("8");
		start.add("11");
		//start.add("5");
		Set<String> newSet = new HashSet<>();
		newSet.add("");
		List<String> result = determineRoute(start, Collections.singletonList(""));
		int total = 0;
		for (String str : input.split("\n\n")[1].split("\n")) {
			if (result.contains(str)) {
				total++;
			}
		}

		System.out.println(total);


	}

	static List<String> determineRoute(List<String> numbers, List<String> untillnow) {
		for (String number: numbers) {
			if (comb.get(number).equals("a") || comb.get(number).equals("b")) {

				List<String> newTotals = new ArrayList<>();
				for (String total : untillnow) {
					newTotals.add(total + comb.get(number));
				}
				untillnow = newTotals;
			} else {
				List<String> newlist2 = new ArrayList<>();
				for (String split: comb.get(number).split("\\|")) {
					newlist2.addAll(determineRoute(Arrays.asList(split.trim().split(" ")), untillnow));
				}
				untillnow = newlist2;
			}
		}
		return untillnow;
	}

}
