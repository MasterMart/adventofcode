package adventofcode_2021;


import java.util.ArrayList;
import java.util.List;

public class AdventOfCode_2021_06 {

	static String input = "4,1,4,1,3,3,1,4,3,3,2,1,1,3,5,1,3,5,2,5,1,5,5,1,3,2,5,3,1,3,4,2,3,2,3,3,2,1,5,4,1,1,1,2,1,4,4,4,2,1,2,1,5,1,5,1,2,1,4,4,5,3,3,4,1,4,4,2,1,4,4,3,5,2,5,4,1,5,1,1,1,4,5,3,4,3,4,2,2,2,2,4,5,3,5,2,4,2,3,4,1,4,4,1,4,5,3,4,2,2,2,4,3,3,3,3,4,2,1,2,5,5,3,2,3,5,5,5,4,4,5,5,4,3,4,1,5,1,3,4,4,1,3,1,3,1,1,2,4,5,3,1,2,4,3,3,5,4,4,5,4,1,3,1,1,4,4,4,4,3,4,3,1,4,5,1,2,4,3,5,1,1,2,1,1,5,4,2,1,5,4,5,2,4,4,1,5,2,2,5,3,3,2,3,1,5,5,5,4,3,1,1,5,1,4,5,2,1,3,1,2,4,4,1,1,2,5,3,1,5,2,4,5,1,2,3,1,2,2,1,2,2,1,4,1,3,4,2,1,1,5,4,1,5,4,4,3,1,3,3,1,1,3,3,4,2,3,4,2,3,1,4,1,5,3,1,1,5,3,2,3,5,1,3,1,1,3,5,1,5,1,1,3,1,1,1,1,3,3,1";


	static List<Integer> fish = new ArrayList<>();

	public static void main(String... args) {
		for (int i = 0; i < input.split(",").length; i++) {
			String str = input.split(",")[i];
			fish.add(Integer.parseInt(str));
		}


		int prev = 0;
		for (int i = 0; i < 256; i++) {
			System.out.println(i);
			List<Integer> newfish = new ArrayList<>();

			for (Integer j : fish) {
				if (j == 0) {
					newfish.add(6);
					newfish.add(8);
				} else {
					newfish.add(j - 1);
				}
			}
			fish = newfish;
			prev = fish.size();
		}
		System.out.println(fish.size());

	}

}
