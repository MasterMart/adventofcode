package adventofcode_2021;


import utils.AdventOfCodeUtil;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

public class AdventOfCode_2021_11 {

	static String input = "5483143223\n" +
			"2745854711\n" +
			"5264556173\n" +
			"6141336146\n" +
			"6357385478\n" +
			"4167524645\n" +
			"2176841721\n" +
			"6882881134\n" +
			"4846848554\n" +
			"5283751526";

	static int amtflashes = 0;
	static int amtflashesthisstep = 0;


	public static void main(String... args) throws Exception {

		Set<AdventOfCodeUtil.Coordinate> octopi = new HashSet<>();
		for (int i = 0; i < input.split("\n").length; i++) {
			String str = input.split("\n")[i];
			for (int j = 0; j < str.split("").length; j++) {
				String str2 = str.split("")[j];
				AdventOfCodeUtil.Coordinate coordinate = new AdventOfCodeUtil.Coordinate(j,i);
				coordinate.numberint = Integer.parseInt(str2);
				octopi.add(coordinate);
			}
		}

		for (int k = 0; k < 1000000; k++) {
			handleFlashes(octopi);
			if (amtflashesthisstep == 100) {
				System.out.println(k);
				throw new Exception();
			}
		}

		//System.out.println(amtflashes);

	}

	static void handleFlashes(Set<AdventOfCodeUtil.Coordinate> octopi) {

		amtflashesthisstep = 0;

		for (AdventOfCodeUtil.Coordinate coordinate : octopi) {
			coordinate.numberint = coordinate.numberint + 1;
		}

		for (AdventOfCodeUtil.Coordinate coordinate : octopi) {
			if (coordinate.numberint > 9 && !coordinate.hasFlashed) {
				handleFlash(coordinate, octopi);
			}
		}
		for (AdventOfCodeUtil.Coordinate coordinate : octopi) {
			if (coordinate.hasFlashed) {
				coordinate.numberint = 0;
				coordinate.hasFlashed = false;
			}
		}

	}

	static void handleFlash(AdventOfCodeUtil.Coordinate coordinate, Set<AdventOfCodeUtil.Coordinate> octopi) {
		amtflashes += 1;
		amtflashesthisstep += 1;
		coordinate.hasFlashed = true;
		for (AdventOfCodeUtil.Coordinate adjacent : AdventOfCodeUtil.getAdjacent(coordinate, octopi)) {
			adjacent.numberint = adjacent.numberint + 1;
			if (adjacent.numberint > 9 && !adjacent.hasFlashed) {
				handleFlash(adjacent, octopi);
			}
		}
	}

}
