package adventofcode_2022;


import utils.AdventOfCodeUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdventOfCode_2022_05 {

	static String input = "move 3 from 2 to 5\n" +
			"move 2 from 9 to 6\n" +
			"move 4 from 7 to 1\n" +
			"move 7 from 3 to 4\n" +
			"move 2 from 9 to 8\n" +
			"move 8 from 8 to 6\n" +
			"move 1 from 7 to 4\n" +
			"move 8 from 6 to 4\n" +
			"move 4 from 5 to 7\n" +
			"move 3 from 4 to 9\n" +
			"move 2 from 6 to 3\n" +
			"move 11 from 4 to 1\n" +
			"move 1 from 3 to 4\n" +
			"move 2 from 3 to 1\n" +
			"move 1 from 7 to 6\n" +
			"move 14 from 1 to 6\n" +
			"move 7 from 4 to 3\n" +
			"move 2 from 5 to 9\n" +
			"move 5 from 6 to 4\n" +
			"move 9 from 6 to 1\n" +
			"move 3 from 4 to 8\n" +
			"move 1 from 7 to 6\n" +
			"move 3 from 4 to 1\n" +
			"move 7 from 3 to 8\n" +
			"move 5 from 9 to 5\n" +
			"move 4 from 1 to 4\n" +
			"move 3 from 7 to 2\n" +
			"move 5 from 6 to 2\n" +
			"move 3 from 4 to 1\n" +
			"move 7 from 8 to 5\n" +
			"move 3 from 6 to 8\n" +
			"move 11 from 2 to 1\n" +
			"move 1 from 4 to 3\n" +
			"move 1 from 3 to 9\n" +
			"move 2 from 2 to 9\n" +
			"move 8 from 5 to 4\n" +
			"move 1 from 1 to 7\n" +
			"move 1 from 9 to 5\n" +
			"move 8 from 4 to 1\n" +
			"move 1 from 6 to 8\n" +
			"move 2 from 9 to 1\n" +
			"move 4 from 5 to 3\n" +
			"move 2 from 7 to 3\n" +
			"move 40 from 1 to 2\n" +
			"move 24 from 2 to 9\n" +
			"move 1 from 5 to 6\n" +
			"move 11 from 2 to 3\n" +
			"move 9 from 3 to 5\n" +
			"move 12 from 9 to 4\n" +
			"move 6 from 5 to 7\n" +
			"move 4 from 7 to 4\n" +
			"move 2 from 5 to 1\n" +
			"move 2 from 1 to 9\n" +
			"move 1 from 6 to 8\n" +
			"move 9 from 4 to 8\n" +
			"move 6 from 4 to 9\n" +
			"move 17 from 9 to 6\n" +
			"move 1 from 4 to 6\n" +
			"move 17 from 6 to 5\n" +
			"move 1 from 1 to 4\n" +
			"move 2 from 7 to 9\n" +
			"move 1 from 6 to 7\n" +
			"move 2 from 2 to 9\n" +
			"move 2 from 7 to 2\n" +
			"move 6 from 3 to 8\n" +
			"move 3 from 5 to 9\n" +
			"move 1 from 4 to 9\n" +
			"move 2 from 3 to 7\n" +
			"move 4 from 5 to 6\n" +
			"move 1 from 7 to 4\n" +
			"move 1 from 4 to 2\n" +
			"move 1 from 7 to 5\n" +
			"move 9 from 8 to 1\n" +
			"move 1 from 1 to 2\n" +
			"move 2 from 9 to 3\n" +
			"move 7 from 2 to 7\n" +
			"move 1 from 9 to 5\n" +
			"move 12 from 8 to 7\n" +
			"move 3 from 1 to 9\n" +
			"move 2 from 6 to 4\n" +
			"move 9 from 9 to 3\n" +
			"move 1 from 6 to 7\n" +
			"move 1 from 9 to 5\n" +
			"move 1 from 6 to 1\n" +
			"move 9 from 7 to 1\n" +
			"move 7 from 1 to 8\n" +
			"move 4 from 3 to 9\n" +
			"move 5 from 7 to 1\n" +
			"move 3 from 9 to 1\n" +
			"move 4 from 7 to 2\n" +
			"move 12 from 1 to 5\n" +
			"move 2 from 9 to 4\n" +
			"move 7 from 8 to 2\n" +
			"move 7 from 5 to 7\n" +
			"move 4 from 3 to 4\n" +
			"move 1 from 8 to 1\n" +
			"move 2 from 2 to 1\n" +
			"move 2 from 3 to 1\n" +
			"move 3 from 2 to 7\n" +
			"move 13 from 5 to 4\n" +
			"move 1 from 8 to 3\n" +
			"move 1 from 3 to 8\n" +
			"move 1 from 3 to 5\n" +
			"move 1 from 8 to 7\n" +
			"move 17 from 4 to 8\n" +
			"move 5 from 2 to 6\n" +
			"move 2 from 1 to 6\n" +
			"move 5 from 6 to 3\n" +
			"move 9 from 7 to 1\n" +
			"move 4 from 4 to 3\n" +
			"move 1 from 6 to 2\n" +
			"move 4 from 7 to 4\n" +
			"move 1 from 6 to 5\n" +
			"move 2 from 3 to 2\n" +
			"move 15 from 1 to 4\n" +
			"move 6 from 5 to 4\n" +
			"move 4 from 3 to 5\n" +
			"move 4 from 5 to 2\n" +
			"move 2 from 2 to 4\n" +
			"move 11 from 8 to 1\n" +
			"move 2 from 8 to 3\n" +
			"move 5 from 3 to 7\n" +
			"move 4 from 2 to 8\n" +
			"move 2 from 2 to 9\n" +
			"move 4 from 7 to 8\n" +
			"move 11 from 4 to 6\n" +
			"move 2 from 5 to 4\n" +
			"move 3 from 6 to 9\n" +
			"move 4 from 1 to 4\n" +
			"move 15 from 4 to 9\n" +
			"move 1 from 7 to 3\n" +
			"move 2 from 1 to 2\n" +
			"move 6 from 4 to 5\n" +
			"move 11 from 8 to 2\n" +
			"move 16 from 9 to 4\n" +
			"move 2 from 9 to 1\n" +
			"move 4 from 2 to 3\n" +
			"move 8 from 4 to 9\n" +
			"move 1 from 8 to 7\n" +
			"move 5 from 4 to 7\n" +
			"move 6 from 7 to 3\n" +
			"move 10 from 9 to 5\n" +
			"move 5 from 3 to 1\n" +
			"move 1 from 1 to 4\n" +
			"move 5 from 1 to 9\n" +
			"move 5 from 1 to 7\n" +
			"move 5 from 4 to 1\n" +
			"move 4 from 1 to 6\n" +
			"move 3 from 1 to 9\n" +
			"move 10 from 5 to 9\n" +
			"move 2 from 7 to 1\n" +
			"move 5 from 3 to 6\n" +
			"move 4 from 5 to 7\n" +
			"move 4 from 2 to 6\n" +
			"move 2 from 5 to 6\n" +
			"move 5 from 2 to 7\n" +
			"move 18 from 6 to 1\n" +
			"move 5 from 9 to 2\n" +
			"move 7 from 9 to 6\n" +
			"move 16 from 1 to 7\n" +
			"move 4 from 6 to 1\n" +
			"move 1 from 2 to 6\n" +
			"move 2 from 2 to 6\n" +
			"move 1 from 2 to 4\n" +
			"move 4 from 9 to 3\n" +
			"move 1 from 2 to 8\n" +
			"move 5 from 7 to 5\n" +
			"move 2 from 9 to 3\n" +
			"move 1 from 5 to 9\n" +
			"move 7 from 3 to 4\n" +
			"move 1 from 9 to 7\n" +
			"move 8 from 1 to 9\n" +
			"move 1 from 8 to 9\n" +
			"move 3 from 6 to 9\n" +
			"move 17 from 7 to 5\n" +
			"move 3 from 4 to 8\n" +
			"move 3 from 4 to 2\n" +
			"move 3 from 8 to 3\n" +
			"move 3 from 3 to 7\n" +
			"move 7 from 9 to 3\n" +
			"move 6 from 5 to 9\n" +
			"move 4 from 9 to 3\n" +
			"move 10 from 7 to 2\n" +
			"move 15 from 5 to 2\n" +
			"move 4 from 6 to 3\n" +
			"move 1 from 3 to 2\n" +
			"move 23 from 2 to 5\n" +
			"move 2 from 4 to 6\n" +
			"move 2 from 6 to 7\n" +
			"move 1 from 7 to 2\n" +
			"move 1 from 6 to 9\n" +
			"move 5 from 9 to 8\n" +
			"move 3 from 8 to 7\n" +
			"move 5 from 2 to 6\n" +
			"move 2 from 2 to 3\n" +
			"move 2 from 6 to 3\n" +
			"move 3 from 6 to 2\n" +
			"move 3 from 6 to 8\n" +
			"move 10 from 5 to 9\n" +
			"move 2 from 7 to 5\n" +
			"move 1 from 5 to 8\n" +
			"move 13 from 9 to 5\n" +
			"move 6 from 5 to 6\n" +
			"move 1 from 6 to 1\n" +
			"move 1 from 7 to 3\n" +
			"move 1 from 7 to 3\n" +
			"move 13 from 5 to 6\n" +
			"move 3 from 3 to 5\n" +
			"move 1 from 2 to 1\n" +
			"move 4 from 8 to 9\n" +
			"move 2 from 2 to 6\n" +
			"move 2 from 5 to 3\n" +
			"move 2 from 3 to 6\n" +
			"move 5 from 6 to 4\n" +
			"move 9 from 5 to 9\n" +
			"move 10 from 6 to 9\n" +
			"move 1 from 1 to 7\n" +
			"move 3 from 3 to 9\n" +
			"move 1 from 8 to 1\n" +
			"move 3 from 6 to 3\n" +
			"move 1 from 7 to 6\n" +
			"move 1 from 8 to 7\n" +
			"move 2 from 6 to 1\n" +
			"move 2 from 6 to 4\n" +
			"move 3 from 4 to 6\n" +
			"move 2 from 1 to 4\n" +
			"move 10 from 9 to 6\n" +
			"move 6 from 4 to 9\n" +
			"move 17 from 9 to 1\n" +
			"move 4 from 9 to 5\n" +
			"move 19 from 1 to 7\n" +
			"move 4 from 5 to 6\n" +
			"move 1 from 9 to 3\n" +
			"move 5 from 3 to 4\n" +
			"move 5 from 4 to 8\n" +
			"move 17 from 6 to 9\n" +
			"move 17 from 9 to 2\n" +
			"move 1 from 6 to 1\n" +
			"move 1 from 1 to 2\n" +
			"move 1 from 8 to 3\n" +
			"move 2 from 3 to 2\n" +
			"move 5 from 7 to 1\n" +
			"move 1 from 7 to 3\n" +
			"move 5 from 2 to 9\n" +
			"move 4 from 8 to 2\n" +
			"move 2 from 7 to 8\n" +
			"move 3 from 9 to 3\n" +
			"move 7 from 3 to 9\n" +
			"move 2 from 8 to 7\n" +
			"move 8 from 2 to 9\n" +
			"move 5 from 9 to 6\n" +
			"move 4 from 3 to 9\n" +
			"move 11 from 2 to 3\n" +
			"move 2 from 6 to 5\n" +
			"move 1 from 9 to 4\n" +
			"move 10 from 7 to 3\n" +
			"move 3 from 1 to 8\n" +
			"move 2 from 6 to 7\n" +
			"move 15 from 3 to 8\n" +
			"move 2 from 3 to 2\n" +
			"move 2 from 1 to 3\n" +
			"move 14 from 9 to 6\n" +
			"move 1 from 4 to 9\n" +
			"move 14 from 6 to 3\n" +
			"move 5 from 7 to 2\n" +
			"move 2 from 9 to 2\n" +
			"move 1 from 5 to 3\n" +
			"move 1 from 5 to 8\n" +
			"move 12 from 3 to 7\n" +
			"move 13 from 7 to 8\n" +
			"move 1 from 6 to 7\n" +
			"move 5 from 2 to 6\n" +
			"move 1 from 6 to 2\n" +
			"move 1 from 7 to 6\n" +
			"move 4 from 6 to 8\n" +
			"move 31 from 8 to 7\n" +
			"move 15 from 7 to 8\n" +
			"move 7 from 7 to 5\n" +
			"move 4 from 2 to 3\n" +
			"move 1 from 6 to 2\n" +
			"move 3 from 5 to 8\n" +
			"move 9 from 7 to 4\n" +
			"move 2 from 2 to 9\n" +
			"move 4 from 5 to 6\n" +
			"move 13 from 3 to 9\n" +
			"move 3 from 3 to 5\n" +
			"move 13 from 9 to 1\n" +
			"move 1 from 3 to 2\n" +
			"move 2 from 6 to 5\n" +
			"move 1 from 3 to 4\n" +
			"move 2 from 6 to 5\n" +
			"move 1 from 9 to 1\n" +
			"move 6 from 8 to 9\n" +
			"move 5 from 5 to 2\n" +
			"move 2 from 9 to 8\n" +
			"move 2 from 1 to 6\n" +
			"move 1 from 9 to 4\n" +
			"move 12 from 8 to 4\n" +
			"move 2 from 6 to 9\n" +
			"move 11 from 4 to 3\n" +
			"move 9 from 4 to 2\n" +
			"move 4 from 9 to 7\n" +
			"move 2 from 5 to 6\n" +
			"move 8 from 3 to 4\n" +
			"move 2 from 3 to 9\n" +
			"move 2 from 8 to 9\n" +
			"move 4 from 4 to 9\n" +
			"move 2 from 6 to 7\n" +
			"move 1 from 3 to 7\n" +
			"move 2 from 9 to 1\n" +
			"move 5 from 4 to 2\n" +
			"move 9 from 1 to 8\n" +
			"move 1 from 4 to 9\n" +
			"move 4 from 9 to 3\n" +
			"move 1 from 3 to 6\n" +
			"move 4 from 8 to 7\n" +
			"move 1 from 3 to 6\n" +
			"move 4 from 1 to 7\n" +
			"move 1 from 3 to 8\n" +
			"move 1 from 1 to 8\n" +
			"move 2 from 6 to 7\n" +
			"move 2 from 9 to 1\n" +
			"move 1 from 4 to 5\n" +
			"move 1 from 1 to 5\n" +
			"move 11 from 8 to 4\n" +
			"move 12 from 2 to 8\n" +
			"move 1 from 9 to 8\n" +
			"move 2 from 4 to 5\n" +
			"move 1 from 1 to 8\n" +
			"move 5 from 2 to 1\n" +
			"move 1 from 3 to 2\n" +
			"move 9 from 7 to 3\n" +
			"move 6 from 7 to 5\n" +
			"move 1 from 3 to 4\n" +
			"move 1 from 5 to 1\n" +
			"move 4 from 2 to 5\n" +
			"move 4 from 4 to 1\n" +
			"move 2 from 7 to 3\n" +
			"move 3 from 4 to 1\n" +
			"move 6 from 3 to 7\n" +
			"move 9 from 8 to 7\n" +
			"move 3 from 8 to 7\n" +
			"move 11 from 5 to 9\n" +
			"move 2 from 4 to 8\n" +
			"move 5 from 8 to 7\n" +
			"move 1 from 9 to 8\n" +
			"move 12 from 9 to 5\n" +
			"move 1 from 4 to 5\n" +
			"move 5 from 1 to 8\n" +
			"move 6 from 8 to 3\n" +
			"move 1 from 3 to 8\n" +
			"move 3 from 7 to 9\n" +
			"move 4 from 7 to 6\n" +
			"move 3 from 1 to 3\n" +
			"move 3 from 1 to 6\n" +
			"move 1 from 8 to 1\n" +
			"move 7 from 6 to 2\n" +
			"move 3 from 1 to 8\n" +
			"move 7 from 3 to 4\n" +
			"move 3 from 4 to 1\n" +
			"move 1 from 4 to 2\n" +
			"move 3 from 1 to 2\n" +
			"move 1 from 7 to 6\n" +
			"move 1 from 8 to 5\n" +
			"move 9 from 5 to 3\n" +
			"move 1 from 6 to 9\n" +
			"move 11 from 3 to 6\n" +
			"move 1 from 4 to 1\n" +
			"move 1 from 3 to 4\n" +
			"move 8 from 6 to 9\n" +
			"move 1 from 3 to 1\n" +
			"move 1 from 9 to 1\n" +
			"move 2 from 6 to 2\n" +
			"move 5 from 5 to 7\n" +
			"move 5 from 9 to 3\n" +
			"move 2 from 8 to 5\n" +
			"move 1 from 1 to 2\n" +
			"move 1 from 9 to 1\n" +
			"move 15 from 7 to 4\n" +
			"move 1 from 1 to 6\n" +
			"move 1 from 6 to 9\n" +
			"move 3 from 9 to 3\n" +
			"move 1 from 3 to 5\n" +
			"move 5 from 5 to 3\n" +
			"move 9 from 2 to 9\n" +
			"move 5 from 4 to 1\n" +
			"move 1 from 6 to 7\n" +
			"move 7 from 9 to 3\n" +
			"move 1 from 4 to 7\n" +
			"move 1 from 9 to 6\n" +
			"move 1 from 6 to 5\n" +
			"move 2 from 1 to 4\n" +
			"move 3 from 9 to 3\n" +
			"move 1 from 5 to 6\n" +
			"move 7 from 4 to 3\n" +
			"move 1 from 9 to 3\n" +
			"move 16 from 3 to 1\n" +
			"move 9 from 1 to 3\n" +
			"move 5 from 4 to 2\n" +
			"move 1 from 6 to 9\n" +
			"move 12 from 1 to 9\n" +
			"move 3 from 2 to 9\n" +
			"move 5 from 7 to 3\n" +
			"move 2 from 4 to 8\n" +
			"move 2 from 7 to 2\n" +
			"move 12 from 3 to 5\n" +
			"move 6 from 2 to 9\n" +
			"move 12 from 3 to 1\n" +
			"move 2 from 8 to 6\n" +
			"move 1 from 6 to 1\n" +
			"move 6 from 5 to 8\n" +
			"move 5 from 3 to 2\n" +
			"move 2 from 5 to 8\n" +
			"move 8 from 1 to 8\n" +
			"move 13 from 9 to 7\n" +
			"move 4 from 7 to 5\n" +
			"move 4 from 1 to 4\n" +
			"move 8 from 5 to 6\n" +
			"move 1 from 1 to 6\n" +
			"move 4 from 7 to 3\n" +
			"move 1 from 3 to 1\n" +
			"move 1 from 1 to 9\n" +
			"move 4 from 9 to 5\n" +
			"move 3 from 3 to 7\n" +
			"move 12 from 8 to 7\n" +
			"move 2 from 4 to 3\n" +
			"move 2 from 6 to 9\n" +
			"move 4 from 8 to 2\n" +
			"move 2 from 3 to 9\n" +
			"move 2 from 4 to 7\n" +
			"move 3 from 5 to 7\n" +
			"move 2 from 9 to 7\n" +
			"move 3 from 6 to 1\n" +
			"move 4 from 6 to 7\n" +
			"move 1 from 5 to 4\n" +
			"move 1 from 9 to 3\n" +
			"move 12 from 2 to 5\n" +
			"move 4 from 9 to 7\n" +
			"move 11 from 5 to 1\n" +
			"move 1 from 6 to 5\n" +
			"move 1 from 1 to 4\n" +
			"move 10 from 1 to 2\n" +
			"move 2 from 5 to 1\n" +
			"move 1 from 3 to 5\n" +
			"move 7 from 2 to 5\n" +
			"move 8 from 7 to 8\n" +
			"move 2 from 2 to 8\n" +
			"move 3 from 9 to 4\n" +
			"move 5 from 4 to 3\n" +
			"move 1 from 5 to 7\n" +
			"move 3 from 7 to 1\n" +
			"move 3 from 5 to 8\n" +
			"move 1 from 2 to 5\n" +
			"move 12 from 7 to 6\n" +
			"move 4 from 1 to 3\n" +
			"move 2 from 5 to 6\n" +
			"move 7 from 3 to 7\n" +
			"move 14 from 6 to 4\n" +
			"move 1 from 5 to 6\n" +
			"move 3 from 1 to 3\n" +
			"move 4 from 3 to 2\n" +
			"move 2 from 5 to 8\n" +
			"move 11 from 7 to 4\n" +
			"move 7 from 4 to 5\n" +
			"move 1 from 3 to 4\n" +
			"move 1 from 5 to 6\n" +
			"move 14 from 8 to 7\n" +
			"move 11 from 7 to 3\n" +
			"move 2 from 2 to 6\n" +
			"move 1 from 2 to 3\n" +
			"move 5 from 5 to 4\n" +
			"move 4 from 6 to 4\n" +
			"move 8 from 7 to 8\n" +
			"move 3 from 7 to 3\n" +
			"move 1 from 2 to 1\n" +
			"move 5 from 8 to 2\n" +
			"move 4 from 4 to 3\n" +
			"move 1 from 2 to 9\n" +
			"move 1 from 1 to 9\n" +
			"move 3 from 2 to 1\n" +
			"move 1 from 5 to 4\n" +
			"move 3 from 8 to 1\n" +
			"move 1 from 7 to 4\n" +
			"move 4 from 3 to 9\n" +
			"move 1 from 8 to 7\n" +
			"move 2 from 9 to 1\n" +
			"move 6 from 3 to 4\n" +
			"move 28 from 4 to 7\n" +
			"move 15 from 7 to 8\n" +
			"move 3 from 3 to 8\n" +
			"move 1 from 2 to 9\n" +
			"move 2 from 3 to 2\n" +
			"move 7 from 1 to 4\n" +
			"move 10 from 4 to 5\n" +
			"move 10 from 5 to 6\n" +
			"move 3 from 8 to 2\n" +
			"move 1 from 1 to 7\n" +
			"move 1 from 4 to 7\n" +
			"move 1 from 9 to 6\n" +
			"move 9 from 6 to 7\n" +
			"move 1 from 2 to 4\n" +
			"move 1 from 9 to 5";

	static String input2 = "    [V] [G]             [H]        \n" +
								"[Z] [H] [Z]         [T] [S]        \n" +
								"[P] [D] [F]         [B] [V] [Q]    \n" +
								"[B] [M] [V] [N]     [F] [D] [N]    \n" +
								"[Q] [Q] [D] [F]     [Z] [Z] [P] [M]\n" +
								"[M] [Z] [R] [D] [Q] [V] [T] [F] [R]\n" +
								"[D] [L] [H] [G] [F] [Q] [M] [G] [W]\n" +
								"[N] [C] [Q] [H] [N] [D] [Q] [M] [B]\n" +
								" 1   2   3   4   5   6   7   8   9 ";

	public static void main(String... args) {
		int total = 0;

		Map<Integer, List<String>> crates = new HashMap() {{
			put(1, new ArrayList() {{
				add("Z");
				add("P");
				add("B");
				add("Q");
				add("M");
				add("D");
				add("N");
			}});
			put(2, new ArrayList() {{
				add("V");
				add("H");
				add("D");
				add("M");
				add("Q");
				add("Z");
				add("L");
				add("C");
			}});
			put(3, new ArrayList() {{
				add("G");
				add("Z");
				add("F");
				add("V");
				add("D");
				add("R");
				add("H");
				add("Q");
			}});
			put(4, new ArrayList() {{
				add("N");
				add("F");
				add("D");
				add("G");
				add("H");
			}});
			put(5, new ArrayList() {{
				add("Q");
				add("F");
				add("N");
			}});
			put(6, new ArrayList() {{
				add("T");
				add("B");
				add("F");
				add("Z");
				add("F");
				add("Q");
				add("D");
			}});
			put(7, new ArrayList() {{
				add("H");
				add("S");
				add("V");
				add("D");
				add("Z");
				add("T");
				add("M");
				add("Q");
			}});
			put(8, new ArrayList() {{
				add("Q");
				add("N");
				add("P");
				add("F");
				add("G");
				add("M");
			}});
			put(9, new ArrayList() {{
				add("M");
				add("R");
				add("W");
				add("B");
			}});
		}};

		Map<Integer, List<String>> crates2 = new HashMap() {{
			put(1, new ArrayList() {{
				add("N");
				add("Z");
			}});
			put(2, new ArrayList() {{
				add("D");
				add("C");
				add("M");
			}});
			put(3, new ArrayList() {{
				add("P");
			}});
		}};

		List<Amts> list = new ArrayList<>();



		for (int i = 0; i < input.split("\n").length; i++) {
			String ii = input.split("\n")[i];
			String amt =  ii.split(" from ")[0].split("move ")[1];
			String from =  ii.split(" from ")[1].split(" to ")[0];
			String to =  ii.split(" from ")[1].split(" to ")[1];
			Amts amts = new Amts();
			amts.amt = Integer.parseInt(amt);
			amts.from = Integer.parseInt(from);
			amts.to = Integer.parseInt(to);
			list.add(amts);
		}

		for (Amts amts: list) {
			List<String> pileFrom = crates.get(amts.from);
			List<String> pileTo = crates.get(amts.to);
			List<String> sub = new ArrayList<>();

			for (int i = 0; i < amts.amt; i++) {
				sub.add(0, pileFrom.get(i));
			}
			for (String s : sub) {
				pileTo.add(0, s);
			}
			for (int i = 0; i < amts.amt; i++) {
				pileFrom.remove(0);
			}

			int total2 = 0;
			for (Map.Entry<Integer, List<String>> entry: crates.entrySet()) {
				total2 += entry.getValue().size();
			}

			System.out.println(total2);

		}

		for (Map.Entry<Integer, List<String>> entry: crates.entrySet()) {
			System.out.println(entry.getValue().get(0));
		}
	}

	static class Amts {
		public int amt;
		public int from;
		public int to;
	}
}
