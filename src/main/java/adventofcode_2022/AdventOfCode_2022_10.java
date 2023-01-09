package adventofcode_2022;


import utils.AdventOfCodeUtil;

import java.util.List;

public class AdventOfCode_2022_10 {

	static String input = "noop\n" +
			"noop\n" +
			"noop\n" +
			"addx 5\n" +
			"noop\n" +
			"addx 1\n" +
			"noop\n" +
			"addx 4\n" +
			"addx 25\n" +
			"addx -20\n" +
			"noop\n" +
			"noop\n" +
			"addx 5\n" +
			"addx 3\n" +
			"noop\n" +
			"addx 2\n" +
			"noop\n" +
			"noop\n" +
			"addx -1\n" +
			"addx 6\n" +
			"addx 1\n" +
			"noop\n" +
			"addx 4\n" +
			"noop\n" +
			"addx -37\n" +
			"noop\n" +
			"noop\n" +
			"noop\n" +
			"addx 3\n" +
			"addx 32\n" +
			"addx -25\n" +
			"addx 2\n" +
			"addx 3\n" +
			"noop\n" +
			"addx 2\n" +
			"addx 3\n" +
			"noop\n" +
			"addx 2\n" +
			"addx 2\n" +
			"addx -24\n" +
			"addx 25\n" +
			"addx 5\n" +
			"addx 2\n" +
			"addx 8\n" +
			"addx -23\n" +
			"addx 18\n" +
			"addx 5\n" +
			"addx -39\n" +
			"addx 11\n" +
			"addx -9\n" +
			"addx 6\n" +
			"addx -2\n" +
			"addx 5\n" +
			"addx 4\n" +
			"addx -4\n" +
			"addx 3\n" +
			"addx 5\n" +
			"addx 2\n" +
			"noop\n" +
			"addx -1\n" +
			"addx 6\n" +
			"addx -21\n" +
			"addx 22\n" +
			"addx 3\n" +
			"addx 1\n" +
			"addx 5\n" +
			"noop\n" +
			"noop\n" +
			"addx -35\n" +
			"noop\n" +
			"noop\n" +
			"noop\n" +
			"noop\n" +
			"addx 37\n" +
			"addx -33\n" +
			"noop\n" +
			"addx 6\n" +
			"addx 2\n" +
			"addx -1\n" +
			"addx 3\n" +
			"addx 1\n" +
			"addx 5\n" +
			"addx 2\n" +
			"addx -19\n" +
			"addx 21\n" +
			"addx 1\n" +
			"addx 5\n" +
			"addx -31\n" +
			"addx 36\n" +
			"noop\n" +
			"addx 3\n" +
			"addx -2\n" +
			"addx -38\n" +
			"noop\n" +
			"noop\n" +
			"addx 7\n" +
			"addx 14\n" +
			"addx -4\n" +
			"addx -7\n" +
			"addx 5\n" +
			"addx 2\n" +
			"addx 12\n" +
			"addx -15\n" +
			"addx 6\n" +
			"addx 2\n" +
			"addx 5\n" +
			"addx -27\n" +
			"addx 25\n" +
			"addx 5\n" +
			"noop\n" +
			"addx 7\n" +
			"addx -2\n" +
			"addx 5\n" +
			"addx -40\n" +
			"noop\n" +
			"addx 7\n" +
			"noop\n" +
			"addx -1\n" +
			"addx 2\n" +
			"addx 5\n" +
			"addx -1\n" +
			"addx 1\n" +
			"addx 2\n" +
			"addx 7\n" +
			"noop\n" +
			"addx -2\n" +
			"noop\n" +
			"addx 3\n" +
			"addx 2\n" +
			"addx 7\n" +
			"noop\n" +
			"noop\n" +
			"addx 1\n" +
			"noop\n" +
			"noop\n" +
			"addx 3\n" +
			"addx 1\n" +
			"noop\n" +
			"noop\n" +
			"noop";

	public static void main(String... args) {
		int numsig = 0;
		int numsigold = 0;
		int total = 1;
		int grandtotal = 0;
		int numcycle = 0;

		String curline = "";
		String curlines = "";

		for (int i = 0; i < input.split("\n").length; i++) {
			String ii = input.split("\n")[i];
			if (ii.equals("noop")) {
				if (total == numsig - (40*numcycle) || total + 1 == numsig- (40*numcycle) || total -1 == numsig- (40*numcycle)) {
					curline = curline + "#";
				} else {
					curline = curline + ".";
				}
				numsig += 1;
				if (numsig == 40) {
					curlines = curlines + curline + "\n";
					curline = "";
					numcycle++;
				}
				if ( numsig == 80) {
					curlines = curlines + curline + "\n";

					curline = "";
					numcycle++;
				}
				if (numsig == 120) {
					curlines = curlines + curline + "\n";

					curline = "";
					numcycle++;
				}
				if (numsig == 160) {
					curlines = curlines + curline + "\n";

					curline = "";
					numcycle++;
				}
				if (numsig == 200) {
					curlines = curlines + curline + "\n";

					curline = "";
					numcycle++;
				}
				if (numsig == 240) {
					curlines = curlines + curline + "\n";

					curline = "";
					numcycle++;
				}
			} else {
				int amt = Integer.parseInt(ii.split(" ")[1]);
				for (int j = 0; j < 2; j++) {
					if (total == numsig- (40*numcycle) || total + 1 == numsig- (40*numcycle) || total -1 == numsig- (40*numcycle)) {
						curline = curline + "#";
					} else {
						curline = curline + ".";
					}
					numsig += 1;
					if (numsig == 40) {
						curlines = curlines + curline + "\n";

						curline = "";
						numcycle++;
					}
					if (numsig == 80) {
						curlines = curlines + curline + "\n";

						curline = "";
						numcycle++;
					}
					if (numsig == 120) {
						curlines = curlines + curline + "\n";

						curline = "";
						numcycle++;
					}
					if (numsig == 160) {
						curlines = curlines + curline + "\n";

						curline = "";
						numcycle++;
					}
					if (numsig == 200) {
						curlines = curlines + curline + "\n";

						curline = "";
						numcycle++;
					}
					if (numsig == 240) {
						curlines = curlines + curline + "\n";

						curline = "";
						numcycle++;
					}
				}
				total += amt;

			}
		}
		System.out.println(curlines);

	}
}
