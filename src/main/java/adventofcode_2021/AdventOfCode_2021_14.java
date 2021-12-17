package adventofcode_2021;


import utils.AdventOfCodeUtil;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AdventOfCode_2021_14 {

	static String input = "OOVSKSPKPPPNNFFBCNOV\n" +
			"\n" +
			"BC -> C\n" +
			"PP -> O\n" +
			"SK -> K\n" +
			"KH -> N\n" +
			"OK -> S\n" +
			"PC -> O\n" +
			"VP -> K\n" +
			"CF -> K\n" +
			"HC -> H\n" +
			"FV -> V\n" +
			"PB -> P\n" +
			"NK -> H\n" +
			"CK -> F\n" +
			"FH -> H\n" +
			"SV -> B\n" +
			"NH -> C\n" +
			"CP -> S\n" +
			"HP -> O\n" +
			"HS -> O\n" +
			"BK -> B\n" +
			"KC -> P\n" +
			"VV -> B\n" +
			"OF -> O\n" +
			"KP -> V\n" +
			"FO -> V\n" +
			"FK -> V\n" +
			"VH -> K\n" +
			"KB -> P\n" +
			"KF -> H\n" +
			"SH -> S\n" +
			"HF -> O\n" +
			"BB -> F\n" +
			"FC -> O\n" +
			"SO -> S\n" +
			"BS -> O\n" +
			"HH -> C\n" +
			"BO -> S\n" +
			"CO -> F\n" +
			"VC -> V\n" +
			"KS -> N\n" +
			"OC -> N\n" +
			"FP -> P\n" +
			"HN -> B\n" +
			"HV -> V\n" +
			"HO -> P\n" +
			"KO -> C\n" +
			"SF -> H\n" +
			"NO -> N\n" +
			"PS -> C\n" +
			"BP -> K\n" +
			"SC -> C\n" +
			"NP -> C\n" +
			"CH -> V\n" +
			"KV -> B\n" +
			"HK -> V\n" +
			"OP -> V\n" +
			"SP -> V\n" +
			"NC -> V\n" +
			"FF -> B\n" +
			"CC -> V\n" +
			"CS -> F\n" +
			"SB -> C\n" +
			"OS -> C\n" +
			"FN -> O\n" +
			"CV -> P\n" +
			"OH -> H\n" +
			"OO -> P\n" +
			"PO -> F\n" +
			"NS -> H\n" +
			"VB -> K\n" +
			"OV -> K\n" +
			"PH -> H\n" +
			"BH -> V\n" +
			"SS -> B\n" +
			"PK -> F\n" +
			"VK -> O\n" +
			"BN -> V\n" +
			"VF -> O\n" +
			"PF -> H\n" +
			"VS -> K\n" +
			"ON -> V\n" +
			"BF -> F\n" +
			"CN -> F\n" +
			"VO -> B\n" +
			"FS -> K\n" +
			"OB -> B\n" +
			"PN -> H\n" +
			"NF -> O\n" +
			"VN -> P\n" +
			"BV -> S\n" +
			"NV -> V\n" +
			"FB -> V\n" +
			"NB -> P\n" +
			"CB -> B\n" +
			"KK -> S\n" +
			"NN -> F\n" +
			"SN -> B\n" +
			"HB -> P\n" +
			"PV -> S\n" +
			"KN -> S";

	public static void main(String... args) {
		Map<String, String> comb = new HashMap<>();

		String str1 = input.split("\n\n")[0];

		String str2 = input.split("\n\n")[1];

		for (String str3 : str2.split("\n")) {
			comb.put(str3.split(" -> ")[0], str3.split(" -> ")[1]);
		}

		Map<String, Long> partsCount = new HashMap<>();
		for (int j = 0; j < str1.length() - 1; j++) {
			String partToCheck = str1.substring(j, j + 2);
			String toAppend = Character.toString(partToCheck.charAt(0)) + comb.get(partToCheck) + Character.toString(partToCheck.charAt(1));
			String part1 = toAppend.substring(0, 2);
			String part2 = toAppend.substring(1);

			if (partsCount.containsKey(part1)) {
				long value = partsCount.get(part1);
				partsCount.put(part1, value + 1);
			} else {
				partsCount.put(part1, 1L);
			}

			if (partsCount.containsKey(part2)) {
				long value = partsCount.get(part2);
				partsCount.put(part2, value + 1);
			} else {
				partsCount.put(part2, 1L);
			}

		}

		String result = "";
		Map<String, Long> tempmap = new HashMap<>();
		for (int i = 0; i < 39; i++) {
			tempmap = new HashMap<>();
			for (String str : partsCount.keySet()) {
				long amount = partsCount.get(str);
				String toAppend = Character.toString(str.charAt(0)) + comb.get(str) + Character.toString(str.charAt(1));
				String part1 = toAppend.substring(0, 2);
				String part2 = toAppend.substring(1);

				if (tempmap.containsKey(part1)) {
					long value = tempmap.get(part1);
					tempmap.put(part1, value + amount);
				} else {
					tempmap.put(part1, amount);
				}

				if (tempmap.containsKey(part2)) {
					long value = tempmap.get(part2);
					tempmap.put(part2, value + amount);
				} else {
					tempmap.put(part2, amount);
				}
			}
			partsCount = tempmap;
		}

		Map<String, Long> lettercount = new HashMap<>();
		for (String str : tempmap.keySet()) {
			String last = Character.toString(str.charAt(str.length() - 1));
			if (lettercount.containsKey(last)) {
				long value = lettercount.get(last);
				lettercount.put(last, value + tempmap.get(str));
			} else {
				lettercount.put(last, tempmap.get(str));
			}
		}

		long min = Collections.min(lettercount.values());
		long max = Collections.max(lettercount.values());

		System.out.println("min: " + min);
		System.out.println("max: " + max);

		System.out.println(max - min);
	}

}
