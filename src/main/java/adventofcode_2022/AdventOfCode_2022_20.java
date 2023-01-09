package adventofcode_2022;


import utils.AdventOfCodeUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdventOfCode_2022_20 {

	static String input = "1\n" +
			"2\n" +
			"-3\n" +
			"3\n" +
			"-2\n" +
			"0\n" +
			"4";

	public static void main(String... args) {
		int total = 0;
		List<Mixing> list = new ArrayList<>();

		for (int i = 0; i < input.split("\n").length; i++) {
			String ii = input.split("\n")[i];
			Integer j = Integer.parseInt(ii);
			Mixing mixing = new Mixing();
			mixing.number = j;
			mixing.originalpos = i;
			list.add(mixing);
		}

		int k = list.size();

		for (int i = 0; i < k; i++) {
			int finalI = i;
			Mixing mixing = list.stream().filter(mixing1 -> mixing1.originalpos == finalI).findFirst().get();
			int oldindex = list.indexOf(mixing);
			int newindex = oldindex + mixing.number;
			if (newindex == oldindex) {
				System.out.println(list);
				continue;
			}
			if (newindex > 0) {
				if (newindex >= k) {
					newindex = newindex % k;
					newindex = newindex - 1;
				}
			}
			if (newindex < 0) {
				while(newindex < 0) {
					newindex = newindex + k;
				}
				newindex = newindex - 1;
			}
//			if (newindex == 0) {
//				newindex = newindex + k;
//			}
			move(list, oldindex, newindex);
			System.out.println(list);
		}

	}

	static class Mixing {
		public int number;
		public int originalpos;


		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Mixing that = (Mixing) o;
			return originalpos == ((Mixing) o).originalpos;
		}

		@Override
		public String toString() {
			return String.valueOf(number);
		}
	}

	public static void move(List<?> collection, int indexToMoveFrom,
							int indexToMoveAt) {
		if (indexToMoveAt >= indexToMoveFrom) {
			Collections.rotate(
					collection.subList(indexToMoveFrom, indexToMoveAt + 1),
					-1);
		} else {
			Collections.rotate(
					collection.subList(indexToMoveAt, indexToMoveFrom + 1),
					1);
		}
	}


}
