package adventofcode_2022;


import utils.AdventOfCodeUtil;

import java.util.*;
import java.util.stream.Collectors;

public class AdventOfCode_2022_18 {

	static String input = "2,2,2\n" +
			"1,2,2\n" +
			"3,2,2\n" +
			"2,1,2\n" +
			"2,3,2\n" +
			"2,2,1\n" +
			"2,2,3\n" +
			"2,2,4\n" +
			"2,2,6\n" +
			"1,2,5\n" +
			"3,2,5\n" +
			"2,1,5\n" +
			"2,3,5";

	public static void main(String... args) {
		int total = 0;

		Map<Coordinate, List<Coordinate>> missingmap = new HashMap<>();

		List<Coordinate> coordinateList = new ArrayList<>();
		for (int i = 0; i < input.split("\n").length; i++) {
			String ii = input.split("\n")[i];
			Coordinate coordinate = new Coordinate();
			coordinate.x = Integer.parseInt(ii.split(",")[0]);
			coordinate.y = Integer.parseInt(ii.split(",")[1]);
			coordinate.z = Integer.parseInt(ii.split(",")[2]);
			coordinateList.add(coordinate);
		}

		for (Coordinate coordinate: coordinateList) {
			List<Coordinate> missing = findMissing(coordinateList, coordinate);
			if (!missing.isEmpty()) {
				missingmap.put(coordinate, missing);
			}
		}
		Coordinate minimum = coordinateList.stream().min(new Comparator<Coordinate>() {
			@Override
			public int compare(Coordinate o1, Coordinate o2) {
				return Integer.compare(o1.x + o1.y + o1.z, o2.x + o2.y + o2.z);
			}
		}).get();

		Coordinate firstAir = null;
		for(Coordinate d : findMissing(coordinateList, minimum)) {
			if(!coordinateList.contains(d)) {
				firstAir = d;
				break;
			}
		}
	}

	static class Coordinate {

		public Coordinate() {

		}

		public Coordinate(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}

		public int x;
		public int y;
		public int z;

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Coordinate that = (Coordinate) o;
			return x == that.x && y == that.y && z == that.z;
		}

		@Override
		public int hashCode() {
			return Objects.hash(x, y, z);
		}
	}

	public static List<Coordinate> findAdjacent(List<Coordinate> coordinates, Coordinate coordinate) {
		return coordinates.stream().filter(coordinate1 -> (coordinate1.x == coordinate.x && coordinate.y == coordinate1.y && (coordinate.z == coordinate1.z + 1 || coordinate.z == coordinate1.z - 1))
			|| (coordinate1.x == coordinate.x && coordinate.z == coordinate1.z && (coordinate.y == coordinate1.y + 1 || coordinate.y == coordinate1.y - 1))
				|| (coordinate1.z == coordinate.z && coordinate.y == coordinate1.y && (coordinate.x == coordinate1.x + 1 || coordinate.x == coordinate1.x - 1))).collect(Collectors.toList());
	}

	public static List<Coordinate> findMissing(List<Coordinate> coordinates, Coordinate coordinate) {



		List<Coordinate> coordinateList =  coordinates.stream().filter(coordinate1 -> (coordinate1.x == coordinate.x && coordinate.y == coordinate1.y && (coordinate.z == coordinate1.z + 1 || coordinate.z == coordinate1.z - 1))
				|| (coordinate1.x == coordinate.x && coordinate.z == coordinate1.z && (coordinate.y == coordinate1.y + 1 || coordinate.y == coordinate1.y - 1))
				|| (coordinate1.z == coordinate.z && coordinate.y == coordinate1.y && (coordinate.x == coordinate1.x + 1 || coordinate.x == coordinate1.x - 1))).collect(Collectors.toList());

		List<Coordinate> missing = new ArrayList<>();
		Coordinate coordinate1 = new Coordinate(coordinate.x, coordinate.y, coordinate.z - 1);
		if (!coordinateList.contains(coordinate1)) {
			missing.add(coordinate1);
		}

		Coordinate coordinate2 = new Coordinate(coordinate.x, coordinate.y, coordinate.z + 1);
		if (!coordinateList.contains(coordinate2)) {
			missing.add(coordinate2);
		}

		Coordinate coordinate3 = new Coordinate(coordinate.x + 1, coordinate.y, coordinate.z);
		if (!coordinateList.contains(coordinate3)) {
			missing.add(coordinate3);
		}
		Coordinate coordinate4 = new Coordinate(coordinate.x - 1, coordinate.y, coordinate.z);
		if (!coordinateList.contains(coordinate4)) {
			missing.add(coordinate4);
		}
		Coordinate coordinate5 = new Coordinate(coordinate.x, coordinate.y + 1, coordinate.z);
		if (!coordinateList.contains(coordinate5)) {
			missing.add(coordinate5);
		}

		Coordinate coordinate6 = new Coordinate(coordinate.x, coordinate.y - 1, coordinate.z);
		if (!coordinateList.contains(coordinate6)) {
			missing.add(coordinate6);
		}
		return missing;
	}
}
