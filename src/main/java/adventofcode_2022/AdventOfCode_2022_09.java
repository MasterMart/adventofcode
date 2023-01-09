package adventofcode_2022;


import utils.AdventOfCodeUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AdventOfCode_2022_09 {

	static String input = "R 1\n" +
			"U 2\n" +
			"R 1\n" +
			"L 2\n" +
			"U 2\n" +
			"D 2\n" +
			"L 2\n" +
			"U 2\n" +
			"L 2\n" +
			"R 2\n" +
			"D 2\n" +
			"L 1\n" +
			"D 2\n" +
			"L 2\n" +
			"U 1\n" +
			"L 1\n" +
			"R 2\n" +
			"L 1\n" +
			"R 1\n" +
			"U 2\n" +
			"D 1\n" +
			"U 2\n" +
			"L 1\n" +
			"U 2\n" +
			"D 1\n" +
			"L 1\n" +
			"D 1\n" +
			"L 1\n" +
			"D 2\n" +
			"U 1\n" +
			"D 1\n" +
			"U 1\n" +
			"R 2\n" +
			"U 1\n" +
			"L 2\n" +
			"D 2\n" +
			"U 1\n" +
			"D 2\n" +
			"R 2\n" +
			"L 1\n" +
			"D 1\n" +
			"R 1\n" +
			"U 2\n" +
			"R 2\n" +
			"D 2\n" +
			"L 2\n" +
			"U 1\n" +
			"L 1\n" +
			"U 2\n" +
			"D 1\n" +
			"U 2\n" +
			"R 1\n" +
			"D 1\n" +
			"R 1\n" +
			"L 2\n" +
			"R 2\n" +
			"U 1\n" +
			"D 2\n" +
			"L 2\n" +
			"U 2\n" +
			"D 1\n" +
			"L 1\n" +
			"U 2\n" +
			"D 2\n" +
			"U 1\n" +
			"L 2\n" +
			"R 2\n" +
			"D 1\n" +
			"L 1\n" +
			"D 1\n" +
			"U 2\n" +
			"R 2\n" +
			"D 1\n" +
			"U 1\n" +
			"R 2\n" +
			"D 2\n" +
			"U 2\n" +
			"L 1\n" +
			"R 2\n" +
			"U 1\n" +
			"R 2\n" +
			"L 2\n" +
			"U 2\n" +
			"R 2\n" +
			"L 1\n" +
			"R 1\n" +
			"U 1\n" +
			"R 1\n" +
			"U 1\n" +
			"L 1\n" +
			"D 1\n" +
			"R 1\n" +
			"U 2\n" +
			"D 2\n" +
			"U 2\n" +
			"L 1\n" +
			"D 2\n" +
			"U 1\n" +
			"R 2\n" +
			"D 2\n" +
			"L 1\n" +
			"D 2\n" +
			"L 1\n" +
			"U 1\n" +
			"R 1\n" +
			"L 1\n" +
			"U 1\n" +
			"D 2\n" +
			"U 1\n" +
			"R 2\n" +
			"D 1\n" +
			"U 1\n" +
			"D 1\n" +
			"R 3\n" +
			"L 3\n" +
			"R 2\n" +
			"D 2\n" +
			"U 3\n" +
			"R 3\n" +
			"U 1\n" +
			"D 1\n" +
			"L 3\n" +
			"D 3\n" +
			"L 2\n" +
			"U 3\n" +
			"R 2\n" +
			"U 2\n" +
			"L 3\n" +
			"R 2\n" +
			"D 3\n" +
			"R 1\n" +
			"D 2\n" +
			"R 1\n" +
			"L 1\n" +
			"D 3\n" +
			"R 2\n" +
			"D 1\n" +
			"U 2\n" +
			"L 2\n" +
			"U 1\n" +
			"L 1\n" +
			"D 2\n" +
			"R 2\n" +
			"U 1\n" +
			"R 3\n" +
			"U 2\n" +
			"R 2\n" +
			"D 3\n" +
			"L 2\n" +
			"D 2\n" +
			"R 2\n" +
			"L 3\n" +
			"D 1\n" +
			"U 3\n" +
			"L 2\n" +
			"R 2\n" +
			"L 3\n" +
			"U 2\n" +
			"R 3\n" +
			"U 3\n" +
			"L 2\n" +
			"U 3\n" +
			"R 1\n" +
			"L 3\n" +
			"D 3\n" +
			"U 2\n" +
			"L 1\n" +
			"U 3\n" +
			"R 2\n" +
			"L 1\n" +
			"U 2\n" +
			"R 1\n" +
			"U 1\n" +
			"L 2\n" +
			"R 2\n" +
			"D 1\n" +
			"L 1\n" +
			"U 2\n" +
			"D 1\n" +
			"L 1\n" +
			"D 1\n" +
			"L 1\n" +
			"D 2\n" +
			"U 2\n" +
			"D 3\n" +
			"R 2\n" +
			"D 3\n" +
			"L 3\n" +
			"R 3\n" +
			"U 2\n" +
			"L 2\n" +
			"U 2\n" +
			"L 2\n" +
			"U 2\n" +
			"L 3\n" +
			"U 1\n" +
			"L 2\n" +
			"D 3\n" +
			"L 3\n" +
			"R 3\n" +
			"D 2\n" +
			"U 3\n" +
			"R 1\n" +
			"L 2\n" +
			"R 3\n" +
			"D 1\n" +
			"U 2\n" +
			"R 3\n" +
			"L 3\n" +
			"R 3\n" +
			"U 3\n" +
			"R 2\n" +
			"L 2\n" +
			"R 2\n" +
			"D 2\n" +
			"R 3\n" +
			"D 2\n" +
			"U 3\n" +
			"L 3\n" +
			"D 3\n" +
			"R 3\n" +
			"U 3\n" +
			"R 4\n" +
			"L 3\n" +
			"D 2\n" +
			"L 4\n" +
			"D 2\n" +
			"U 2\n" +
			"L 1\n" +
			"R 3\n" +
			"U 2\n" +
			"R 2\n" +
			"L 4\n" +
			"D 2\n" +
			"R 2\n" +
			"D 2\n" +
			"U 2\n" +
			"R 4\n" +
			"D 1\n" +
			"L 1\n" +
			"U 1\n" +
			"L 3\n" +
			"D 3\n" +
			"U 1\n" +
			"R 1\n" +
			"D 4\n" +
			"U 2\n" +
			"L 3\n" +
			"U 3\n" +
			"D 2\n" +
			"R 3\n" +
			"L 1\n" +
			"R 1\n" +
			"L 1\n" +
			"R 3\n" +
			"L 1\n" +
			"R 1\n" +
			"D 1\n" +
			"R 3\n" +
			"D 3\n" +
			"R 2\n" +
			"U 3\n" +
			"R 2\n" +
			"D 1\n" +
			"L 3\n" +
			"D 2\n" +
			"U 3\n" +
			"D 2\n" +
			"L 4\n" +
			"D 3\n" +
			"R 1\n" +
			"L 4\n" +
			"D 2\n" +
			"R 1\n" +
			"U 3\n" +
			"L 1\n" +
			"R 4\n" +
			"L 3\n" +
			"U 4\n" +
			"R 2\n" +
			"U 1\n" +
			"R 4\n" +
			"L 1\n" +
			"R 1\n" +
			"U 3\n" +
			"D 3\n" +
			"R 3\n" +
			"U 1\n" +
			"L 4\n" +
			"R 4\n" +
			"U 2\n" +
			"R 1\n" +
			"D 2\n" +
			"L 4\n" +
			"R 1\n" +
			"D 2\n" +
			"U 2\n" +
			"L 1\n" +
			"U 4\n" +
			"R 2\n" +
			"D 2\n" +
			"R 3\n" +
			"U 1\n" +
			"L 2\n" +
			"R 3\n" +
			"U 4\n" +
			"R 2\n" +
			"L 1\n" +
			"U 1\n" +
			"R 4\n" +
			"L 2\n" +
			"R 1\n" +
			"L 2\n" +
			"D 3\n" +
			"U 4\n" +
			"L 3\n" +
			"U 4\n" +
			"L 4\n" +
			"U 4\n" +
			"D 3\n" +
			"U 3\n" +
			"L 1\n" +
			"D 1\n" +
			"U 1\n" +
			"D 1\n" +
			"L 4\n" +
			"D 4\n" +
			"L 2\n" +
			"U 4\n" +
			"L 3\n" +
			"D 2\n" +
			"L 1\n" +
			"U 1\n" +
			"D 4\n" +
			"R 1\n" +
			"L 4\n" +
			"U 5\n" +
			"R 5\n" +
			"U 3\n" +
			"D 1\n" +
			"L 4\n" +
			"U 1\n" +
			"L 1\n" +
			"U 2\n" +
			"D 4\n" +
			"R 5\n" +
			"U 5\n" +
			"D 5\n" +
			"L 4\n" +
			"R 4\n" +
			"L 5\n" +
			"U 1\n" +
			"L 1\n" +
			"U 4\n" +
			"L 1\n" +
			"R 5\n" +
			"L 5\n" +
			"R 1\n" +
			"D 2\n" +
			"U 5\n" +
			"R 4\n" +
			"U 3\n" +
			"D 2\n" +
			"U 5\n" +
			"L 3\n" +
			"D 4\n" +
			"U 1\n" +
			"D 2\n" +
			"U 3\n" +
			"R 1\n" +
			"D 2\n" +
			"L 3\n" +
			"U 4\n" +
			"D 1\n" +
			"L 5\n" +
			"D 2\n" +
			"U 3\n" +
			"D 4\n" +
			"R 3\n" +
			"U 1\n" +
			"R 1\n" +
			"D 4\n" +
			"L 5\n" +
			"R 3\n" +
			"L 3\n" +
			"R 5\n" +
			"L 4\n" +
			"R 5\n" +
			"D 4\n" +
			"R 5\n" +
			"U 1\n" +
			"R 2\n" +
			"D 4\n" +
			"R 4\n" +
			"U 2\n" +
			"L 5\n" +
			"R 3\n" +
			"D 5\n" +
			"U 4\n" +
			"D 2\n" +
			"U 5\n" +
			"L 2\n" +
			"R 5\n" +
			"L 3\n" +
			"D 2\n" +
			"R 3\n" +
			"U 5\n" +
			"L 5\n" +
			"D 5\n" +
			"U 2\n" +
			"R 5\n" +
			"U 1\n" +
			"D 2\n" +
			"R 1\n" +
			"L 1\n" +
			"R 3\n" +
			"U 2\n" +
			"D 4\n" +
			"U 1\n" +
			"R 3\n" +
			"U 5\n" +
			"D 5\n" +
			"L 3\n" +
			"U 1\n" +
			"D 1\n" +
			"L 4\n" +
			"R 4\n" +
			"L 4\n" +
			"R 1\n" +
			"U 2\n" +
			"L 3\n" +
			"R 2\n" +
			"U 2\n" +
			"L 1\n" +
			"U 1\n" +
			"L 5\n" +
			"U 3\n" +
			"R 2\n" +
			"U 3\n" +
			"D 1\n" +
			"R 4\n" +
			"D 5\n" +
			"L 1\n" +
			"D 1\n" +
			"U 3\n" +
			"D 2\n" +
			"U 5\n" +
			"L 6\n" +
			"D 2\n" +
			"R 6\n" +
			"D 3\n" +
			"U 4\n" +
			"R 3\n" +
			"U 5\n" +
			"D 4\n" +
			"U 5\n" +
			"D 1\n" +
			"L 3\n" +
			"U 5\n" +
			"R 3\n" +
			"U 1\n" +
			"D 2\n" +
			"R 4\n" +
			"U 3\n" +
			"L 6\n" +
			"D 2\n" +
			"R 4\n" +
			"D 2\n" +
			"L 2\n" +
			"U 6\n" +
			"R 4\n" +
			"U 1\n" +
			"R 4\n" +
			"U 6\n" +
			"L 6\n" +
			"U 4\n" +
			"L 3\n" +
			"D 2\n" +
			"U 4\n" +
			"L 3\n" +
			"R 4\n" +
			"D 4\n" +
			"U 2\n" +
			"L 2\n" +
			"D 1\n" +
			"U 3\n" +
			"L 5\n" +
			"R 3\n" +
			"L 4\n" +
			"D 5\n" +
			"R 1\n" +
			"U 4\n" +
			"L 2\n" +
			"U 4\n" +
			"R 2\n" +
			"L 5\n" +
			"R 6\n" +
			"D 1\n" +
			"U 1\n" +
			"R 6\n" +
			"D 6\n" +
			"U 6\n" +
			"R 6\n" +
			"U 6\n" +
			"R 2\n" +
			"U 6\n" +
			"R 4\n" +
			"D 4\n" +
			"U 5\n" +
			"D 5\n" +
			"R 2\n" +
			"D 1\n" +
			"R 6\n" +
			"D 5\n" +
			"R 2\n" +
			"D 1\n" +
			"L 6\n" +
			"D 5\n" +
			"L 5\n" +
			"D 6\n" +
			"U 5\n" +
			"D 1\n" +
			"U 5\n" +
			"L 1\n" +
			"R 5\n" +
			"L 5\n" +
			"U 5\n" +
			"R 3\n" +
			"U 2\n" +
			"D 6\n" +
			"L 5\n" +
			"U 5\n" +
			"D 5\n" +
			"R 3\n" +
			"D 1\n" +
			"U 6\n" +
			"R 6\n" +
			"D 5\n" +
			"U 5\n" +
			"R 1\n" +
			"D 5\n" +
			"L 3\n" +
			"R 4\n" +
			"U 5\n" +
			"R 5\n" +
			"U 3\n" +
			"D 3\n" +
			"L 5\n" +
			"U 2\n" +
			"L 3\n" +
			"U 2\n" +
			"L 5\n" +
			"R 6\n" +
			"L 1\n" +
			"D 3\n" +
			"U 5\n" +
			"R 5\n" +
			"L 5\n" +
			"U 2\n" +
			"R 4\n" +
			"D 6\n" +
			"L 3\n" +
			"R 2\n" +
			"U 6\n" +
			"D 3\n" +
			"R 6\n" +
			"D 7\n" +
			"L 3\n" +
			"U 2\n" +
			"L 3\n" +
			"D 4\n" +
			"L 2\n" +
			"U 3\n" +
			"D 2\n" +
			"L 4\n" +
			"D 5\n" +
			"R 2\n" +
			"L 3\n" +
			"D 2\n" +
			"R 6\n" +
			"U 6\n" +
			"D 1\n" +
			"R 5\n" +
			"U 1\n" +
			"R 5\n" +
			"U 7\n" +
			"L 6\n" +
			"U 6\n" +
			"L 4\n" +
			"D 7\n" +
			"U 4\n" +
			"R 2\n" +
			"L 7\n" +
			"U 7\n" +
			"L 5\n" +
			"D 4\n" +
			"U 4\n" +
			"R 6\n" +
			"U 4\n" +
			"R 3\n" +
			"U 3\n" +
			"R 4\n" +
			"U 2\n" +
			"R 2\n" +
			"D 4\n" +
			"U 2\n" +
			"R 1\n" +
			"D 2\n" +
			"L 5\n" +
			"D 6\n" +
			"R 6\n" +
			"U 7\n" +
			"L 2\n" +
			"D 4\n" +
			"L 4\n" +
			"D 7\n" +
			"U 7\n" +
			"D 5\n" +
			"L 3\n" +
			"U 5\n" +
			"R 2\n" +
			"D 2\n" +
			"L 6\n" +
			"R 1\n" +
			"D 1\n" +
			"R 5\n" +
			"D 2\n" +
			"R 3\n" +
			"D 5\n" +
			"U 3\n" +
			"L 5\n" +
			"R 7\n" +
			"U 2\n" +
			"R 6\n" +
			"U 5\n" +
			"D 3\n" +
			"R 3\n" +
			"U 4\n" +
			"D 6\n" +
			"U 2\n" +
			"L 4\n" +
			"U 1\n" +
			"R 2\n" +
			"L 6\n" +
			"U 6\n" +
			"R 2\n" +
			"U 6\n" +
			"D 3\n" +
			"L 4\n" +
			"R 1\n" +
			"L 7\n" +
			"D 5\n" +
			"U 3\n" +
			"D 5\n" +
			"R 7\n" +
			"U 1\n" +
			"L 1\n" +
			"U 3\n" +
			"R 5\n" +
			"D 6\n" +
			"R 3\n" +
			"U 7\n" +
			"L 3\n" +
			"R 1\n" +
			"L 7\n" +
			"U 3\n" +
			"D 6\n" +
			"R 4\n" +
			"L 2\n" +
			"D 4\n" +
			"R 6\n" +
			"L 4\n" +
			"D 8\n" +
			"R 3\n" +
			"D 5\n" +
			"L 2\n" +
			"R 2\n" +
			"L 4\n" +
			"U 3\n" +
			"R 1\n" +
			"U 1\n" +
			"D 3\n" +
			"L 1\n" +
			"R 6\n" +
			"U 5\n" +
			"D 6\n" +
			"U 3\n" +
			"D 3\n" +
			"L 7\n" +
			"U 3\n" +
			"D 6\n" +
			"L 2\n" +
			"R 2\n" +
			"D 7\n" +
			"L 7\n" +
			"D 6\n" +
			"L 2\n" +
			"R 3\n" +
			"L 1\n" +
			"R 2\n" +
			"U 3\n" +
			"L 6\n" +
			"D 3\n" +
			"U 5\n" +
			"L 3\n" +
			"U 4\n" +
			"R 8\n" +
			"L 5\n" +
			"U 5\n" +
			"R 3\n" +
			"D 4\n" +
			"R 1\n" +
			"L 7\n" +
			"U 4\n" +
			"R 4\n" +
			"D 8\n" +
			"U 8\n" +
			"D 4\n" +
			"L 8\n" +
			"U 3\n" +
			"L 3\n" +
			"R 4\n" +
			"L 1\n" +
			"U 3\n" +
			"D 4\n" +
			"R 5\n" +
			"L 4\n" +
			"R 3\n" +
			"L 7\n" +
			"R 1\n" +
			"U 1\n" +
			"D 2\n" +
			"L 8\n" +
			"U 5\n" +
			"R 2\n" +
			"L 7\n" +
			"U 1\n" +
			"L 8\n" +
			"R 4\n" +
			"U 3\n" +
			"R 7\n" +
			"U 6\n" +
			"L 3\n" +
			"U 6\n" +
			"L 3\n" +
			"U 3\n" +
			"D 8\n" +
			"L 5\n" +
			"D 7\n" +
			"U 1\n" +
			"L 2\n" +
			"R 4\n" +
			"L 4\n" +
			"R 1\n" +
			"D 8\n" +
			"R 8\n" +
			"L 4\n" +
			"R 5\n" +
			"L 2\n" +
			"R 8\n" +
			"L 7\n" +
			"D 4\n" +
			"L 1\n" +
			"U 1\n" +
			"R 2\n" +
			"U 1\n" +
			"L 2\n" +
			"D 1\n" +
			"L 2\n" +
			"R 8\n" +
			"U 2\n" +
			"L 8\n" +
			"D 5\n" +
			"L 4\n" +
			"R 6\n" +
			"U 1\n" +
			"D 2\n" +
			"L 5\n" +
			"R 7\n" +
			"L 6\n" +
			"R 1\n" +
			"L 2\n" +
			"R 3\n" +
			"L 2\n" +
			"D 2\n" +
			"L 3\n" +
			"R 4\n" +
			"U 7\n" +
			"R 6\n" +
			"D 3\n" +
			"L 4\n" +
			"D 6\n" +
			"R 3\n" +
			"D 6\n" +
			"R 8\n" +
			"U 1\n" +
			"R 6\n" +
			"D 1\n" +
			"U 7\n" +
			"D 9\n" +
			"R 2\n" +
			"D 1\n" +
			"U 6\n" +
			"R 3\n" +
			"D 5\n" +
			"U 5\n" +
			"L 6\n" +
			"U 3\n" +
			"D 7\n" +
			"L 2\n" +
			"D 6\n" +
			"L 5\n" +
			"U 4\n" +
			"L 2\n" +
			"D 5\n" +
			"L 3\n" +
			"D 4\n" +
			"U 7\n" +
			"L 4\n" +
			"D 9\n" +
			"R 3\n" +
			"L 5\n" +
			"R 5\n" +
			"L 5\n" +
			"U 1\n" +
			"R 8\n" +
			"L 6\n" +
			"U 2\n" +
			"D 2\n" +
			"R 3\n" +
			"L 5\n" +
			"D 7\n" +
			"L 4\n" +
			"U 4\n" +
			"D 9\n" +
			"L 8\n" +
			"R 1\n" +
			"L 5\n" +
			"R 8\n" +
			"D 9\n" +
			"R 6\n" +
			"L 6\n" +
			"U 6\n" +
			"R 3\n" +
			"U 5\n" +
			"R 8\n" +
			"U 4\n" +
			"L 8\n" +
			"U 3\n" +
			"R 2\n" +
			"L 7\n" +
			"R 9\n" +
			"U 6\n" +
			"L 2\n" +
			"U 2\n" +
			"D 9\n" +
			"U 6\n" +
			"R 5\n" +
			"D 8\n" +
			"R 1\n" +
			"D 1\n" +
			"L 4\n" +
			"U 2\n" +
			"D 9\n" +
			"L 9\n" +
			"D 5\n" +
			"U 9\n" +
			"R 2\n" +
			"D 6\n" +
			"R 9\n" +
			"L 1\n" +
			"R 2\n" +
			"U 1\n" +
			"L 7\n" +
			"R 4\n" +
			"U 4\n" +
			"L 2\n" +
			"U 2\n" +
			"L 5\n" +
			"D 5\n" +
			"L 6\n" +
			"D 2\n" +
			"R 8\n" +
			"L 4\n" +
			"D 9\n" +
			"R 8\n" +
			"L 2\n" +
			"D 4\n" +
			"R 2\n" +
			"L 6\n" +
			"R 10\n" +
			"U 7\n" +
			"L 4\n" +
			"U 9\n" +
			"R 8\n" +
			"D 9\n" +
			"U 10\n" +
			"R 2\n" +
			"L 4\n" +
			"U 7\n" +
			"D 8\n" +
			"R 8\n" +
			"D 5\n" +
			"L 5\n" +
			"D 5\n" +
			"L 2\n" +
			"D 1\n" +
			"U 5\n" +
			"D 6\n" +
			"R 7\n" +
			"L 10\n" +
			"U 9\n" +
			"R 3\n" +
			"D 9\n" +
			"U 2\n" +
			"L 8\n" +
			"U 3\n" +
			"D 2\n" +
			"U 5\n" +
			"D 5\n" +
			"R 2\n" +
			"U 5\n" +
			"R 4\n" +
			"L 8\n" +
			"U 10\n" +
			"L 7\n" +
			"D 4\n" +
			"L 1\n" +
			"U 7\n" +
			"L 10\n" +
			"R 1\n" +
			"L 6\n" +
			"D 10\n" +
			"R 2\n" +
			"U 3\n" +
			"D 1\n" +
			"R 2\n" +
			"D 2\n" +
			"U 6\n" +
			"L 1\n" +
			"D 2\n" +
			"U 5\n" +
			"D 6\n" +
			"L 4\n" +
			"D 3\n" +
			"R 4\n" +
			"L 3\n" +
			"D 10\n" +
			"U 2\n" +
			"R 8\n" +
			"U 5\n" +
			"L 5\n" +
			"R 8\n" +
			"D 6\n" +
			"L 8\n" +
			"U 8\n" +
			"R 9\n" +
			"U 3\n" +
			"L 9\n" +
			"U 2\n" +
			"R 5\n" +
			"U 1\n" +
			"R 1\n" +
			"D 2\n" +
			"L 3\n" +
			"R 9\n" +
			"D 10\n" +
			"L 2\n" +
			"R 9\n" +
			"D 4\n" +
			"L 7\n" +
			"U 7\n" +
			"R 2\n" +
			"D 10\n" +
			"U 5\n" +
			"R 9\n" +
			"L 6\n" +
			"D 4\n" +
			"U 10\n" +
			"R 5\n" +
			"D 2\n" +
			"R 7\n" +
			"U 10\n" +
			"L 3\n" +
			"D 9\n" +
			"L 3\n" +
			"R 6\n" +
			"L 8\n" +
			"U 5\n" +
			"R 10\n" +
			"L 9\n" +
			"U 4\n" +
			"R 8\n" +
			"D 2\n" +
			"R 4\n" +
			"U 10\n" +
			"L 1\n" +
			"U 9\n" +
			"L 9\n" +
			"R 3\n" +
			"D 4\n" +
			"L 7\n" +
			"R 6\n" +
			"D 8\n" +
			"L 5\n" +
			"R 9\n" +
			"L 8\n" +
			"R 7\n" +
			"D 10\n" +
			"L 3\n" +
			"D 3\n" +
			"U 6\n" +
			"L 5\n" +
			"R 5\n" +
			"L 9\n" +
			"R 2\n" +
			"D 2\n" +
			"U 5\n" +
			"R 8\n" +
			"D 11\n" +
			"U 10\n" +
			"L 3\n" +
			"D 6\n" +
			"U 11\n" +
			"R 11\n" +
			"U 4\n" +
			"D 7\n" +
			"L 8\n" +
			"R 10\n" +
			"U 10\n" +
			"L 5\n" +
			"R 7\n" +
			"L 4\n" +
			"U 2\n" +
			"L 5\n" +
			"U 3\n" +
			"D 6\n" +
			"U 11\n" +
			"D 6\n" +
			"L 1\n" +
			"D 10\n" +
			"L 6\n" +
			"D 9\n" +
			"R 3\n" +
			"D 5\n" +
			"R 6\n" +
			"U 5\n" +
			"L 7\n" +
			"R 9\n" +
			"D 5\n" +
			"R 11\n" +
			"D 10\n" +
			"U 1\n" +
			"L 2\n" +
			"R 8\n" +
			"L 6\n" +
			"D 5\n" +
			"U 10\n" +
			"L 10\n" +
			"R 5\n" +
			"U 2\n" +
			"D 3\n" +
			"L 2\n" +
			"R 6\n" +
			"D 6\n" +
			"L 1\n" +
			"U 5\n" +
			"R 8\n" +
			"D 7\n" +
			"R 10\n" +
			"L 4\n" +
			"D 2\n" +
			"R 10\n" +
			"U 8\n" +
			"L 10\n" +
			"R 7\n" +
			"U 8\n" +
			"D 7\n" +
			"U 3\n" +
			"R 8\n" +
			"D 10\n" +
			"U 11\n" +
			"D 11\n" +
			"L 4\n" +
			"U 5\n" +
			"R 10\n" +
			"U 2\n" +
			"L 11\n" +
			"U 10\n" +
			"R 10\n" +
			"U 1\n" +
			"D 6\n" +
			"U 1\n" +
			"L 3\n" +
			"R 11\n" +
			"L 2\n" +
			"U 3\n" +
			"D 1\n" +
			"U 11\n" +
			"L 2\n" +
			"D 4\n" +
			"R 9\n" +
			"L 2\n" +
			"D 7\n" +
			"U 1\n" +
			"R 2\n" +
			"L 8\n" +
			"R 6\n" +
			"D 4\n" +
			"R 1\n" +
			"L 6\n" +
			"D 4\n" +
			"U 8\n" +
			"D 8\n" +
			"R 5\n" +
			"U 11\n" +
			"R 6\n" +
			"U 11\n" +
			"R 11\n" +
			"U 7\n" +
			"R 9\n" +
			"D 4\n" +
			"R 1\n" +
			"D 9\n" +
			"R 3\n" +
			"L 9\n" +
			"U 4\n" +
			"R 6\n" +
			"D 5\n" +
			"L 3\n" +
			"R 11\n" +
			"U 11\n" +
			"L 6\n" +
			"R 11\n" +
			"L 7\n" +
			"D 1\n" +
			"R 10\n" +
			"D 2\n" +
			"U 8\n" +
			"R 4\n" +
			"L 6\n" +
			"R 4\n" +
			"U 4\n" +
			"D 12\n" +
			"R 6\n" +
			"L 12\n" +
			"R 9\n" +
			"L 8\n" +
			"R 2\n" +
			"L 12\n" +
			"U 2\n" +
			"L 9\n" +
			"D 2\n" +
			"U 8\n" +
			"D 9\n" +
			"R 12\n" +
			"U 6\n" +
			"L 2\n" +
			"U 11\n" +
			"R 5\n" +
			"D 7\n" +
			"U 11\n" +
			"D 1\n" +
			"R 6\n" +
			"U 3\n" +
			"D 9\n" +
			"L 2\n" +
			"R 1\n" +
			"D 6\n" +
			"R 12\n" +
			"D 5\n" +
			"L 11\n" +
			"R 11\n" +
			"L 3\n" +
			"R 11\n" +
			"L 1\n" +
			"D 11\n" +
			"U 10\n" +
			"L 2\n" +
			"R 2\n" +
			"U 8\n" +
			"D 3\n" +
			"U 3\n" +
			"L 4\n" +
			"D 8\n" +
			"L 2\n" +
			"D 9\n" +
			"R 10\n" +
			"D 9\n" +
			"U 11\n" +
			"L 3\n" +
			"D 4\n" +
			"L 5\n" +
			"U 4\n" +
			"R 5\n" +
			"D 12\n" +
			"U 2\n" +
			"L 11\n" +
			"R 1\n" +
			"L 6\n" +
			"D 11\n" +
			"R 9\n" +
			"U 10\n" +
			"D 2\n" +
			"L 12\n" +
			"D 7\n" +
			"U 9\n" +
			"D 12\n" +
			"U 5\n" +
			"L 4\n" +
			"D 7\n" +
			"L 11\n" +
			"D 7\n" +
			"L 2\n" +
			"D 10\n" +
			"R 7\n" +
			"D 1\n" +
			"R 9\n" +
			"U 4\n" +
			"D 12\n" +
			"U 4\n" +
			"R 3\n" +
			"D 1\n" +
			"L 6\n" +
			"D 3\n" +
			"R 9\n" +
			"L 12\n" +
			"D 10\n" +
			"U 2\n" +
			"L 12\n" +
			"D 6\n" +
			"L 2\n" +
			"D 5\n" +
			"L 1\n" +
			"U 4\n" +
			"L 5\n" +
			"U 5\n" +
			"R 7\n" +
			"U 9\n" +
			"R 4\n" +
			"D 9\n" +
			"L 13\n" +
			"U 2\n" +
			"L 8\n" +
			"U 1\n" +
			"R 10\n" +
			"L 5\n" +
			"U 2\n" +
			"L 7\n" +
			"U 6\n" +
			"L 10\n" +
			"U 11\n" +
			"R 2\n" +
			"U 6\n" +
			"R 13\n" +
			"D 4\n" +
			"U 3\n" +
			"R 11\n" +
			"D 2\n" +
			"U 7\n" +
			"D 4\n" +
			"R 13\n" +
			"L 7\n" +
			"R 11\n" +
			"L 8\n" +
			"U 4\n" +
			"R 13\n" +
			"D 9\n" +
			"U 11\n" +
			"L 4\n" +
			"D 10\n" +
			"U 8\n" +
			"D 8\n" +
			"R 6\n" +
			"U 7\n" +
			"L 8\n" +
			"R 2\n" +
			"U 7\n" +
			"L 12\n" +
			"R 2\n" +
			"D 8\n" +
			"L 7\n" +
			"U 6\n" +
			"D 6\n" +
			"L 9\n" +
			"R 8\n" +
			"L 11\n" +
			"U 6\n" +
			"D 3\n" +
			"U 2\n" +
			"L 2\n" +
			"R 1\n" +
			"U 7\n" +
			"L 6\n" +
			"U 5\n" +
			"D 6\n" +
			"U 11\n" +
			"D 11\n" +
			"U 8\n" +
			"R 12\n" +
			"L 7\n" +
			"R 3\n" +
			"D 8\n" +
			"L 11\n" +
			"U 6\n" +
			"D 10\n" +
			"L 2\n" +
			"D 6\n" +
			"L 5\n" +
			"D 10\n" +
			"U 12\n" +
			"D 6\n" +
			"R 10\n" +
			"D 4\n" +
			"R 13\n" +
			"U 2\n" +
			"D 3\n" +
			"L 9\n" +
			"U 12\n" +
			"L 10\n" +
			"D 11\n" +
			"R 7\n" +
			"D 5\n" +
			"L 5\n" +
			"D 2\n" +
			"L 11\n" +
			"U 6\n" +
			"L 1\n" +
			"U 11\n" +
			"D 5\n" +
			"R 8\n" +
			"U 1\n" +
			"D 11\n" +
			"U 8\n" +
			"L 6\n" +
			"D 6\n" +
			"U 12\n" +
			"L 7\n" +
			"R 14\n" +
			"D 8\n" +
			"R 11\n" +
			"D 12\n" +
			"R 7\n" +
			"U 6\n" +
			"D 12\n" +
			"R 6\n" +
			"D 6\n" +
			"L 6\n" +
			"U 14\n" +
			"D 2\n" +
			"U 11\n" +
			"D 11\n" +
			"L 14\n" +
			"U 8\n" +
			"L 12\n" +
			"D 12\n" +
			"U 9\n" +
			"R 7\n" +
			"D 2\n" +
			"U 10\n" +
			"D 8\n" +
			"R 8\n" +
			"D 8\n" +
			"L 10\n" +
			"D 11\n" +
			"L 4\n" +
			"D 11\n" +
			"U 4\n" +
			"D 6\n" +
			"U 5\n" +
			"D 8\n" +
			"R 14\n" +
			"D 5\n" +
			"R 1\n" +
			"L 8\n" +
			"R 8\n" +
			"L 2\n" +
			"R 11\n" +
			"D 9\n" +
			"L 3\n" +
			"R 7\n" +
			"L 5\n" +
			"U 14\n" +
			"L 1\n" +
			"R 8\n" +
			"L 12\n" +
			"R 5\n" +
			"D 11\n" +
			"U 6\n" +
			"R 1\n" +
			"U 10\n" +
			"R 11\n" +
			"U 11\n" +
			"L 9\n" +
			"R 9\n" +
			"L 8\n" +
			"R 1\n" +
			"D 3\n" +
			"R 11\n" +
			"U 12\n" +
			"D 14\n" +
			"L 1\n" +
			"U 4\n" +
			"D 2\n" +
			"L 11\n" +
			"R 4\n" +
			"U 14\n" +
			"R 1\n" +
			"L 3\n" +
			"R 13\n" +
			"L 13\n" +
			"D 8\n" +
			"L 14\n" +
			"U 12\n" +
			"R 13\n" +
			"D 9\n" +
			"R 8\n" +
			"D 12\n" +
			"U 14\n" +
			"D 2\n" +
			"L 10\n" +
			"R 1\n" +
			"D 12\n" +
			"R 13\n" +
			"L 1\n" +
			"U 5\n" +
			"L 12\n" +
			"R 6\n" +
			"U 14\n" +
			"R 6\n" +
			"L 13\n" +
			"U 11\n" +
			"R 2\n" +
			"D 6\n" +
			"R 5\n" +
			"U 12\n" +
			"R 1\n" +
			"D 11\n" +
			"L 4\n" +
			"U 6\n" +
			"R 4\n" +
			"U 5\n" +
			"L 12\n" +
			"D 3\n" +
			"R 4\n" +
			"D 1\n" +
			"L 15\n" +
			"R 15\n" +
			"U 13\n" +
			"R 10\n" +
			"U 14\n" +
			"R 15\n" +
			"D 4\n" +
			"R 8\n" +
			"U 13\n" +
			"L 4\n" +
			"R 5\n" +
			"D 7\n" +
			"R 5\n" +
			"L 2\n" +
			"D 7\n" +
			"L 4\n" +
			"R 7\n" +
			"D 6\n" +
			"R 3\n" +
			"D 12\n" +
			"U 9\n" +
			"L 14\n" +
			"R 7\n" +
			"L 12\n" +
			"R 7\n" +
			"D 15\n" +
			"R 4\n" +
			"L 1\n" +
			"D 11\n" +
			"R 10\n" +
			"D 8\n" +
			"L 9\n" +
			"D 10\n" +
			"L 4\n" +
			"R 10\n" +
			"U 8\n" +
			"D 2\n" +
			"L 8\n" +
			"D 7\n" +
			"U 11\n" +
			"L 9\n" +
			"U 15\n" +
			"L 7\n" +
			"R 6\n" +
			"L 14\n" +
			"D 2\n" +
			"L 15\n" +
			"D 6\n" +
			"U 2\n" +
			"R 9\n" +
			"D 6\n" +
			"U 7\n" +
			"R 7\n" +
			"U 15\n" +
			"D 13\n" +
			"L 6\n" +
			"D 9\n" +
			"R 12\n" +
			"U 2\n" +
			"R 8\n" +
			"L 14\n" +
			"R 11\n" +
			"D 7\n" +
			"U 1\n" +
			"R 11\n" +
			"D 12\n" +
			"L 15\n" +
			"D 9\n" +
			"U 7\n" +
			"L 3\n" +
			"U 12\n" +
			"L 3\n" +
			"D 9\n" +
			"R 12\n" +
			"U 2\n" +
			"D 8\n" +
			"L 1\n" +
			"U 15\n" +
			"R 15\n" +
			"U 15\n" +
			"L 10\n" +
			"U 2\n" +
			"D 4\n" +
			"R 8\n" +
			"U 4\n" +
			"D 8\n" +
			"L 7\n" +
			"R 11\n" +
			"U 15\n" +
			"D 9\n" +
			"R 10\n" +
			"D 8\n" +
			"R 6\n" +
			"D 6\n" +
			"U 3\n" +
			"L 13\n" +
			"D 10\n" +
			"L 11\n" +
			"D 7\n" +
			"U 5\n" +
			"D 8\n" +
			"U 7\n" +
			"R 10\n" +
			"U 1\n" +
			"L 5\n" +
			"D 13\n" +
			"L 13\n" +
			"U 11\n" +
			"R 14\n" +
			"D 7\n" +
			"L 4\n" +
			"R 8\n" +
			"D 12\n" +
			"U 14\n" +
			"D 7\n" +
			"L 5\n" +
			"D 14\n" +
			"U 2\n" +
			"L 16\n" +
			"R 9\n" +
			"U 13\n" +
			"R 14\n" +
			"L 16\n" +
			"U 16\n" +
			"L 9\n" +
			"U 13\n" +
			"R 5\n" +
			"U 15\n" +
			"R 6\n" +
			"D 7\n" +
			"R 15\n" +
			"L 15\n" +
			"U 3\n" +
			"L 5\n" +
			"R 3\n" +
			"U 1\n" +
			"R 14\n" +
			"U 5\n" +
			"L 6\n" +
			"U 13\n" +
			"D 6\n" +
			"U 1\n" +
			"R 10\n" +
			"D 11\n" +
			"L 16\n" +
			"U 10\n" +
			"R 16\n" +
			"D 15\n" +
			"L 7\n" +
			"R 15\n" +
			"U 15\n" +
			"R 5\n" +
			"D 9\n" +
			"U 6\n" +
			"D 7\n" +
			"L 15\n" +
			"R 9\n" +
			"L 10\n" +
			"U 13\n" +
			"R 7\n" +
			"D 15\n" +
			"U 14\n" +
			"D 12\n" +
			"L 2\n" +
			"U 11\n" +
			"D 14\n" +
			"R 4\n" +
			"L 1\n" +
			"U 1\n" +
			"R 13\n" +
			"D 12\n" +
			"R 14\n" +
			"L 4\n" +
			"R 11\n" +
			"U 14\n" +
			"L 2\n" +
			"D 6\n" +
			"R 15\n" +
			"U 12\n" +
			"R 15\n" +
			"U 9\n" +
			"D 11\n" +
			"R 4\n" +
			"L 15\n" +
			"U 12\n" +
			"D 14\n" +
			"L 11\n" +
			"U 10\n" +
			"L 15\n" +
			"U 9\n" +
			"D 7\n" +
			"R 12\n" +
			"L 14\n" +
			"U 15\n" +
			"L 6\n" +
			"U 2\n" +
			"R 11\n" +
			"L 12\n" +
			"R 5\n" +
			"U 8\n" +
			"D 7\n" +
			"U 6\n" +
			"R 2\n" +
			"U 6\n" +
			"R 16\n" +
			"L 2\n" +
			"R 11\n" +
			"L 7\n" +
			"D 16\n" +
			"R 7\n" +
			"L 4\n" +
			"R 13\n" +
			"U 12\n" +
			"D 1\n" +
			"R 2\n" +
			"D 4\n" +
			"L 10\n" +
			"D 12\n" +
			"R 3\n" +
			"D 14\n" +
			"R 17\n" +
			"L 4\n" +
			"D 3\n" +
			"L 2\n" +
			"R 13\n" +
			"L 15\n" +
			"R 13\n" +
			"U 9\n" +
			"D 7\n" +
			"L 13\n" +
			"U 14\n" +
			"D 6\n" +
			"L 6\n" +
			"D 6\n" +
			"R 3\n" +
			"U 6\n" +
			"R 8\n" +
			"U 14\n" +
			"R 13\n" +
			"L 15\n" +
			"D 2\n" +
			"U 3\n" +
			"D 10\n" +
			"R 16\n" +
			"L 10\n" +
			"D 8\n" +
			"R 10\n" +
			"D 9\n" +
			"U 8\n" +
			"R 1\n" +
			"L 4\n" +
			"U 14\n" +
			"R 7\n" +
			"L 16\n" +
			"R 8\n" +
			"D 4\n" +
			"R 9\n" +
			"U 12\n" +
			"D 8\n" +
			"U 7\n" +
			"R 9\n" +
			"L 16\n" +
			"D 15\n" +
			"U 11\n" +
			"D 15\n" +
			"U 2\n" +
			"R 9\n" +
			"U 10\n" +
			"L 14\n" +
			"D 14\n" +
			"R 4\n" +
			"U 12\n" +
			"L 1\n" +
			"U 8\n" +
			"R 3\n" +
			"U 13\n" +
			"D 17\n" +
			"U 17\n" +
			"D 6\n" +
			"U 17\n" +
			"L 11\n" +
			"D 16\n" +
			"L 10\n" +
			"R 10\n" +
			"L 6\n" +
			"U 16\n" +
			"L 7\n" +
			"D 8\n" +
			"R 16\n" +
			"U 7\n" +
			"D 9\n" +
			"L 2\n" +
			"U 5\n" +
			"L 4\n" +
			"U 10\n" +
			"D 1\n" +
			"L 15\n" +
			"U 5\n" +
			"L 14\n" +
			"R 7\n" +
			"U 15\n" +
			"L 14\n" +
			"U 14\n" +
			"L 7\n" +
			"D 3\n" +
			"L 4\n" +
			"U 1\n" +
			"R 11\n" +
			"D 12\n" +
			"R 9\n" +
			"U 16\n" +
			"L 3\n" +
			"D 3\n" +
			"L 4\n" +
			"U 5\n" +
			"D 16\n" +
			"U 1\n" +
			"D 15\n" +
			"R 1\n" +
			"L 16\n" +
			"U 7\n" +
			"L 2\n" +
			"U 12\n" +
			"L 13\n" +
			"U 16\n" +
			"D 9\n" +
			"R 4\n" +
			"D 15\n" +
			"R 7\n" +
			"U 14\n" +
			"L 2\n" +
			"U 9\n" +
			"R 2\n" +
			"L 13\n" +
			"U 16\n" +
			"R 4\n" +
			"D 17\n" +
			"U 10\n" +
			"D 10\n" +
			"U 10\n" +
			"D 18\n" +
			"R 10\n" +
			"U 7\n" +
			"L 6\n" +
			"U 9\n" +
			"D 9\n" +
			"L 5\n" +
			"U 9\n" +
			"R 9\n" +
			"L 15\n" +
			"U 9\n" +
			"D 10\n" +
			"U 10\n" +
			"R 10\n" +
			"D 2\n" +
			"U 15\n" +
			"D 3\n" +
			"R 18\n" +
			"U 13\n" +
			"R 1\n" +
			"D 17\n" +
			"L 16\n" +
			"D 10\n" +
			"L 1\n" +
			"R 7\n" +
			"U 1\n" +
			"D 12\n" +
			"L 3\n" +
			"U 12\n" +
			"L 6\n" +
			"R 18\n" +
			"D 13\n" +
			"R 18\n" +
			"U 17\n" +
			"D 7\n" +
			"L 11\n" +
			"D 14\n" +
			"L 2\n" +
			"U 18\n" +
			"D 8\n" +
			"L 6\n" +
			"D 16\n" +
			"U 4\n" +
			"R 14\n" +
			"U 3\n" +
			"D 11\n" +
			"R 12\n" +
			"U 12\n" +
			"R 5\n" +
			"D 16\n" +
			"R 17\n" +
			"U 3\n" +
			"D 15\n" +
			"U 11\n" +
			"L 17\n" +
			"U 15\n" +
			"L 17\n" +
			"U 12\n" +
			"D 15\n" +
			"L 14\n" +
			"D 14\n" +
			"U 13\n" +
			"L 16\n" +
			"R 5\n" +
			"U 16\n" +
			"D 6\n" +
			"U 13\n" +
			"L 13\n" +
			"D 4\n" +
			"R 6\n" +
			"D 6\n" +
			"L 18\n" +
			"U 18\n" +
			"L 15\n" +
			"R 6\n" +
			"L 6\n" +
			"R 6\n" +
			"U 13\n" +
			"L 8\n" +
			"U 13\n" +
			"R 13\n" +
			"U 13\n" +
			"L 15\n" +
			"R 6\n" +
			"U 8\n" +
			"R 10\n" +
			"U 11\n" +
			"L 18\n" +
			"U 3\n" +
			"L 2\n" +
			"D 8\n" +
			"L 5\n" +
			"U 11\n" +
			"L 5\n" +
			"U 8\n" +
			"R 13\n" +
			"U 12\n" +
			"R 9\n" +
			"U 18\n" +
			"D 11\n" +
			"L 12\n" +
			"D 13\n" +
			"R 18\n" +
			"U 2\n" +
			"L 9\n" +
			"D 14\n" +
			"R 2\n" +
			"L 17\n" +
			"U 3\n" +
			"L 9\n" +
			"U 10\n" +
			"R 9\n" +
			"L 13\n" +
			"R 15\n" +
			"D 14\n" +
			"U 2\n" +
			"R 4\n" +
			"L 5\n" +
			"U 12\n" +
			"L 14\n" +
			"U 15\n" +
			"D 13\n" +
			"R 10\n" +
			"L 5\n" +
			"U 15\n" +
			"D 10\n" +
			"R 7\n" +
			"L 9\n" +
			"R 15\n" +
			"L 6\n" +
			"U 9\n" +
			"L 15\n" +
			"U 10\n" +
			"R 14\n" +
			"L 17\n" +
			"R 16\n" +
			"U 12\n" +
			"D 15\n" +
			"L 5\n" +
			"U 17\n" +
			"R 12\n" +
			"D 17\n" +
			"U 8\n" +
			"R 10\n" +
			"L 9\n" +
			"R 6\n" +
			"U 1\n" +
			"D 3\n" +
			"L 3\n" +
			"D 7\n" +
			"U 6\n" +
			"L 9\n" +
			"U 19\n" +
			"R 10\n" +
			"U 14\n" +
			"R 15\n" +
			"U 4\n" +
			"D 9\n" +
			"R 17\n" +
			"L 6\n" +
			"U 9\n" +
			"R 2\n" +
			"U 9\n" +
			"R 16\n" +
			"L 13\n" +
			"U 11\n" +
			"R 15\n" +
			"D 10\n" +
			"L 5\n" +
			"U 1\n" +
			"R 4\n" +
			"U 17\n" +
			"L 1\n" +
			"U 10\n" +
			"L 3\n" +
			"U 9\n" +
			"L 17\n" +
			"U 8\n" +
			"L 2\n" +
			"U 10\n" +
			"D 12\n" +
			"L 16\n" +
			"R 18\n" +
			"L 6\n" +
			"D 11\n" +
			"R 6\n" +
			"U 7\n" +
			"R 3\n" +
			"L 15\n" +
			"R 7\n" +
			"U 14\n" +
			"R 2\n" +
			"U 7\n" +
			"R 17\n" +
			"L 7\n" +
			"R 1\n" +
			"D 11\n" +
			"R 10\n" +
			"L 17\n" +
			"R 5\n" +
			"U 10\n" +
			"L 15\n" +
			"U 7\n" +
			"R 7\n" +
			"L 17\n" +
			"D 19\n" +
			"U 17\n" +
			"R 3\n" +
			"D 6\n" +
			"L 8\n" +
			"R 8\n" +
			"D 3\n" +
			"U 7\n" +
			"L 9";

	public static void main(String... args) {
		int total = 0;
		int hor = 0;
		int ver = 0;
		AdventOfCodeUtil.Coordinate head = new AdventOfCodeUtil.Coordinate(hor, ver);
		AdventOfCodeUtil.Coordinate tail1 = new AdventOfCodeUtil.Coordinate(hor, ver);
		AdventOfCodeUtil.Coordinate tail2 = new AdventOfCodeUtil.Coordinate(hor, ver);
		AdventOfCodeUtil.Coordinate tail3 = new AdventOfCodeUtil.Coordinate(hor, ver);
		AdventOfCodeUtil.Coordinate tail4 = new AdventOfCodeUtil.Coordinate(hor, ver);
		AdventOfCodeUtil.Coordinate tail5 = new AdventOfCodeUtil.Coordinate(hor, ver);
		AdventOfCodeUtil.Coordinate tail6 = new AdventOfCodeUtil.Coordinate(hor, ver);
		AdventOfCodeUtil.Coordinate tail7 = new AdventOfCodeUtil.Coordinate(hor, ver);
		AdventOfCodeUtil.Coordinate tail8 = new AdventOfCodeUtil.Coordinate(hor, ver);
		AdventOfCodeUtil.Coordinate tail9 = new AdventOfCodeUtil.Coordinate(hor, ver);



		Set<AdventOfCodeUtil.Coordinate> tailseen = new HashSet<>();


		for (int i = 0; i < input.split("\n").length; i++) {
			String ii = input.split("\n")[i];
			String direction = ii.split(" ")[0];
			int amt = Integer.parseInt(ii.split(" ")[1]);

			for (int j = 1; j <= amt; j++) {
				if (direction.equals("R")) {
					head.x = head.x + 1;
					moveRight(head, tail1);
					moveRight(tail1, tail2);
					moveRight(tail2, tail3);
					moveRight(tail3, tail4);
					moveRight(tail4, tail5);
					moveRight(tail5, tail6);
					moveRight(tail6, tail7);
					moveRight(tail7, tail8);
					moveRight(tail8, tail9);
				}
				if (direction.equals("L")) {
					head.x = head.x - 1;

					moveLeft(head, tail1);
					moveLeft(tail1, tail2);
					moveLeft(tail2, tail3);
					moveLeft(tail3, tail4);
					moveLeft(tail4, tail5);
					moveLeft(tail5, tail6);
					moveLeft(tail6, tail7);
					moveLeft(tail7, tail8);
					moveLeft(tail8, tail9);
				}
				if (direction.equals("U")) {
					head.y = head.y + 1;

					moveUp(head, tail1);
					moveUp(tail1, tail2);
					moveUp(tail2, tail3);
					moveUp(tail3, tail4);
					moveUp(tail4, tail5);
					moveUp(tail5, tail6);
					moveUp(tail6, tail7);
					moveUp(tail7, tail8);
					moveUp(tail8, tail9);
				}
				if (direction.equals("D")) {
					head.y = head.y - 1;

					moveDown(head, tail1);
					moveDown(tail1, tail2);
					moveDown(tail2, tail3);
					moveDown(tail3, tail4);
					moveDown(tail4, tail5);
					moveDown(tail5, tail6);
					moveDown(tail6, tail7);
					moveDown(tail7, tail8);
					moveDown(tail8, tail9);
				}
				tailseen.add(new AdventOfCodeUtil.Coordinate(tail9.x, tail9.y));
			}
		}
		System.out.println(tailseen.size());

	}

	private static void moveRight(AdventOfCodeUtil.Coordinate head, AdventOfCodeUtil.Coordinate tail1) {
		if (head.x != tail1.x && head.y != tail1.y && (Math.abs(head.x - tail1.x) >= 2 || Math.abs(head.y - tail1.y) >= 2)) {
			int hordist = tail1.x - head.x;
			int vertdist = tail1.y - head.y;
			if (vertdist > 0) {
				vertdist = vertdist - 1;
			} else {
				vertdist = vertdist + 1;
			}
			if (hordist > 0) {
				hordist = hordist - 1;
			} else {
				hordist = hordist + 1;
			}
			tail1.y = head.y + vertdist;
			tail1.x = head.x + hordist;
		} else {
			if (Math.abs(head.x - tail1.x) >= 2 || Math.abs(head.y - tail1.y) >= 2) {
				if (Math.abs(head.x - tail1.x) >= 2) {
					int hordist = tail1.x - head.x;
					if (hordist > 0) {
						hordist = hordist - 1;
					} else {
						hordist = hordist + 1;
					}
					tail1.x = head.x + hordist;
				}
				if (Math.abs(head.y - tail1.y) >= 2) {
					int vertdist = tail1.y - head.y;
					if (vertdist > 0) {
						vertdist = vertdist - 1;
					} else {
						vertdist = vertdist + 1;
					}
					tail1.y = head.y + vertdist;
				}
			}
		}
	}

	private static void moveLeft(AdventOfCodeUtil.Coordinate head, AdventOfCodeUtil.Coordinate tail1) {
		if (head.x != tail1.x && head.y != tail1.y && (Math.abs(head.x - tail1.x) >= 2 || Math.abs(head.y - tail1.y) >= 2)) {
			int hordist = tail1.x - head.x;
			int vertdist = tail1.y - head.y;
			if (vertdist > 0) {
				vertdist = vertdist - 1;
			} else {
				vertdist = vertdist + 1;
			}
			if (hordist > 0) {
				hordist = hordist - 1;
			} else {
				hordist = hordist + 1;
			}
			tail1.y = head.y + vertdist;
			tail1.x = head.x + hordist;
		} else {

			if (Math.abs(head.x - tail1.x) >= 2 || Math.abs(head.y - tail1.y) >= 2) {
				if (Math.abs(head.x - tail1.x) >= 2) {
					int hordist = tail1.x - head.x;
					if (hordist > 0) {
						hordist = hordist - 1;
					} else {
						hordist = hordist + 1;
					}
					tail1.x = head.x + hordist;
				}
				if (Math.abs(head.y - tail1.y) >= 2) {
					int vertdist = tail1.y - head.y;
					if (vertdist > 0) {
						vertdist = vertdist - 1;
					} else {
						vertdist = vertdist + 1;
					}
					tail1.y = head.y + vertdist;
				}
			}
		}
	}

	private static void moveUp(AdventOfCodeUtil.Coordinate head, AdventOfCodeUtil.Coordinate tail1) {
		if (head.x != tail1.x && head.y != tail1.y && (Math.abs(head.x - tail1.x) >= 2 || Math.abs(head.y - tail1.y) >= 2)) {
			int hordist = tail1.x - head.x;
			int vertdist = tail1.y - head.y;
			if (vertdist > 0) {
				vertdist = vertdist - 1;
			} else {
				vertdist = vertdist + 1;
			}
			if (hordist > 0) {
				hordist = hordist - 1;
			} else {
				hordist = hordist + 1;
			}
			tail1.y = head.y + vertdist;
			tail1.x = head.x + hordist;
		} else {
			if (Math.abs(head.x - tail1.x) >= 2 || Math.abs(head.y - tail1.y) >= 2) {
				if (Math.abs(head.x - tail1.x) >= 2) {
					int hordist = tail1.x - head.x;
					if (hordist > 0) {
						hordist = hordist - 1;
					} else {
						hordist = hordist + 1;
					}
					tail1.x = head.x + hordist;
				}
				if (Math.abs(head.y - tail1.y) >= 2) {
					int vertdist = tail1.y - head.y;
					if (vertdist > 0) {
						vertdist = vertdist - 1;
					} else {
						vertdist = vertdist + 1;
					}
					tail1.y = head.y + vertdist;
				}
			}
		}
	}

	private static void moveDown(AdventOfCodeUtil.Coordinate head, AdventOfCodeUtil.Coordinate tail1) {
		if (head.x != tail1.x && head.y != tail1.y && (Math.abs(head.x - tail1.x) >= 2 || Math.abs(head.y - tail1.y) >= 2)) {
			int hordist = tail1.x - head.x;
			int vertdist = tail1.y - head.y;
			if (vertdist > 0) {
				vertdist = vertdist - 1;
			} else {
				vertdist = vertdist + 1;
			}
			if (hordist > 0) {
				hordist = hordist - 1;
			} else {
				hordist = hordist + 1;
			}
			tail1.y = head.y + vertdist;
			tail1.x = head.x + hordist;
		} else {
			if (Math.abs(head.x - tail1.x) >= 2 || Math.abs(head.y - tail1.y) >= 2) {
				if (Math.abs(head.x - tail1.x) >= 2) {
					int hordist = tail1.x - head.x;
					if (hordist > 0) {
						hordist = hordist - 1;
					} else {
						hordist = hordist + 1;
					}
					tail1.x = head.x + hordist;
				}
				if (Math.abs(head.y - tail1.y) >= 2) {
					int vertdist = tail1.y - head.y;
					if (vertdist > 0) {
						vertdist = vertdist - 1;
					} else {
						vertdist = vertdist + 1;
					}
					tail1.y = head.y + vertdist;
				}
			}
		}
	}
}
