package adventofcode_2021;


import utils.AdventOfCodeUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdventOfCode_2021_06 {

	static String input = "4,1,4,1,3,3,1,4,3,3,2,1,1,3,5,1,3,5,2,5,1,5,5,1,3,2,5,3,1,3,4,2,3,2,3,3,2,1,5,4,1,1,1,2,1,4,4,4,2,1,2,1,5,1,5,1,2,1,4,4,5,3,3,4,1,4,4,2,1,4,4,3,5,2,5,4,1,5,1,1,1,4,5,3,4,3,4,2,2,2,2,4,5,3,5,2,4,2,3,4,1,4,4,1,4,5,3,4,2,2,2,4,3,3,3,3,4,2,1,2,5,5,3,2,3,5,5,5,4,4,5,5,4,3,4,1,5,1,3,4,4,1,3,1,3,1,1,2,4,5,3,1,2,4,3,3,5,4,4,5,4,1,3,1,1,4,4,4,4,3,4,3,1,4,5,1,2,4,3,5,1,1,2,1,1,5,4,2,1,5,4,5,2,4,4,1,5,2,2,5,3,3,2,3,1,5,5,5,4,3,1,1,5,1,4,5,2,1,3,1,2,4,4,1,1,2,5,3,1,5,2,4,5,1,2,3,1,2,2,1,2,2,1,4,1,3,4,2,1,1,5,4,1,5,4,4,3,1,3,3,1,1,3,3,4,2,3,4,2,3,1,4,1,5,3,1,1,5,3,2,3,5,1,3,1,1,3,5,1,5,1,1,3,1,1,1,1,3,3,1";


	static Map<Integer, Long> fish = new HashMap<>();

	public static void main(String... args) {
		for (int i = 0; i < input.split(",").length; i++) {
			String str = input.split(",")[i];
			if (fish.containsKey(Integer.parseInt(str))) {
				Long value = fish.get(Integer.parseInt(str));
				fish.put(Integer.parseInt(str), value + 1);
			} else {
				fish.put(Integer.parseInt(str), 1l);
			}
		}


		for (int i = 0; i < 256; i++) {
			Map<Integer, Long> newMap = new HashMap<>();

			for (Integer j : fish.keySet()) {
				if (j == 0) {
					long value = fish.get(j);
					newMap.put(6, value);
					newMap.put(8, value);
				} else {
					long oldvalue = fish.get(j);

					long newvalue;
					if (newMap.containsKey(j - 1)) {
						newvalue = newMap.get(j - 1);
					} else {
						newvalue = 0;
					}
					newMap.put(j - 1, oldvalue + newvalue);
				}
			}
			fish = newMap;
		}
		long count = 0;
		for (Long value : fish.values()) {
			count += value;
		}
		System.out.println(count);
	}

}
