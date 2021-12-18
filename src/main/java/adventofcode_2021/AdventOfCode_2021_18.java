package adventofcode_2021;


import utils.AdventOfCodeUtil;

import java.util.ArrayList;
import java.util.List;

public class AdventOfCode_2021_18 {

	static String input = "[6,[[5,[7,7]],[[8,2],2]]]\n" +
			"[[8,[0,0]],[[[1,4],[2,0]],[[2,3],[8,2]]]]\n" +
			"[[[7,[6,1]],[9,[7,9]]],[[6,6],2]]\n" +
			"[[5,[2,0]],[[[9,4],[6,8]],[3,9]]]\n" +
			"[[[3,[0,3]],[5,[9,8]]],[[5,[8,1]],[1,2]]]\n" +
			"[[[5,[8,5]],[[6,3],3]],[[1,[0,9]],[[3,0],[7,3]]]]\n" +
			"[[[[1,2],0],[8,[6,6]]],[6,[7,5]]]\n" +
			"[[[[0,9],[5,3]],[[9,7],8]],[9,[[1,9],1]]]\n" +
			"[[4,[6,[0,8]]],[[2,9],1]]\n" +
			"[[[5,1],[6,[9,5]]],8]\n" +
			"[[[4,[7,0]],1],[3,3]]\n" +
			"[2,[[3,4],6]]\n" +
			"[[[[0,5],[7,1]],[[7,0],[1,7]]],2]\n" +
			"[[3,[7,8]],[[1,0],[[1,7],6]]]\n" +
			"[[[7,[6,3]],1],[4,[1,[6,8]]]]\n" +
			"[[[[5,5],[3,5]],[5,[2,6]]],[3,[1,[3,2]]]]\n" +
			"[[8,2],9]\n" +
			"[[8,[[1,9],2]],[[8,[8,4]],3]]\n" +
			"[[[[8,7],9],5],[[[0,6],5],[6,5]]]\n" +
			"[[2,6],[0,[[9,8],6]]]\n" +
			"[[[[7,9],0],[[1,5],9]],[[[2,2],1],[3,1]]]\n" +
			"[[8,[1,[9,1]]],[0,[0,[2,4]]]]\n" +
			"[[[[0,2],3],[[9,4],9]],[[3,2],[[5,7],[4,8]]]]\n" +
			"[[[[8,0],3],[9,[5,9]]],[4,3]]\n" +
			"[2,[7,[[3,3],[7,9]]]]\n" +
			"[3,[[[6,4],0],5]]\n" +
			"[[1,[[9,9],9]],[[[0,3],[0,6]],0]]\n" +
			"[[7,[[2,3],4]],[6,[9,9]]]\n" +
			"[3,5]\n" +
			"[[[[2,3],2],[1,[9,9]]],[[8,2],[1,[2,0]]]]\n" +
			"[[[[7,2],[3,6]],[[9,7],[8,9]]],[[[5,3],[5,1]],6]]\n" +
			"[8,[[7,0],[[8,2],5]]]\n" +
			"[[[1,[1,0]],[[3,7],[4,5]]],[[[6,5],2],1]]\n" +
			"[8,[[5,0],3]]\n" +
			"[[[4,1],9],[1,5]]\n" +
			"[[9,[5,[3,7]]],[[0,4],4]]\n" +
			"[[[[9,6],4],[8,[7,5]]],[[6,9],5]]\n" +
			"[[[7,[2,5]],0],[8,[0,7]]]\n" +
			"[8,[[4,[1,8]],[[8,9],3]]]\n" +
			"[[[[3,7],[7,3]],[[5,3],1]],[[[6,7],[2,7]],[[2,6],[9,0]]]]\n" +
			"[[[9,[5,4]],[[1,7],2]],[[1,0],[[2,6],0]]]\n" +
			"[[[[3,2],[5,3]],[9,[2,0]]],[[7,6],[[8,2],[0,7]]]]\n" +
			"[[[4,0],0],[9,0]]\n" +
			"[[[[9,4],[0,9]],[2,3]],8]\n" +
			"[[2,[8,[6,7]]],[[[6,1],[5,1]],[3,[1,1]]]]\n" +
			"[[6,[[8,2],7]],5]\n" +
			"[[[[7,3],[9,7]],5],[[[0,9],4],[3,[0,3]]]]\n" +
			"[[2,[6,7]],[[[9,0],[6,7]],4]]\n" +
			"[[[[3,1],5],[7,[5,1]]],[[[8,4],9],[[2,7],[4,6]]]]\n" +
			"[[8,8],[[[1,4],[7,3]],[[9,6],5]]]\n" +
			"[[[[3,0],8],[[5,1],[7,8]]],[[[5,0],[2,2]],[[9,0],[0,7]]]]\n" +
			"[[1,1],7]\n" +
			"[[4,3],[[9,[7,3]],[2,3]]]\n" +
			"[[[5,[3,5]],3],7]\n" +
			"[[[5,[3,2]],1],[[[3,2],8],[8,5]]]\n" +
			"[[7,[6,5]],[[[9,8],7],6]]\n" +
			"[[[7,9],0],[3,4]]\n" +
			"[[[[5,6],[7,4]],[4,[1,7]]],[[[8,2],7],[6,[4,5]]]]\n" +
			"[[[[8,5],1],[[7,0],[9,7]]],[[[5,2],3],2]]\n" +
			"[[[[7,3],9],7],[[[8,1],9],3]]\n" +
			"[[[6,5],[4,[6,1]]],7]\n" +
			"[[[[4,0],1],[4,4]],[[1,7],[3,0]]]\n" +
			"[9,[[2,[9,0]],6]]\n" +
			"[[[[0,0],9],2],[9,3]]\n" +
			"[5,[5,[[6,6],[2,6]]]]\n" +
			"[[[[8,2],[8,9]],[[8,4],[8,0]]],[[[9,5],6],4]]\n" +
			"[[[3,[6,1]],[3,[6,9]]],[3,4]]\n" +
			"[[[7,[6,3]],[[6,7],1]],[[1,1],2]]\n" +
			"[[[[1,2],[7,1]],[[7,7],4]],3]\n" +
			"[[[[7,2],4],[[4,7],[2,4]]],[1,[[6,2],4]]]\n" +
			"[4,[[0,4],5]]\n" +
			"[[[4,6],[0,[8,2]]],[[4,[8,7]],[[7,9],0]]]\n" +
			"[[[9,2],[5,2]],7]\n" +
			"[[9,[2,2]],4]\n" +
			"[[[6,2],[[4,3],[3,9]]],[[4,1],[[9,4],4]]]\n" +
			"[[[7,[4,2]],4],[[8,[9,3]],[[9,0],[5,4]]]]\n" +
			"[[[[4,1],[4,6]],[2,[4,5]]],[[1,[1,5]],9]]\n" +
			"[[[[5,2],8],6],[1,[[8,9],4]]]\n" +
			"[[[6,[4,2]],[6,[5,5]]],[0,3]]\n" +
			"[[7,[5,[7,0]]],[[[7,2],0],[[7,3],8]]]\n" +
			"[[3,[[2,3],[2,8]]],[5,7]]\n" +
			"[[[[8,0],[6,4]],[[3,7],3]],[[[7,3],[9,8]],[[8,0],8]]]\n" +
			"[[2,[5,2]],[[[0,9],[4,1]],[[8,8],4]]]\n" +
			"[[[[4,1],[6,5]],[[2,7],[5,8]]],[[[7,1],[2,3]],2]]\n" +
			"[[3,5],2]\n" +
			"[[9,2],[[6,[1,9]],[9,5]]]\n" +
			"[[4,[3,8]],[[4,[0,3]],[1,1]]]\n" +
			"[[[6,[0,7]],[[0,4],[6,1]]],[[8,5],[[5,2],[7,2]]]]\n" +
			"[[[[8,8],[6,3]],[[0,2],[6,5]]],[[[7,6],[5,4]],[4,[7,1]]]]\n" +
			"[[[[7,6],[5,8]],[6,1]],[0,[[0,8],9]]]\n" +
			"[[[6,[2,2]],[5,2]],6]\n" +
			"[[[7,9],[[1,5],8]],2]\n" +
			"[[[3,3],[5,6]],[[3,[3,6]],[2,[5,9]]]]\n" +
			"[[[[0,8],[0,1]],[[8,6],4]],[[0,[1,3]],4]]\n" +
			"[[6,[4,4]],[4,[0,4]]]\n" +
			"[[[3,4],[4,1]],8]\n" +
			"[[0,[[4,6],[5,1]]],[[0,[4,3]],[6,9]]]\n" +
			"[[[0,7],2],[[4,9],[1,6]]]\n" +
			"[[1,0],[[[4,9],9],[[5,4],9]]]\n" +
			"[8,[[[1,4],[5,5]],[1,[0,9]]]]";

	static String totalSoFar;

	static List<String> list1 = new ArrayList<>();
	static List<String> list2 = new ArrayList<>();
	public static void main(String... args) {

		int largestmag = 0;

		for (int i = 0; i < input.split("\n").length; i++) {
			String str = input.split("\n")[i];

			list1.add(str);
			list2.add(str);
		}

			for (String string: list1) {
				for (String string2: list2) {
					String test = "[" + string + "," + string2 + "]";
					test = reduce(test);
					int mag = calcMagnitude(test);
					if (mag > largestmag) {
						largestmag = mag;
					}
				}
			}

			System.out.println(largestmag);

//			if (i == 0) {
//				totalSoFar = str;
//			} else {
//				totalSoFar = "[" + totalSoFar + "," + str + "]";
//			}
//
//			totalSoFar = reduce(totalSoFar);
		}


	public static String reduce(String input) {
		while (true) {
			int sqbracketnestedcount = 0;
			int indexa = 0;
			String oldInput = input;
			for (int i = 0; i < input.length(); i++) {
				String str = Character.toString(input.charAt(i));
				if (str.equals("[")) {
					sqbracketnestedcount++;
				}
				if (str.equals("]")) {
					sqbracketnestedcount--;
				}
				if (sqbracketnestedcount == 5) {
					input = performExplode(input, indexa);
					break;
				}
				indexa++;
			}

			if (oldInput.equals(input)) {
				int indexb = 0;
				for (int i = 0; i < input.length(); i++) {
					String str = Character.toString(input.charAt(i));
					if (AdventOfCodeUtil.isNumeric(str) && AdventOfCodeUtil.getFirstNumberOfString(input.substring(i)) > 9) {
						input = performSplit(input, indexb, AdventOfCodeUtil.getFirstNumberOfString(input.substring(i)));
						break;
					}
					indexb++;
				}
			}
			if (oldInput.equals(input)) {
				return input;
			}
		}
	}

	public static int calcMagnitude(String string) {

		while (true) {
			int sqbracketnestedcount = 0;
			int maxsqbracketcount = 0;
			for (int i = 0; i < string.length(); i++) {
				String str2 = Character.toString(string.charAt(i));
				if (str2.equals("[")) {
					sqbracketnestedcount++;
				}
				if (str2.equals("]")) {
					sqbracketnestedcount--;
				}
				if (sqbracketnestedcount > maxsqbracketcount) {
					maxsqbracketcount = sqbracketnestedcount;
				}
			}

			int sqnestedBracketcount2 = 0;
			for (int i = 0; i < string.length(); i++) {
				String str2 = Character.toString(string.charAt(i));
				if (str2.equals("[")) {
					sqnestedBracketcount2++;
				}
				if (str2.equals("]")) {
					sqnestedBracketcount2--;
				}
				if (maxsqbracketcount == sqnestedBracketcount2) {
					int firstNrPair = AdventOfCodeUtil.getFirstNumberOfString(string.substring(i));
					int secondNrPair = AdventOfCodeUtil.getSecondNumberOfString(string.substring(i));

					String before = string.substring(0, i);
					String after = string.substring(i + string.substring(i).indexOf("]") + 1);
					string = before + (firstNrPair * 3 + secondNrPair * 2) + after;
					break;
				}
			}
			if (AdventOfCodeUtil.isNumeric(string)) {
				return Integer.parseInt(string);
			}
		}
	}

	private static String performSplit(String input, int index, int number) {
		int firstnr = (int) Math.floor((double) (number / 2));
		long secondnr = AdventOfCodeUtil.roundUp(number, 2);
		String result = "[" + firstnr + "," + secondnr + "]";
		input = input.substring(0, index) + result + input.substring(index + 2);
		return input;
	}

	private static String performExplode(String input, int index) {
		int firstNrPair = AdventOfCodeUtil.getFirstNumberOfString(input.substring(index));
		int secondNrPair = AdventOfCodeUtil.getSecondNumberOfString(input.substring(index));

		String before = input.substring(0, index);
		String after = input.substring(index + input.substring(index).indexOf("]") + 1);



		for (int i = 0; i < after.length(); i++) {
			String str2 = Character.toString(after.charAt(i));
			if (AdventOfCodeUtil.isNumeric(str2)) {
				int result = secondNrPair + AdventOfCodeUtil.getFirstNumberOfString(after.substring(i));

				if (AdventOfCodeUtil.getFirstNumberOfString(after.substring(i)).toString().length() == 2) {
					after = after.substring(0, i) + result + after.substring(i + 2);
				} else {
					after = after.substring(0, i) + result + after.substring(i + 1);
				}
				break;
			}
		}

		for (int i = before.length() - 1; i > 0; i--) {
			String str2 = Character.toString(before.charAt(i));
			if (AdventOfCodeUtil.isNumeric(str2)) {
				int result = firstNrPair + AdventOfCodeUtil.getLastNumberOfString(before.substring(i - 2));
				if (AdventOfCodeUtil.getLastNumberOfString(before.substring(i - 2)).toString().length() == 2) {
					before = before.substring(0, i - 1) + result + before.substring(i + 1);
				}
				else {
					before = before.substring(0, i) + result + before.substring(i + 1);
				}
				break;
			}
		}

		input = before + "0" + after;
		return input;
	}

}
