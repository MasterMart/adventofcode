package adventofcode_2018;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class AdventOfCode_2018_12 {

    public static void main(String... args) {
        String input = "#...#..##.......####.#..###..#.##..########.#.#...#.#...###.#..###.###.#.#..#...#.#..##..#######.##";

        String rules = "#..#. => #\n" +
                "#.#.. => #\n" +
                "###.. => #\n" +
                "##..# => .\n" +
                ".#.## => #\n" +
                "..... => .\n" +
                "...#. => #\n" +
                "##.#. => #\n" +
                "#.#.# => .\n" +
                "###.# => #\n" +
                "....# => .\n" +
                "####. => #\n" +
                ".##.. => #\n" +
                "#.##. => #\n" +
                "#..## => #\n" +
                "##... => #\n" +
                "#...# => .\n" +
                "##.## => #\n" +
                ".#... => .\n" +
                ".#..# => #\n" +
                "..#.# => #\n" +
                "##### => .\n" +
                ".#### => #\n" +
                "..#.. => #\n" +
                "#.### => .\n" +
                "..##. => .\n" +
                ".##.# => #\n" +
                ".#.#. => .\n" +
                "..### => .\n" +
                ".###. => .\n" +
                "...## => .\n" +
                "#.... => .";
        Map<String, String> map = new HashMap<>();
        for (String rule : rules.split("\n")) {
            map.put(rule.substring(0, 5), rule.substring(9, 10));
        }

        int previoustotal = 0;
        for (int i = 0; i < 1500; i++) {
            input = processIteration(map, input);
            int total = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '#') {
                    total += j - ((i * 5) + 5);
                }
            }
            System.out.println(i + 1 + ": " + (total - previoustotal) + " " + total);
            previoustotal = total;
        }

        System.out.println(10756 + 91*(50000000000L - 95));
    }

    public static String processIteration(Map<String, String> map, String input) {
        input = "....."  + input + ".....";
        StringBuilder newString = new StringBuilder("..");
        for (int i = 2; i < input.length() - 2; i++) {
            String substring = null;
            substring = input.substring(i - 2, i + 3);
            newString.append(map.getOrDefault(substring, "."));
        }
        newString.append("..");
        return newString.toString();
    }
}
