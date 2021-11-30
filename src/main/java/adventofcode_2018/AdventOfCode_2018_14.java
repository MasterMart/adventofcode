package adventofcode_2018;

import java.util.ArrayList;
import java.util.List;
import utils.AdventOfCodeUtil;


public class AdventOfCode_2018_14 {

	static List<Integer> recipes = new ArrayList<>();
	static int currentPositionElf1;
	static int currentPositionElf2;
	static {
		recipes.add(3);
		recipes.add(7);
		currentPositionElf1 = 0;
		currentPositionElf2 = 1;
	}
	static int input = 79913401;

	public static void main(String... args) {
		for (int i = 0; i < input; i++) {
			int total = recipes.get(currentPositionElf1) + recipes.get(currentPositionElf2);
			recipes.addAll(AdventOfCodeUtil.convertNumberToDigits(total));
			currentPositionElf1 = (currentPositionElf1 + recipes.get(currentPositionElf1) + 1) % recipes.size();
			currentPositionElf2 = (currentPositionElf2 + recipes.get(currentPositionElf2) + 1) % recipes.size();
		}
		System.out.println(AdventOfCodeUtil.getIndexOfSequence("513401", recipes));
	}
}
