package adventofcode_2021;


import utils.AdventOfCodeUtil;

import java.util.ArrayList;
import java.util.List;

public class AdventOfCode_2021_17 {

	static String input = "target area: x=138..184, y=-125..-71";

	static List<AdventOfCodeUtil.Coordinate> coordinateList = new ArrayList<>();

	static int miny = -125;
	static int maxx = 184;

	public static void main(String... args) {

		List<Integer> possibley = new ArrayList<>();
		for (int i = -10000; i < 10000; i++) {

			Integer yshot = calcOnlyY(i);

			if (yshot != null) {
				possibley.add(i);
			}
		}

		List<Integer> possibleX = new ArrayList<>();
		for (int i = 0; i < 300; i++) {

			boolean yshot = calcOnlyX(i);

			if (yshot) {
				possibleX.add(i);
			}
		}

		int count = 0;
		for (int i: possibley) {
			for (int j : possibleX) {
				if (calcShot(j, i)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static Integer calcOnlyY(int yvel) {
		Integer maxy = 0;
		int ypos = 0;
		while (ypos > miny) {
			ypos = ypos + yvel;
			yvel --;
			if (ypos > maxy) {
				maxy = ypos;
			}
			if (ypos >= -125 && ypos <= -71 && yvel < 0) {
				return maxy;
			}
		}
		return null;
	}

	public static boolean calcOnlyX(int xvel) {
		int xpos = 0;
		while (xpos < maxx && xvel != 0) {
			xpos = xpos + xvel;
			if (xvel > 0) {
				xvel--;
			}
			if (xvel < 0) {
				xvel ++;
			}
			if (xpos >= 138 && xpos <= 184) {
				return true;
			}

		}
		return false;
	}

	public static boolean calcShot(int xvel, int yvel) {
		int xpos = 0;
		int ypos = 0;
		while (xpos < maxx && ypos > miny) {
			xpos = xpos + xvel;
			ypos = ypos + yvel;
			if (xvel > 0) {
				xvel--;
			}
			if (xvel < 0) {
				xvel ++;
			}
			yvel --;
			if (xpos >= 138 && xpos <= 184 && ypos >= -125 && ypos <= -71) {
				return true;
			}
		}
		return false;
	}
}
