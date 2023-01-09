package adventofcode_2022;


import utils.AdventOfCodeUtil;

import java.util.*;
import java.util.stream.Collectors;

public class AdventOfCode_2022_23 {

    static String input = ".#.....####..##.#.#.####.####.##....#...###...##...#.#..###.##.....#.#\n" +
			".##..##.#.#...####....#.###....##..######...#..#...#..####...#...#.###\n" +
			"#...#.###...#...###.##.....##.#.#....#..###..#.##..........#....###.##\n" +
			"##..#...###..####.#.#.###..###...##.#....##....###.#.##.##.#.###.###.#\n" +
			"##.#..#..###.#.#.####.#..#.#.####..###.#.#.#.##.#...#.#..#..#####..##.\n" +
			"...####..#.#.####.#.#.##.###.#.#.#.##...#..#.####..#.#.#.##.......###.\n" +
			"..###.#.###...##.######......#.##........#.##......#....#...##.#.##..#\n" +
			"#....###..##.#####..##.#######....##.#..##.##..#..##..##.###.......#.#\n" +
			"#.#....###.#..#...####...##.##.#....#.#.#.#...##..##........#.#.###.##\n" +
			"..#....##....####...##.#.##..###.##.#..##...##.##.##..##..#.#.###...##\n" +
			"##.##.#..###.#.##..#....###...####....#.#.#.####.##.##.#....##...#.###\n" +
			"##.####...#....#....#.#.#.#...#...#...####.###..#.#..##.##..##.#.#....\n" +
			"##...#####...#.#....##....##..#.........#.#..#######.#.##.#.....#.....\n" +
			"##....#..#....##.##..########.#...#....#..###...#....#.#.#..#.##.....#\n" +
			"..##..#....##..#.#..###...#..###.#.##..##....#..#.##...####.##.##...#.\n" +
			"#...##..##.###..##....#.##..##.#.......####.#.#.#.###..#.#...#..###.##\n" +
			".##..##.#.##.#.#.#####.#.#.#...#..##..##.##.##..#.##...#####.##..##.##\n" +
			".##..###.#..###.#...##.###......##..#.###..#########....##.##.#..##.#.\n" +
			".##.#.##.#.#..#.....##.###.#..##......#.##...#....###.##..##.#....#..#\n" +
			"#..#..##...#.#....###..#..####.#..##.######.#..#.#....##.##.#.#.###..#\n" +
			"#......#.##..#..##.#.#..##..#...###.#.####..##..##.#..#.##.#..##..#..#\n" +
			"#..#.###....#..#.......#####.##.#..####.#.##...##..##.####.####.....##\n" +
			"#.#..#...###.##...####.###..#.######.##.##..#.###.#..#.#.#######......\n" +
			".####.#..........####.#.#.#....#...#...#..#..#...#.###.#..##..###..#..\n" +
			".###.#...####.#.#.#.#..###.#..####..##.####.###..#...#...##..#.#.###..\n" +
			"##....#.#....##..####..##.#.#.##...#.#.#...#.#.#.#....##.....###..##..\n" +
			"......#.#..###..##.#.#..#.##.####...####..####......#.##.#.#..##......\n" +
			"#...########.##.##..##.#..###.##.#.#..#...##.#.#..###.##.#..#..#.##.##\n" +
			"##..#.##.###.##...##.##....#.#.#..#...##.####..#.#####.####.###.#..#.#\n" +
			"##.#.#....###.#......#..##..####...###.......##.....#...#...###..####.\n" +
			"###..#####.#.#....##......##..#...#......#.##.####.#.####..###.#.#.###\n" +
			"#.#..#.###.#....#.##....###.###.#.##..##.#..####..###...#...#..####...\n" +
			"#....##.#.#...#..#...#########.###.#.....#..#..#..#.###...#.##...###.#\n" +
			"##...#....#.###.#####...##.##..#..#.##.##..###.#..#..######.#.#.##.##.\n" +
			"...#..##.#..####....##..#..###.#.######.###.#########..#..#.##...#..#.\n" +
			"###.##..#.#..###.#.......##.##.##.#####....#####.##.##.##..####..####.\n" +
			".#####..#.#.#...##..#.#...#######.......###..#.####.#..##.######.#.#..\n" +
			"#.#..#######....##.#.#..#.#..###.#.#...##.#...#..#....#.####..#..#....\n" +
			"##..#.#...#..#######......#..#.#...#########.#.#..#...#.#####...###.#.\n" +
			".######.##..#.#..##.........###..####.....##...#..#..#...##.##.######.\n" +
			"#####.#####.#..#.###..###..#...#.##.#.##.###.#.#.###.#####...#.##..#..\n" +
			"#...#.#...##......####.#..#.##..#..####....#.#.#...#.#.....##....#...#\n" +
			"####.###...##...#..#..###....#.##..#.#.##...###...#.#.#.....#.##..#.##\n" +
			".#.###.#.##.#.##.#..#....#..#.####.#.#.......#..#..#..#.#.#..#..#..#.#\n" +
			"..#......#.#.###.#######.#...###########.##.##.##..##.##.....#.#..##..\n" +
			"##..#.#.#..###...#...#######..##.#.#.##.##..#.#..##.....###..#.##.###.\n" +
			"#...###....#.#....#####.####..#..#.#.#...###....#.#.#.##...####..#...#\n" +
			"##.####.#...####.##.##.#...#..#..##...#.##..#.#.#...#.#...#..#####.##.\n" +
			"###.#.#..#..###..##.#.#....#..#...##.#..##.#.##...##.#....##.#.#..##..\n" +
			"..#....##..####..#..######.##..####.#...##.#.##.###..#..##..##.##....#\n" +
			"##.###.##..#.....##.#.##....##.###.#.##..##.#...#...#.#..#..#.#.##....\n" +
			".#..##.....###....#....###..###..#..#.#..#..####.#..###.#.##...##....#\n" +
			"#.#..#..#..#..####.####.....######....#...##.#..###.#...#.#.#.#.###...\n" +
			"##..#..##.#.#.##.......#.####.#.#.##.#.#.#..#.####.#.#.#####......#.#.\n" +
			"##.#.#...##....#..##..#......######.#..#.#.###.......##.#.##.#...#####\n" +
			"##..##########..#..#.....##...####.##.#.##..#.......######.#.##...#.#.\n" +
			"#.##.#.########.##..##.##..#.#.#...#.#..##..#...#..##.#.#####.#.#.###.\n" +
			".###.#....###..######.##.########.########...##.#.#####.###.##..#.#...\n" +
			"....#.#.##.##..#####..#####.#.#.#...####.#.#..#....#.#.##...#..#.#.###\n" +
			".#####......#.##.#######.#.#.#.##.#.#####..##..##.....###.##.###..#..#\n" +
			"#...#..#.#####.#.#...#..#..####.#..####..###.#...#.#.....####.##.#####\n" +
			"#..##......##...##.#..##.....#.##..#..##.##.#.#.#.......##.##..#.####.\n" +
			"#######..###.##.##.###.##..#.##..#...#.###....#.###...#...##...#..#..#\n" +
			"..######...##.#.#..#####.#.#######.###.....##.#.###.......##.#####..##\n" +
			".#..#####.......#........#...#..###.######...####.#..##...###.##.....#\n" +
			"..##......#..#.####..##...#..###..##.....#..#...#..#.##.##....#.###...\n" +
			"#..####.##.#..###.##.##.#...##....#.##.#.###.##....####...#.....##.#..\n" +
			"..####...###.##.#..#....###...#.....######.####...##.##.#...#...####..\n" +
			"..#...#.#..###.#......##...##...#.....###.####.....##.#.#..###.#.#.###\n" +
			"..######..##...#..###.#....#..####.##..#...##.##..###.######.#..#.##.#";

    public static void main(String... args) throws Exception {

		List<AdventOfCodeUtil.Coordinate> coordinates = new ArrayList<>();
		Map<AdventOfCodeUtil.Coordinate, List<AdventOfCodeUtil.Coordinate>> proposedmoves = new HashMap<>();

        int total = 0;

        for (int i = 0; i < input.split("\n").length; i++) {
            String ii = input.split("\n")[i];
			for (int j = 0; j < ii.split("").length; j++) {
				AdventOfCodeUtil.Coordinate coordinate = new AdventOfCodeUtil.Coordinate(j, i);
				coordinate.number =  ii.split("")[j];
				coordinates.add(coordinate);

			}
        }

		for (int k = 0; k <= 99999; k++) {
			System.out.println(k);
			proposedmoves = new HashMap<>();
			int minx = coordinates.stream().min(Comparator.comparing(coordinate -> coordinate.x)).get().x - 1;
			int miny = coordinates.stream().min(Comparator.comparing(coordinate -> coordinate.y)).get().y - 1;
			int maxx = coordinates.stream().max(Comparator.comparing(coordinate -> coordinate.x)).get().x + 1;
			int maxy = coordinates.stream().max(Comparator.comparing(coordinate -> coordinate.y)).get().y + 1;

			for (int i = minx; i <= maxx; i++) {
				AdventOfCodeUtil.Coordinate coordinate = new AdventOfCodeUtil.Coordinate(i, miny);
				coordinate.number= ".";
				coordinates.add(coordinate);

				AdventOfCodeUtil.Coordinate coordinate2 = new AdventOfCodeUtil.Coordinate(i, maxy);
				coordinate2.number= ".";
				coordinates.add(coordinate2);
			}

			for (int i = miny + 1; i < maxy; i++) {
				AdventOfCodeUtil.Coordinate coordinate = new AdventOfCodeUtil.Coordinate(minx, i);
				coordinate.number= ".";
				coordinates.add(coordinate);

				AdventOfCodeUtil.Coordinate coordinate2 = new AdventOfCodeUtil.Coordinate(maxx, i);
				coordinate2.number= ".";
				coordinates.add(coordinate2);
			}

			String s = "";

			int minx3 = coordinates.stream().min(Comparator.comparing(coordinate -> coordinate.x)).get().x;
			int miny3 = coordinates.stream().min(Comparator.comparing(coordinate -> coordinate.y)).get().y;
			int maxx3 = coordinates.stream().max(Comparator.comparing(coordinate -> coordinate.x)).get().x;
			int maxy3 = coordinates.stream().max(Comparator.comparing(coordinate -> coordinate.y)).get().y;

//			for (int i = miny3; i <= maxy3; i++) {
//				String t = "";
//				for (int j = minx3; j <= maxx3; j++) {
//					AdventOfCodeUtil.Coordinate coordinate = AdventOfCodeUtil.getCoordinate(j, i, coordinates);
//					t = t + coordinate.number;
//				}
//				s = s + t + "\n";
//			}
//			System.out.println(s);

			boolean elfmoved = false;

			for (AdventOfCodeUtil.Coordinate coordinate : coordinates) {
				if (coordinate.number.equals("#")) {
					if (!AdventOfCodeUtil.getAdjacent(coordinate, coordinates.stream().filter(coordinate1 -> coordinate1.number.equals("#")).collect(Collectors.toList())).isEmpty()) {
						elfmoved = true;
						if (k % 4 == 0) {

							if (!checkNorth(coordinate, coordinates)) {

								if (proposedmoves.containsKey(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y - 1))) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y - 1));
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y - 1), list);
								} else {
									List<AdventOfCodeUtil.Coordinate> list = new ArrayList<>();
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y - 1), list);
								}

							} else if (!checkSouth(coordinate, coordinates)) {
								if (proposedmoves.containsKey(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y + 1))) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y + 1));
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y + 1), list);
								} else {
									List<AdventOfCodeUtil.Coordinate> list = new ArrayList<>();
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y + 1), list);
								}
							} else if (!checkWest(coordinate, coordinates)) {
								if (proposedmoves.containsKey(new AdventOfCodeUtil.Coordinate(coordinate.x - 1, coordinate.y))) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(new AdventOfCodeUtil.Coordinate(coordinate.x - 1, coordinate.y));
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x - 1, coordinate.y), list);
								} else {
									List<AdventOfCodeUtil.Coordinate> list = new ArrayList<>();
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x - 1, coordinate.y), list);
								}
							} else if (!checkEast(coordinate, coordinates)) {
								if (proposedmoves.containsKey(new AdventOfCodeUtil.Coordinate(coordinate.x + 1, coordinate.y))) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(new AdventOfCodeUtil.Coordinate(coordinate.x + 1, coordinate.y));
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x + 1, coordinate.y), list);
								} else {
									List<AdventOfCodeUtil.Coordinate> list = new ArrayList<>();
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x + 1, coordinate.y), list);
								}
							} else {
								if (proposedmoves.containsKey(coordinate)) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(coordinate);
									list.add(coordinate);
									proposedmoves.put(coordinate, list);
								} else {
									List<AdventOfCodeUtil.Coordinate> listd = new ArrayList<>();
									listd.add(coordinate);
									proposedmoves.put(coordinate, listd);
								}
							}
						}

						if (k % 4 == 1) {

							if (!checkSouth(coordinate, coordinates)) {
								if (proposedmoves.containsKey(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y + 1))) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y + 1));
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y + 1), list);
								} else {
									List<AdventOfCodeUtil.Coordinate> list = new ArrayList<>();
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y + 1), list);
								}
							} else if (!checkWest(coordinate, coordinates)) {
								if (proposedmoves.containsKey(new AdventOfCodeUtil.Coordinate(coordinate.x - 1, coordinate.y))) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(new AdventOfCodeUtil.Coordinate(coordinate.x - 1, coordinate.y));
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x - 1, coordinate.y), list);
								} else {
									List<AdventOfCodeUtil.Coordinate> list = new ArrayList<>();
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x - 1, coordinate.y), list);
								}
							} else if (!checkEast(coordinate, coordinates)) {
								if (proposedmoves.containsKey(new AdventOfCodeUtil.Coordinate(coordinate.x + 1, coordinate.y))) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(new AdventOfCodeUtil.Coordinate(coordinate.x + 1, coordinate.y));
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x + 1, coordinate.y), list);
								} else {
									List<AdventOfCodeUtil.Coordinate> list = new ArrayList<>();
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x + 1, coordinate.y), list);
								}
							} else if (!checkNorth(coordinate, coordinates)) {

								if (proposedmoves.containsKey(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y - 1))) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y - 1));
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y - 1), list);
								} else {
									List<AdventOfCodeUtil.Coordinate> list = new ArrayList<>();
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y - 1), list);
								}

							} else {
								if (proposedmoves.containsKey(coordinate)) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(coordinate);
									list.add(coordinate);
									proposedmoves.put(coordinate, list);
								} else {
									List<AdventOfCodeUtil.Coordinate> listd = new ArrayList<>();
									listd.add(coordinate);
									proposedmoves.put(coordinate, listd);
								}
							}
						}

						if (k % 4 == 2) {

							if (!checkWest(coordinate, coordinates)) {
								if (proposedmoves.containsKey(new AdventOfCodeUtil.Coordinate(coordinate.x - 1, coordinate.y))) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(new AdventOfCodeUtil.Coordinate(coordinate.x - 1, coordinate.y));
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x - 1, coordinate.y), list);
								} else {
									List<AdventOfCodeUtil.Coordinate> list = new ArrayList<>();
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x - 1, coordinate.y), list);
								}
							} else if (!checkEast(coordinate, coordinates)) {
								if (proposedmoves.containsKey(new AdventOfCodeUtil.Coordinate(coordinate.x + 1, coordinate.y))) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(new AdventOfCodeUtil.Coordinate(coordinate.x + 1, coordinate.y));
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x + 1, coordinate.y), list);
								} else {
									List<AdventOfCodeUtil.Coordinate> list = new ArrayList<>();
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x + 1, coordinate.y), list);
								}
							} else if (!checkNorth(coordinate, coordinates)) {

								if (proposedmoves.containsKey(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y - 1))) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y - 1));
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y - 1), list);
								} else {
									List<AdventOfCodeUtil.Coordinate> list = new ArrayList<>();
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y - 1), list);
								}
							} else if (!checkSouth(coordinate, coordinates)) {
								if (proposedmoves.containsKey(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y + 1))) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y + 1));
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y + 1), list);
								} else {
									List<AdventOfCodeUtil.Coordinate> list = new ArrayList<>();
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y + 1), list);
								}
							} else {
								if (proposedmoves.containsKey(coordinate)) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(coordinate);
									list.add(coordinate);
									proposedmoves.put(coordinate, list);
								} else {
									List<AdventOfCodeUtil.Coordinate> listd = new ArrayList<>();
									listd.add(coordinate);
									proposedmoves.put(coordinate, listd);
								}
							}
						}

						if (k % 4 == 3) {

							if (!checkEast(coordinate, coordinates)) {
								if (proposedmoves.containsKey(new AdventOfCodeUtil.Coordinate(coordinate.x + 1, coordinate.y))) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(new AdventOfCodeUtil.Coordinate(coordinate.x + 1, coordinate.y));
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x + 1, coordinate.y), list);
								} else {
									List<AdventOfCodeUtil.Coordinate> list = new ArrayList<>();
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x + 1, coordinate.y), list);
								}
							} else if (!checkNorth(coordinate, coordinates)) {

								if (proposedmoves.containsKey(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y - 1))) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y - 1));
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y - 1), list);
								} else {
									List<AdventOfCodeUtil.Coordinate> list = new ArrayList<>();
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y - 1), list);
								}
							} else if (!checkSouth(coordinate, coordinates)) {
								if (proposedmoves.containsKey(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y + 1))) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y + 1));
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y + 1), list);
								} else {
									List<AdventOfCodeUtil.Coordinate> list = new ArrayList<>();
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y + 1), list);
								}
							} else if (!checkWest(coordinate, coordinates)) {
								if (proposedmoves.containsKey(new AdventOfCodeUtil.Coordinate(coordinate.x - 1, coordinate.y))) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(new AdventOfCodeUtil.Coordinate(coordinate.x - 1, coordinate.y));
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x - 1, coordinate.y), list);
								} else {
									List<AdventOfCodeUtil.Coordinate> list = new ArrayList<>();
									list.add(coordinate);
									proposedmoves.put(new AdventOfCodeUtil.Coordinate(coordinate.x - 1, coordinate.y), list);
								}
							} else {
								if (proposedmoves.containsKey(coordinate)) {
									List<AdventOfCodeUtil.Coordinate> list = proposedmoves.get(coordinate);
									list.add(coordinate);
									proposedmoves.put(coordinate, list);
								} else {
									List<AdventOfCodeUtil.Coordinate> listd = new ArrayList<>();
									listd.add(coordinate);
									proposedmoves.put(coordinate, listd);
								}
							}
						}
					} else {
						List<AdventOfCodeUtil.Coordinate> listd = new ArrayList<>();
						listd.add(coordinate);
						proposedmoves.put(coordinate, listd);
					}
				}
			}

			if (!elfmoved) {
				System.out.println(k + 1);
				throw new Exception();
			}

			List<AdventOfCodeUtil.Coordinate> newlist = new ArrayList<>();

			for (Map.Entry<AdventOfCodeUtil.Coordinate, List<AdventOfCodeUtil.Coordinate>> entry : proposedmoves.entrySet()) {
				if (entry.getValue().size() > 1) {
					for (AdventOfCodeUtil.Coordinate coordinate: entry.getValue()) {
						coordinate.number = "#";
						newlist.add(coordinate);
					}
				} else {
					AdventOfCodeUtil.Coordinate coordinate = entry.getKey();
					coordinate.number = "#";
					newlist.add(coordinate);
				}
			}

			int minx2 = newlist.stream().min(Comparator.comparing(coordinate -> coordinate.x)).get().x;
			int miny2 = newlist.stream().min(Comparator.comparing(coordinate -> coordinate.y)).get().y;
			int maxx2 = newlist.stream().max(Comparator.comparing(coordinate -> coordinate.x)).get().x;
			int maxy2 = newlist.stream().max(Comparator.comparing(coordinate -> coordinate.y)).get().y;

			for (int j = minx2; j <= maxx2; j++) {
				for (int i = miny2; i <= maxy2; i++) {
					if (!newlist.contains(new AdventOfCodeUtil.Coordinate(j, i))) {
						AdventOfCodeUtil.Coordinate coordinate = new AdventOfCodeUtil.Coordinate(j, i);
						coordinate.number = ".";
						newlist.add(coordinate);
					}
				}
			}
			coordinates = newlist;

		}

		int minx2 = coordinates.stream().filter(coordinate -> coordinate.number.equals("#")).min(Comparator.comparing(coordinate -> coordinate.x)).get().x;
		int miny2 = coordinates.stream().filter(coordinate -> coordinate.number.equals("#")).min(Comparator.comparing(coordinate -> coordinate.y)).get().y;
		int maxx2 = coordinates.stream().filter(coordinate -> coordinate.number.equals("#")).max(Comparator.comparing(coordinate -> coordinate.x)).get().x;
		int maxy2 = coordinates.stream().filter(coordinate -> coordinate.number.equals("#")).max(Comparator.comparing(coordinate -> coordinate.y)).get().y;

		for (int j = minx2; j <= maxx2; j++) {
			for (int i = miny2; i <= maxy2; i++) {
				if (AdventOfCodeUtil.getCoordinate(j, i, coordinates).number.equals(".")) {
					total += 1;
				}
			}
		}


        System.out.println(total);

    }

	public static boolean checkNorth(AdventOfCodeUtil.Coordinate coordinate, List<AdventOfCodeUtil.Coordinate> coordinates) {
		return coordinates.stream().filter(coordinate2 -> coordinate2.number.equals("#")).filter(coordinate1 -> ((coordinate1.y == coordinate.y - 1 && coordinate1.x == coordinate.x)
		|| (coordinate1.y == coordinate.y - 1 && coordinate1.x == coordinate.x - 1 )
		|| (coordinate1.y == coordinate.y - 1 && coordinate1.x == coordinate.x + 1))).findAny().isPresent();
	}

	public static boolean checkSouth(AdventOfCodeUtil.Coordinate coordinate, List<AdventOfCodeUtil.Coordinate> coordinates) {
		return coordinates.stream().filter(coordinate2 -> coordinate2.number.equals("#")).filter(coordinate1 -> ((coordinate1.y == coordinate.y + 1 && coordinate1.x == coordinate.x)
				|| (coordinate1.y == coordinate.y + 1 && coordinate1.x == coordinate.x - 1 )
				|| (coordinate1.y == coordinate.y + 1 && coordinate1.x == coordinate.x + 1))).findAny().isPresent();
	}

	public static boolean checkWest(AdventOfCodeUtil.Coordinate coordinate, List<AdventOfCodeUtil.Coordinate> coordinates) {
		return coordinates.stream().filter(coordinate2 -> coordinate2.number.equals("#")).filter(coordinate1 -> ((coordinate1.x == coordinate.x - 1 && coordinate1.y == coordinate.y)
				|| (coordinate1.x == coordinate.x - 1 && coordinate1.y == coordinate.y - 1 )
				|| (coordinate1.x == coordinate.x - 1 && coordinate1.y == coordinate.y + 1))).findAny().isPresent();
	}

	public static boolean checkEast(AdventOfCodeUtil.Coordinate coordinate, List<AdventOfCodeUtil.Coordinate> coordinates) {
		return coordinates.stream().filter(coordinate2 -> coordinate2.number.equals("#")).filter(coordinate1 -> ((coordinate1.x == coordinate.x + 1 && coordinate1.y == coordinate.y)
				|| (coordinate1.x == coordinate.x + 1 && coordinate1.y == coordinate.y - 1 )
				|| (coordinate1.x == coordinate.x + 1 && coordinate1.y == coordinate.y + 1))).findAny().isPresent();
	}
}
