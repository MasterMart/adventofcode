package adventofcode_2021;


import utils.AdventOfCodeUtil;

import java.util.ArrayList;
import java.util.List;

public class AdventOfCode_2021_16 {

	static String input = "EE00D40C823060";

	public static void main(String... args) {

		String dec = input.replace("0", "0000")
				.replace("1", "0001")
				.replace("2", "0010")
				.replace("3", "0011")
				.replace("4", "0100")
				.replace("5", "0101")
				.replace("6", "0110")
				.replace("7", "0111")
				.replace("8", "1000")
				.replace("9", "1001")
				.replace("A", "1010")
				.replace("B", "1011")
				.replace("C", "1100")
				.replace("D", "1101")
				.replace("E", "1110")
				.replace("F", "1111");

		System.out.println(dec);
		//processPackage(dec);

	}

	static List<Integer> versions = new ArrayList<>();
	static List<Integer> numbers = new ArrayList<>();

	public static void processPackage(String binary, int numtoprocess) {
		int totalnum = 0;
		int version = Integer.parseInt(binary.substring(0, 3), 2);
		versions.add(version);
		int packetTypeId = Integer.parseInt(binary.substring(3, 6), 2);
		if (packetTypeId == 4) {

			String binarynum = "";

			String lead = binary.substring(6, 7);
			int leadindex = 6;
			while (lead.equals("1")) {
				binarynum += binary.substring(leadindex + 1, leadindex + 5);
				leadindex += 5;
				lead = binary.substring(leadindex, leadindex + 1);
			}

			if (lead.equals("0")) {
				binarynum += binary.substring(leadindex + 1, leadindex + 5);
			}
			numbers.add(Integer.parseInt(binarynum, 2));


			if (binary.substring(leadindex + 5).length() > 0) {
				processPackage(binary.substring(leadindex + 5), 1);
			}

		} else {
			String lengthTypeId = binary.substring(6, 7);
			if (lengthTypeId.equals("0")) {
				int numberBits = Integer.parseInt(binary.substring(7, 22), 2);
				String subPackets = binary.substring(22, 22+numberBits);
				processPackage(subPackets, 1);
			}
			if (lengthTypeId.equals("1")) {
				int numberSubpackets = Integer.parseInt(binary.substring(7, 18), 2);
				processPackage(binary.substring(18), numberSubpackets);
			}
		}
	}

	public static void splitLength(String str) {
		List<String> result = new ArrayList<>();
		int i = 0;

		while (i > str.length()) {
			result.add(str.substring(i, i + 5));
			i+=5;
		}
	}

}
