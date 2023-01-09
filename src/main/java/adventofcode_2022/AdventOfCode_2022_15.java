package adventofcode_2022;


import utils.AdventOfCodeUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AdventOfCode_2022_15 {

	static String input = "Sensor at x=1363026, y=2928920: closest beacon is at x=1571469, y=3023534\n" +
			"Sensor at x=2744178, y=3005943: closest beacon is at x=3091714, y=3106683\n" +
			"Sensor at x=223983, y=2437431: closest beacon is at x=-278961, y=3326224\n" +
			"Sensor at x=2454616, y=2576344: closest beacon is at x=2885998, y=2387754\n" +
			"Sensor at x=1551436, y=29248: closest beacon is at x=1865296, y=-1279130\n" +
			"Sensor at x=2997120, y=2493979: closest beacon is at x=2885998, y=2387754\n" +
			"Sensor at x=1588355, y=3153332: closest beacon is at x=1571469, y=3023534\n" +
			"Sensor at x=3539081, y=3302128: closest beacon is at x=3309042, y=3583067\n" +
			"Sensor at x=3973905, y=60392: closest beacon is at x=3515381, y=-806927\n" +
			"Sensor at x=3305001, y=3120691: closest beacon is at x=3091714, y=3106683\n" +
			"Sensor at x=3859262, y=2668840: closest beacon is at x=3574747, y=2000000\n" +
			"Sensor at x=2475557, y=3997856: closest beacon is at x=2364210, y=4052453\n" +
			"Sensor at x=2775306, y=3668540: closest beacon is at x=3309042, y=3583067\n" +
			"Sensor at x=3018235, y=2285225: closest beacon is at x=2885998, y=2387754\n" +
			"Sensor at x=3033163, y=3294719: closest beacon is at x=3091714, y=3106683\n" +
			"Sensor at x=3079956, y=3215569: closest beacon is at x=3091714, y=3106683\n" +
			"Sensor at x=3994355, y=1831842: closest beacon is at x=3574747, y=2000000\n" +
			"Sensor at x=1741021, y=3231978: closest beacon is at x=1571469, y=3023534\n" +
			"Sensor at x=1873455, y=3917294: closest beacon is at x=2364210, y=4052453\n" +
			"Sensor at x=3128140, y=2938277: closest beacon is at x=3091714, y=3106683\n" +
			"Sensor at x=732217, y=3603298: closest beacon is at x=-278961, y=3326224\n" +
			"Sensor at x=3884431, y=3834735: closest beacon is at x=3309042, y=3583067\n" +
			"Sensor at x=3679358, y=1029949: closest beacon is at x=3574747, y=2000000\n" +
			"Sensor at x=2260133, y=3563353: closest beacon is at x=2364210, y=4052453\n" +
			"Sensor at x=60149, y=3320681: closest beacon is at x=-278961, y=3326224\n" +
			"Sensor at x=3132535, y=2405693: closest beacon is at x=2885998, y=2387754\n" +
			"Sensor at x=3028313, y=2829410: closest beacon is at x=3091714, y=3106683\n" +
			"Sensor at x=3142423, y=3921417: closest beacon is at x=3309042, y=3583067\n" +
			"Sensor at x=2636416, y=939525: closest beacon is at x=2885998, y=2387754\n" +
			"Sensor at x=524530, y=681397: closest beacon is at x=-1031499, y=681463\n" +
			"Sensor at x=3155000, y=1666362: closest beacon is at x=3574747, y=2000000\n" +
			"Sensor at x=2169350, y=3040469: closest beacon is at x=1571469, y=3023534\n" +
			"Sensor at x=1663350, y=1595182: closest beacon is at x=1571469, y=3023534\n" +
			"Sensor at x=3311582, y=3386773: closest beacon is at x=3309042, y=3583067";

	public static void main(String... args) {
		int total = 0;

		Set<AdventOfCodeUtil.Coordinate> beacons = new HashSet<>();


		List<List<AdventOfCodeUtil.Coordinate>> coordinates = new ArrayList<>();
		Set<AdventOfCodeUtil.Coordinate> cantbe = new HashSet<>();

		for (int i = 0; i < input.split("\n").length; i++) {
			String ii = input.split("\n")[i];
			String sensorstring = ii.split("Sensor at ")[1].split(":")[0];
			String closestbeaconstring = ii.split(" closest beacon is at ")[1];
			AdventOfCodeUtil.Coordinate sensor = new AdventOfCodeUtil.Coordinate(Integer.parseInt(sensorstring.split(",")[0].split("x=")[1]), Integer.parseInt(sensorstring.split(",")[1].split("y=")[1]));
			AdventOfCodeUtil.Coordinate beacon = new AdventOfCodeUtil.Coordinate(Integer.parseInt(closestbeaconstring.split(",")[0].split("x=")[1]), Integer.parseInt(closestbeaconstring.split(",")[1].split("y=")[1]));
			beacons.add(beacon);
			int dist = Math.abs(sensor.x - beacon.x) + Math.abs(sensor.y - beacon.y);
			coordinates.add(calclosest(sensor, dist));
		}

		for (List<AdventOfCodeUtil.Coordinate> coordinateList: coordinates) {
			List<AdventOfCodeUtil.Coordinate> sublist = coordinateList.stream().filter(coordinate -> coordinate.y == 2000000).collect(Collectors.toList());
			if (!sublist.isEmpty()) {
				if (sublist.size() == 1) {
					cantbe.add(sublist.get(0));
				} else {
					int smallest = Math.min(sublist.get(0).x, sublist.get(1).x);
					for (int i = 0; i <= Math.abs(sublist.get(1).x - sublist.get(0).x); i++) {
						AdventOfCodeUtil.Coordinate coordinate = new AdventOfCodeUtil.Coordinate(i + smallest, sublist.get(0).y);
						cantbe.add(coordinate);
					}
				}
			}
		}

		System.out.println(cantbe.size() - (int) beacons.stream().filter(coor -> coor.y == 2000000).count());

	}

	public static List<AdventOfCodeUtil.Coordinate> calclosest(AdventOfCodeUtil.Coordinate coordinate, int dist) {
		Set<AdventOfCodeUtil.Coordinate> closestset = new HashSet<>();

		int xleft = coordinate.x - dist;
		int xright = coordinate.x + dist;
		int ytop = coordinate.y + dist;
		int ybot = coordinate.y - dist;

		AdventOfCodeUtil.Coordinate xleftcoor = new AdventOfCodeUtil.Coordinate(xleft, coordinate.y);
		AdventOfCodeUtil.Coordinate xrightcoor = new AdventOfCodeUtil.Coordinate(xright, coordinate.y);
		AdventOfCodeUtil.Coordinate ytopcoor = new AdventOfCodeUtil.Coordinate(coordinate.x, ytop);
		AdventOfCodeUtil.Coordinate ybotcoor = new AdventOfCodeUtil.Coordinate(coordinate.x, ybot);

		closestset.addAll(calcLine(xleftcoor, ytopcoor));
		closestset.addAll(calcLine(ytopcoor, xrightcoor));
		closestset.addAll(calcLine(xrightcoor, ybotcoor));
		closestset.addAll(calcLine(ybotcoor, xleftcoor));

		return new ArrayList<>(closestset);



	}

	public static List<AdventOfCodeUtil.Coordinate> calcLine(AdventOfCodeUtil.Coordinate first, AdventOfCodeUtil.Coordinate second) {
		List<AdventOfCodeUtil.Coordinate> coordinates = new ArrayList<>();
		boolean xup = first.x < second.x;
		boolean yup = first.y < second.y;


		int dist = Math.abs(first.x - second.x);
		for (int i = 0; i <= dist; i++) {
			if (xup && yup) {
				AdventOfCodeUtil.Coordinate coordinate = new AdventOfCodeUtil.Coordinate(first.x + i, first.y + i);
				coordinates.add(coordinate);
			}
			else if (xup) {
				AdventOfCodeUtil.Coordinate coordinate = new AdventOfCodeUtil.Coordinate(first.x + i, first.y - i);
				coordinates.add(coordinate);
			}
			else if (yup) {
				AdventOfCodeUtil.Coordinate coordinate = new AdventOfCodeUtil.Coordinate(first.x - i, first.y + i);
				coordinates.add(coordinate);
			} else {
				AdventOfCodeUtil.Coordinate coordinate = new AdventOfCodeUtil.Coordinate(first.x - i, first.y - i);
				coordinates.add(coordinate);
			}
		}
		return coordinates;
	}
}
