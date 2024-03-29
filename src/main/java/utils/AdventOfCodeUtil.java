package utils;

import java.util.*;
import java.util.stream.Collectors;

public class AdventOfCodeUtil {

	public enum CheckCoordinatesBetweenCoorindatesOptions {
		ABOVE,
		SAME,
		BELOW
	}

	public static Integer getLastNumberOfString(String input) {
		boolean numberfound = false;
		StringBuilder resultString = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			char c = input.charAt(i);
			if (Character.isDigit(c)) {
				numberfound = true;
				resultString.insert(0, c);
			} else {
				if (numberfound) {
					return Integer.parseInt(resultString.toString());
				}
			}
		}
		if (resultString.toString().isEmpty()) {
			return null;
		}
		return Integer.parseInt(resultString.toString());
	}

	public static Integer getFirstNumberOfString(String input) {
		boolean numberfound = false;
		StringBuilder resultString = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isDigit(c)) {
				numberfound = true;
				resultString.append(c);
			} else {
				if (numberfound) {
					return Integer.parseInt(resultString.toString());
				}
			}
		}
		if (resultString.toString().isEmpty()) {
			return null;
		}
		return Integer.parseInt(resultString.toString());
	}

	public static Long getFirstNumberOfStringL(String input) {
		boolean numberfound = false;
		StringBuilder resultString = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isDigit(c)) {
				numberfound = true;
				resultString.append(c);
			} else {
				if (numberfound) {
					return Long.parseLong(resultString.toString());
				}
			}
		}
		if (resultString.toString().isEmpty()) {
			return null;
		}
		return Long.parseLong(resultString.toString());
	}

	public static Integer getSecondNumberOfString(String input) {
		boolean firstNumberFound = false;
		boolean firstNumberHasBeenFound = false;
		boolean secondNumberFound = false;
		StringBuilder resultString = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isDigit(c)) {
				firstNumberFound = true;
				if (firstNumberHasBeenFound) {
					resultString.append(c);
					secondNumberFound = true;
				}
			} else {
				if (secondNumberFound) {
					return Integer.parseInt(resultString.toString());
				}
				if (firstNumberFound) {
					firstNumberHasBeenFound = true;
				}

			}
		}
		if (resultString.toString().isEmpty()) {
			return null;
		}
		return Integer.parseInt(resultString.toString());
	}

	public static Set<Integer> rangeInts(int startint, int endint, boolean include) {
		Set<Integer> returnList = new HashSet<>();
		if (endint < startint) {
			int startinttemp = startint;
			startint = endint;
			endint = startinttemp;
		}

		if (include) {
			for (int i = startint; i <= endint; i++) {
				returnList.add(i);
			}
			return returnList;
		}
		for (int i = startint + 1; i < endint; i++) {
			returnList.add(i);
		}
		return returnList;
	}

	public static List<Integer> rangeIntsList(int startint, int endint, boolean include) {
		if (startint < endint) {
			List<Integer> returnList = new ArrayList<>();

			if (include) {
				for (int i = startint; i <= endint; i++) {
					returnList.add(i);
				}
				return returnList;
			}
			for (int i = startint + 1; i < endint; i++) {
				returnList.add(i);
			}
			return returnList;
		} else {
			List<Integer> returnList = new ArrayList<>();

			if (include) {
				for (int i = startint; i >= endint; i--) {
					returnList.add(i);
				}
				return returnList;
			}
			for (int i = startint -1; i > endint; i--) {
				returnList.add(i);
			}
			return returnList;
		}
	}

	public static class Coordinate implements Comparable<Coordinate> {
		public int x;
		public int y;

		public int length;
		public Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public Coordinate(int x, int y, boolean isRock, boolean isSand) {
			this.x = x;
			this.y = y;
			this.isRock = isRock;
			this.isSand = isSand;
		}

		public boolean isRock;
		public boolean isSand;



		public String number;
		public int numberint;
		public Integer tentdist = null;
		public boolean visited = false;
		public boolean crossedaway = false;
		public boolean hasFlashed = false;


		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Coordinate that = (Coordinate) o;
			return x == that.x &&
					y == that.y;
		}

		@Override
		public int hashCode() {
			return Objects.hash(x, y);
		}

		@Override
		public int compareTo(Coordinate o) {
			if (this.y > o.y) {
				return 1;
			}
			if (this.y < o.y) {
				return -1;
			}
			if (this.x > o.x) {
				return 1;
			}
			if (this.x < o.x) {
				return -1;
			}
			return 0;
		}
	}

	public static boolean containsCoordinate(Coordinate coordinate, Set<Coordinate> coordinates) {
		return coordinates.contains(coordinate);
	}

	public static boolean containsCoordinate(Coordinate coordinate, List<Coordinate> coordinates) {
		return coordinates.contains(coordinate);
	}

	public static Set<Coordinate> getAdjacent(Coordinate coordinate, Set<Coordinate> coordinates) {
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

	public static List<Coordinate> getAdjacent(Coordinate coordinate, List<Coordinate> coordinates) {
		return coordinates.stream().filter(coordinate1 ->
				coordinate1.y - 1 == coordinate.y && coordinate1.x - 1 == coordinate.x
						|| coordinate1.y - 1 == coordinate.y && coordinate1.x == coordinate.x
						|| coordinate1.y - 1 == coordinate.y && coordinate1.x + 1 == coordinate.x
						|| coordinate1.y == coordinate.y && coordinate1.x - 1 == coordinate.x
						|| coordinate1.y == coordinate.y && coordinate1.x + 1 == coordinate.x
						|| coordinate1.y + 1 == coordinate.y && coordinate1.x - 1 == coordinate.x
						|| coordinate1.y + 1 == coordinate.y && coordinate1.x == coordinate.x
						|| coordinate1.y + 1 == coordinate.y && coordinate1.x + 1 == coordinate.x
		).collect(Collectors.toList());
	}

	public static List<Coordinate> getAdjacentEmpty(Coordinate coordinate, List<Coordinate> coordinates) {
		List<Coordinate> coordinates1 =  coordinates.stream().filter(coordinate1 ->
				coordinate1.y - 1 == coordinate.y && coordinate1.x - 1 == coordinate.x
						|| coordinate1.y - 1 == coordinate.y && coordinate1.x == coordinate.x
						|| coordinate1.y - 1 == coordinate.y && coordinate1.x + 1 == coordinate.x
						|| coordinate1.y == coordinate.y && coordinate1.x - 1 == coordinate.x
						|| coordinate1.y == coordinate.y && coordinate1.x== coordinate.x
						|| coordinate1.y == coordinate.y && coordinate1.x + 1 == coordinate.x
						|| coordinate1.y + 1 == coordinate.y && coordinate1.x - 1 == coordinate.x
						|| coordinate1.y + 1 == coordinate.y && coordinate1.x == coordinate.x
						|| coordinate1.y + 1 == coordinate.y && coordinate1.x + 1 == coordinate.x
		).collect(Collectors.toList());

		List<Coordinate> empty = new ArrayList<>();
		if (coordinates1.stream().noneMatch(coordinate1 -> coordinate1.x == coordinate.x && coordinate1.y == coordinate.y)) {
			empty.add(new Coordinate(coordinate.x, coordinate.y));
		}
//		if (coordinates1.stream().noneMatch(coordinate1 -> coordinate1.x == coordinate.x - 1  && coordinate1.y == coordinate.y - 1 )) {
//			empty.add(new Coordinate(coordinate.x - 1, coordinate.y - 1));
//		}
		if (coordinates1.stream().noneMatch(coordinate1 -> coordinate1.x== coordinate.x - 1  && coordinate1.y == coordinate.y)) {
			empty.add(new Coordinate(coordinate.x - 1, coordinate.y));
		}
//		if (coordinates1.stream().noneMatch(coordinate1 -> coordinate1.x== coordinate.x - 1  && coordinate1.y== coordinate.y + 1 )) {
//			empty.add(new Coordinate(coordinate.x - 1, coordinate.y + 1));
//		}

		if (coordinates1.stream().noneMatch(coordinate1 -> coordinate1.x == coordinate.x && coordinate1.y== coordinate.y - 1 )) {
			empty.add(new Coordinate(coordinate.x, coordinate.y - 1));
		}
		if (coordinates1.stream().noneMatch(coordinate1 -> coordinate1.x == coordinate.x && coordinate1.y == coordinate.y + 1)) {
			empty.add(new Coordinate(coordinate.x, coordinate.y + 1));
		}

//		if (coordinates1.stream().noneMatch(coordinate1 -> coordinate1.x == coordinate.x + 1 && coordinate1.y == coordinate.y - 1)) {
//			empty.add(new Coordinate(coordinate.x + 1, coordinate.y - 1));
//		}
		if (coordinates1.stream().noneMatch(coordinate1 -> coordinate1.x== coordinate.x + 1  && coordinate1.y == coordinate.y)) {
			empty.add(new Coordinate(coordinate.x + 1, coordinate.y));
		}
//		if (coordinates1.stream().noneMatch(coordinate1 -> coordinate1.x == coordinate.x + 1 && coordinate1.y== coordinate.y + 1 )) {
//			empty.add(new Coordinate(coordinate.x + 1, coordinate.y + 1));
//		}
		return empty.stream().filter(coordinate1 -> coordinate1.y >= 0).collect(Collectors.toList());

	}

	public static Set<Coordinate> getAdjacentHigher(Coordinate coordinate, List<Coordinate> coordinates) {
		return coordinates.stream().filter(coordinate1 ->
				coordinate1.y - 1 == coordinate.y && coordinate1.x - 1 == coordinate.x
						|| coordinate1.y - 1 == coordinate.y && coordinate1.x == coordinate.x
						|| coordinate1.y - 1 == coordinate.y && coordinate1.x + 1 == coordinate.x
						|| coordinate1.y == coordinate.y && coordinate1.x - 1 == coordinate.x
						|| coordinate1.y + 1 == coordinate.y && coordinate1.x - 1 == coordinate.x
		).collect(Collectors.toSet());
	}


	public static List<Coordinate> getAdjacentNoVert(Coordinate coordinate, Set<Coordinate> coordinates) {
		return coordinates.stream().filter(coordinate1 ->
						coordinate1.y - 1 == coordinate.y && coordinate1.x == coordinate.x
						|| coordinate1.y == coordinate.y && coordinate1.x - 1 == coordinate.x
						|| coordinate1.y == coordinate.y && coordinate1.x + 1 == coordinate.x
						|| coordinate1.y + 1 == coordinate.y && coordinate1.x == coordinate.x
		).collect(Collectors.toList());
	}

	public static List<Coordinate> getAdjacentNoVert(Coordinate coordinate, List<Coordinate> coordinates) {
		return coordinates.stream().filter(coordinate1 ->
				coordinate.number.equals(".") &&
						(coordinate1.y - 1 == coordinate.y && coordinate1.x == coordinate.x
						|| coordinate1.y == coordinate.y && coordinate1.x - 1 == coordinate.x
						|| coordinate1.y == coordinate.y && coordinate1.x + 1 == coordinate.x
						|| coordinate1.y == coordinate.y && coordinate1.x == coordinate.x
						|| coordinate1.y + 1 == coordinate.y && coordinate1.x == coordinate.x)
		).collect(Collectors.toList());
	}

	public static List<Coordinate> getAdjacentNoVertNoStrHigher(Coordinate coordinate, Set<Coordinate> coordinates) {

		if (coordinate == null) {
			System.out.println(coordinate.x);
			return new ArrayList<>();
		}

		if (coordinate.number.equals("S") || coordinate.number.equals("E")) {

			return coordinates.stream().filter(coordinate1 ->
					coordinate1.y - 1 == coordinate.y && coordinate1.x == coordinate.x
							|| coordinate1.y == coordinate.y && coordinate1.x - 1 == coordinate.x
							|| coordinate1.y == coordinate.y && coordinate1.x + 1 == coordinate.x
							|| coordinate1.y + 1 == coordinate.y && coordinate1.x == coordinate.x
			).collect(Collectors.toList());
		} else {

			return coordinates.stream().filter(coordinate1 ->
					(coordinate1.y - 1 == coordinate.y && coordinate1.x == coordinate.x
							|| coordinate1.y == coordinate.y && coordinate1.x - 1 == coordinate.x
							|| coordinate1.y == coordinate.y && coordinate1.x + 1 == coordinate.x
							|| coordinate1.y + 1 == coordinate.y && coordinate1.x == coordinate.x)
					&& (Character.valueOf(coordinate.number.charAt(0)).compareTo(Character.valueOf(coordinate1.number.charAt(0))) > -2))
			.collect(Collectors.toList());


		}
	}

	public static List<Coordinate> horLineHigher(Coordinate coordinate, List<Coordinate> coordinates) {
		return coordinates.stream().filter(coordinate1 ->
				coordinate1.y > coordinate.y && coordinate1.x == coordinate.x
		).collect(Collectors.toList());
	}

	public static List<Coordinate> horLineLower(Coordinate coordinate, List<Coordinate> coordinates) {
		return coordinates.stream().filter(coordinate1 ->
				coordinate1.y < coordinate.y && coordinate1.x == coordinate.x
		).collect(Collectors.toList());
	}

	public static List<Coordinate> vertLineHigher(Coordinate coordinate, List<Coordinate> coordinates) {
		return coordinates.stream().filter(coordinate1 ->
				coordinate1.y == coordinate.y && coordinate1.x > coordinate.x
		).collect(Collectors.toList());
	}

	public static List<Coordinate> vertLineLower(Coordinate coordinate, List<Coordinate> coordinates) {
		return coordinates.stream().filter(coordinate1 ->
				coordinate1.y == coordinate.y && coordinate1.x < coordinate.x
		).collect(Collectors.toList());
	}

	public static Set<Coordinate> getAdjacentNoVertHigher(Coordinate coordinate, Set<Coordinate> coordinates) {
		return coordinates.stream().filter(coordinate1 ->
				coordinate1.y - 1 == coordinate.y && coordinate1.x == coordinate.x
						|| coordinate1.y == coordinate.y && coordinate1.x - 1 == coordinate.x

		).collect(Collectors.toSet());
	}

	public static List<Coordinate> getAdjacentNoVertNo9(Coordinate coordinate, List<Coordinate> coordinates) {
		return coordinates.stream().filter(coordinate1 ->
				!coordinate1.number.equals("9") && (
				coordinate1.y - 1 == coordinate.y && coordinate1.x == coordinate.x
						|| coordinate1.y == coordinate.y && coordinate1.x - 1 == coordinate.x
						|| coordinate1.y == coordinate.y && coordinate1.x + 1 == coordinate.x
						|| coordinate1.y + 1 == coordinate.y && coordinate1.x == coordinate.x)
		).collect(Collectors.toList());
	}

	public static Coordinate getCoordinate(int x, int y, Set<Coordinate> coordinates) {
		return coordinates.stream().filter(coordinate -> coordinate.x == x && coordinate.y == y).findFirst().get();
	}

	public static Coordinate getCoordinate(int x, int y, List<Coordinate> coordinates) {
		return coordinates.stream().filter(coordinate -> coordinate.x == x && coordinate.y == y).findFirst().get();
	}

	/**
	 * Return dichtbijzijnst coordinate links van coordinate, of null als geen coordinaat links
	 * @param coordinate
	 * @param coordinates
	 * @return
	 */
	public static Coordinate getLeft(Coordinate coordinate, Set<Coordinate> coordinates) {
		Optional<Coordinate> coordinate2 =  coordinates.stream().filter(coordinate1 -> coordinate1.y == coordinate.y && coordinate.x > coordinate1.x).max(Comparator.comparingInt(anInt -> anInt.x));
		return coordinate2.orElse(null);
	}

	public static Coordinate getUp1(Coordinate coordinate, Set<Coordinate> coordinates) {
		Optional<Coordinate> coordinate2 =  coordinates.stream().filter(coordinate1 -> coordinate1.y + 1 == coordinate.y && coordinate.x == coordinate1.x).findFirst();
		return coordinate2.orElse(null);
	}

	public static Coordinate getUpLeft1(Coordinate coordinate, Set<Coordinate> coordinates) {
		Optional<Coordinate> coordinate2 =  coordinates.stream().filter(coordinate1 -> coordinate1.y + 1 == coordinate.y && coordinate.x == coordinate1.x + 1).findFirst();
		return coordinate2.orElse(null);
	}

	public static Coordinate getLeft1(Coordinate coordinate, Set<Coordinate> coordinates) {
		Optional<Coordinate> coordinate2 =  coordinates.stream().filter(coordinate1 -> coordinate1.y == coordinate.y && coordinate.x == coordinate1.x + 1).findFirst();
		return coordinate2.orElse(null);
	}

	public static Coordinate getRight(Coordinate coordinate, List<Coordinate> coordinates) {
		Optional<Coordinate> coordinate2 =  coordinates.stream().filter(coordinate1 -> coordinate1.y == coordinate.y && coordinate.x < coordinate1.x).findFirst();
		return coordinate2.orElse(null);
	}

	public static boolean checkCoordinatesBetweenCoordinates(Coordinate coordinate1, Coordinate coordinate2, Set<Coordinate> coordinates, CheckCoordinatesBetweenCoorindatesOptions check) {
		if (check == CheckCoordinatesBetweenCoorindatesOptions.BELOW) {
			Set<Integer> xcoordinates = rangeInts(coordinate1.x, coordinate2.x, false);
			for (int x: xcoordinates) {
				Coordinate coordinate = new Coordinate(x, coordinate1.y + 1);
				if (!containsCoordinate(coordinate, coordinates)) {
					return false;
				}
			}
			return true;
		}

		if (check == CheckCoordinatesBetweenCoorindatesOptions.SAME) {
			Set<Integer> xcoordinates = rangeInts(coordinate1.x, coordinate2.x, false);
			for (int x: xcoordinates) {
				Coordinate coordinate = new Coordinate(x, coordinate1.y);
				if (!containsCoordinate(coordinate, coordinates)) {
					return false;
				}
			}
			return true;
		}

		if (check == CheckCoordinatesBetweenCoorindatesOptions.ABOVE) {
			Set<Integer> xcoordinates = rangeInts(coordinate1.x, coordinate2.x, false);
			for (int x: xcoordinates) {
				Coordinate coordinate = new Coordinate(x, coordinate1.y - 1);
				if (!containsCoordinate(coordinate, coordinates)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public static Set<Coordinate> cloneListExcept(Set<Coordinate> coordinates, Coordinate exception, Coordinate replacement) {
		Set<Coordinate> coordinates1 = new HashSet<>();
		for (Coordinate coordinate: coordinates) {
			if (coordinate.equals(exception)) {

			} else {
				coordinates1.add(coordinate);
			}
;		}
		if (replacement != null) {
			coordinates1.add(replacement);
		}
		return coordinates1;
	}

	public static <T> List<T> cloneList(List<T> original) {
		List<T> newList = new ArrayList<>();
		for (T object: original) {
			newList.add(object);
		}
		return newList;
	}

	public static List<Integer> convertNumberToDigits(int number) {
		List<Integer> result = new ArrayList<>();
		for (char c : String.valueOf(number).toCharArray()) {
			result.add(Character.getNumericValue(c));
		}
		return result;
	}

	static List<Integer> convertNumberStringToDigits(String number) {
		List<Integer> result = new ArrayList<>();
		for (char c : number.toCharArray()) {
			result.add(Character.getNumericValue(c));
		}
		return result;
	}

	/**
	 * Doorloopt lijst list en returnt de index van de rij sequence. Als sequence niet in list voorkomt,
	 * return null.
	 * @param sequence
	 * @param list
	 * @return
	 */
	public static Integer getIndexOfSequence(String sequence, List<Integer> list) {
		int start = 0;
		List<Integer> checkList = convertNumberStringToDigits(sequence);
		int end = list.size() - sequence.length();
		for (int i = start; i < end; i++) {
			List<Integer> sublist = new ArrayList<>();
			for (int j = i; j < i + sequence.length(); j++) {
				sublist.add(list.get(j));
			}
			if (sublist.equals(checkList)) {
				return i;
			}
		}
		return null;
	}

	public static String determineTextBetweenBrackets(String input, int indexOfBracket) {
		List<DetermineTextBetBracketsHelper> list = new ArrayList<>();
		for (int i =indexOfBracket; i < input.length(); i++) {
			String s = Character.toString(input.charAt(i));
			if (s.equals("[") || s.equals("]")) {
				DetermineTextBetBracketsHelper determineTextBetBracketsHelper = new DetermineTextBetBracketsHelper();
				determineTextBetBracketsHelper.index = i;
				determineTextBetBracketsHelper.bracket = s;
				list.add(determineTextBetBracketsHelper);
			}
		}
		int counter = 0;
		for (DetermineTextBetBracketsHelper det: list) {
			if (det.bracket.equals("[")) {
				counter +=1;
			} else if (det.bracket.equals("]") && counter == 1) {
				return input.substring(indexOfBracket + 1, det.index);
			} else {
				counter-=1;
			}
		}
		return null;
	}

	public static boolean stringContains(String longer, String shorter) {
		for (char c : shorter.toCharArray()) {
			if (!longer.contains(Character.toString(c))) {
				return false;
			}
		}
		return true;
	}

	public static int stringCountInstances(String longer, String shorter) {
		int j = 0;
		for (char c : shorter.toCharArray()) {
			if (longer.contains(Character.toString(c))) {
				j++;
			}
		}
		return j;
	}

	static class DetermineTextBetBracketsHelper {
		int index;
		String bracket;
	}

	public static boolean isNumeric(String strNum) {
		if (strNum == null) {
			return false;
		}
		try {
			double d = Double.parseDouble(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static long roundUp(long num, long divisor) {
		return (num + divisor - 1) / divisor;
	}

}
