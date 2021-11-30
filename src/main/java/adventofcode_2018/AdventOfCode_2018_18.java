package adventofcode_2018;

import utils.AdventOfCodeUtil;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class AdventOfCode_2018_18 {

	static String input = "#...|#...#.....#...|#.#.|...|......|#|...|||#..||.\n" +
			".|..#.....#.|...#.##.#.#||.#...|#...#.|.|.#..||...\n" +
			".#..#.###|.#..|.......#...|.#|..#......|.#..#.....\n" +
			"...#.#|#.#.#.|.|#.#.#.#.##....#.......|##||..#.|.#\n" +
			"..##...#.....|||.#|.#..|.#.#...|....#....#........\n" +
			".#.#...#|...#........|.#..#.|#.#.#|.|.....##...#|#\n" +
			"#......|....||.##..#|...|..|||....##..|.#.|.###|..\n" +
			"...#|....|...........#||..|...|#|....||||..#|..#..\n" +
			"|..|....#....###....|.|..#.#|.|....#....#.#.#...||\n" +
			"..#.#...#.#...|||#|#..|..#.||..#......|..##...|.#|\n" +
			".|#.#.||.##..#..#.|.#......|.###.#|.#|....|...##..\n" +
			".|..|#|.....||...#.|.#.|#|##|..|..|||..||#......|.\n" +
			"#.....||#.|..##....|#|||..|....|..#.#.#|#|#...|..|\n" +
			"..#|..........|#..#..#|.#..|...##|.#..#...|#|..#.|\n" +
			"#|....#...|.##..#.|#.|.|##.........|.|.......#...|\n" +
			".....|.....||###.#.##..|....|..|||##|.|#.|.||#..#.\n" +
			"|..#.||#|#.#.|##.|||#.|###.#|#...##...#.|.....|..|\n" +
			".||...#.|.....|#|...|....#......#....|.|.|||#.#..#\n" +
			"...|..#....|.||||..|..|........|..#.......#..#.|..\n" +
			"##||#|||..........|##.#.#....###..|..||...|.#.|..#\n" +
			"|##||#....#....|.......#......||...#..#.||..#.|#..\n" +
			".##.#..|.|#.##.....##|..#......#.#..|...#...#...|.\n" +
			".#...#......#.##..##.|#.#.#.|.|#.||....##|..|....|\n" +
			"#...#..#||#.||....#|..|....#..|.#|#|###|||....|..|\n" +
			"..|.|||.#||.#|........#....|.##||||.|##..#........\n" +
			".......|#.#|.|..|#|.#........|#|.||.....##.||||..#\n" +
			"..|...##...#..||#|.##|..#..|...##..#.|||#|#|||.||.\n" +
			".#..|..#....##........|..##||.#..||#.....###.....|\n" +
			"##......|#.|...#..#||..||||...|..||.|...|..#...#.#\n" +
			"#.|...#.#..#.....#..|.|.#.....#|.#.........#.#....\n" +
			".....#...|..##|....#|..||#....||#...#.#.||.||#..|#\n" +
			"....#...#..|||.#...#.|.....|.....||.#...||#.....#.\n" +
			"....#....|....#...##|..|||||#........|....##..#.##\n" +
			".#...#.#|##.|..||..||......#||..|..|#...##.#.|##..\n" +
			"..#.#.#.#.||#.|###.....|#.#.......#....|#|.#..#.##\n" +
			"..###....|.#..|..##.#.||....|..#..||.|.###.|#..#|.\n" +
			"#...|.#..|..#..#.....|..||.|#..#||.|..||.#.||.#.|#\n" +
			".#|...|....#..|.|..#....#|#.|.....|.|.#........|..\n" +
			".#.#|..#..#....#..###..#|..#.|#|..|.....|.|#|...|#\n" +
			".....|#.#|......####..|..#...#..|##.|..|.||#.#.|.|\n" +
			"|.....|..#.|....#...|..#....#|##|.#.#..#......#|.|\n" +
			"....|.....|#.|#.....#....|.#||...#...|.||.#...#|.#\n" +
			".......#|..........##|#|.#|#.|.|.|.|#.....#....||.\n" +
			"|#|#....##.##||.#.#.#.......|||..#....|.|...|.|.|#\n" +
			"...#.#...#|#...#..||...|.##|..#.....##|#...|.|..|.\n" +
			"....#|.|..||.........||.......|..#.......##|.....#\n" +
			"..|.||.||#.#.#.|....|#||.#|..#...|.##|..##....#|.|\n" +
			"......#.||.#||..........#....#..|..........|...#.|\n" +
			"..||...|...............|.#|..#.#|....||.....|...|.\n" +
			"...##.|#.#..||.##..|#.....|.#...##|...............";

	static Set<Coordinate18> landtypes = new TreeSet<>();
	static Set<Coordinate18> newLandTypes = new TreeSet<>();

	public static void main(String... args) {
		for (int i = 0; i < input.split("\n").length; i++) {
			String input2 = input.split("\n")[i];
			for (int j = 0 ; j < input2.length(); j++) {
				char c = input2.toCharArray()[j];
				String iput3 = Character.toString(c);
				Coordinate18 coordinate18 = new Coordinate18(j, i);
				coordinate18.landType = iput3;
				landtypes.add(coordinate18);
			}
		}
		for (int i = 1; i < 1000000000L; i++) {
			newLandTypes = new TreeSet<>();
//			String str = "";
//			int k = 0;
//			for (Coordinate18 coordinate18 : landtypes) {
//				str = str + coordinate18.landType;
//				k++;
//				if (k % 10 == 0) {
//					str = str + "\n";
//					k = 0;
//				}
//			}
//			System.out.println(str);
			for (Coordinate18 coordinate18 : landtypes) {
				Set<Coordinate18> coordinate18s = getAdjacent(coordinate18, landtypes);
				Coordinate18 coordinate181 = new Coordinate18(coordinate18.x, coordinate18.y);
				if (coordinate18.landType.equals(".")) {
					if (coordinate18s.stream().filter(coordinate182 -> coordinate182.landType.equals("|")).collect(Collectors.toSet()).size() >= 3) {
						coordinate181.landType = "|";
					} else {
						coordinate181.landType = ".";
					}
					newLandTypes.add(coordinate181);
				}
				if (coordinate18.landType.equals("|")) {
					if (coordinate18s.stream().filter(coordinate182 -> coordinate182.landType.equals("#")).collect(Collectors.toSet()).size() >= 3) {
						coordinate181.landType = "#";
					} else {
						coordinate181.landType = "|";
					}
					newLandTypes.add(coordinate181);
				}
				if (coordinate18.landType.equals("#")) {
					if (coordinate18s.stream().filter(coordinate182 -> coordinate182.landType.equals("#")).collect(Collectors.toSet()).size() >= 1
							&& coordinate18s.stream().filter(coordinate182 -> coordinate182.landType.equals("|")).collect(Collectors.toSet()).size() >= 1) {
						coordinate181.landType = "#";
					} else {
						coordinate181.landType = ".";
					}
					newLandTypes.add(coordinate181);
				}
			}
			landtypes = newLandTypes;
			int lumbers = landtypes.stream().filter(coordinate182 -> coordinate182.landType.equals("#")).collect(Collectors.toSet()).size();
			int trees = landtypes.stream().filter(coordinate182 -> coordinate182.landType.equals("|")).collect(Collectors.toSet()).size();
			System.out.println(i + ": " + lumbers * trees);
		}
	}

	static class Coordinate18 extends AdventOfCodeUtil.Coordinate {

		public Coordinate18(int x, int y) {
			super(x, y);
		}
		public String landType;
	}

	static Set<Coordinate18> getAdjacent(Coordinate18 coordinate, Set<Coordinate18> coordinates) {
		return coordinates.stream().filter(coordinate1 ->
				coordinate1.y - 1 == coordinate.y && coordinate1.x - 1 == coordinate.x
						|| coordinate1.y - 1 == coordinate.y && coordinate1.x == coordinate.x
						|| coordinate1.y - 1 == coordinate.y && coordinate1.x + 1 == coordinate.x
						|| coordinate1.y == coordinate.y && coordinate1.x - 1 == coordinate.x
						|| coordinate1.y == coordinate.y && coordinate1.x + 1 == coordinate.x
						|| coordinate1.y + 1 == coordinate.y && coordinate1.x - 1 == coordinate.x
						|| coordinate1.y + 1 == coordinate.y && coordinate1.x == coordinate.x
						|| coordinate1.y + 1 == coordinate.y && coordinate1.x + 1 == coordinate.x
		).collect(Collectors.toSet());
	}
}
