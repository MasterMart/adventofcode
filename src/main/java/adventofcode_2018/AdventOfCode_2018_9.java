package adventofcode_2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import utils.AdventOfCodeUtil;


public class AdventOfCode_2018_9 {

	static Map<Integer, Long> playerScores = new HashMap<>();
	static int numplayers = 455;
	static int curIndex = 1;
	static int curPlayer = 5;
	static int nummarbles = 7122300;
	static List<Integer> marbles = new ArrayList<>();
	static {
		marbles.add(0);
		marbles.add(4);
		marbles.add(2);
		marbles.add(1);
		marbles.add(3);
		for (int i = 1; i <= numplayers; i++) {
			playerScores.put(i, 0L);
		}
	}
	public static void main(String... args) {
		for (int i = 5; i <= nummarbles; i++) {
			if (i % 100000 == 0) {
				System.out.println(i);
			}

			if (i % 23 == 0) {
				long curscore = playerScores.get(curPlayer);
				int indexToUse = (curIndex - 7) % marbles.size();
				if (indexToUse < 0) {
					indexToUse = indexToUse + marbles.size();
				}
				int numToAdd = marbles.remove(indexToUse);
				playerScores.put(curPlayer, curscore + i + numToAdd);
				if (indexToUse == marbles.size()) {
					curIndex = 0;
				} else {
					curIndex = indexToUse;
				}
			} else {
				int indexToUse = (curIndex + 2);
				if (indexToUse == marbles.size()) {

				} else {
					indexToUse = indexToUse % marbles.size();
				}
				marbles.add(indexToUse, i);
				curIndex = indexToUse;
			}

			if (curPlayer == numplayers) {
				curPlayer = 1;
			} else {
				curPlayer++;
			}
		}

		System.out.println(playerScores.entrySet().stream().max((a, b) -> a.getValue() > b.getValue() ? 1 : -1).get().getValue());
	}
}
