package adventofcode_2022;


import utils.AdventOfCodeUtil;

import java.util.*;
import java.util.stream.Collectors;

public class AdventOfCode_2022_12 {

    static String input = "abcccccccccccaaaaacccccccaaaaaaccccccccccccccccccccccccccccccccaaaaaaaaaaaaaacccccccccccccccccccaaaaaacccccccacccccccccaaccaaccccccccccccccccccccccccccccccaaaaaa\n" +
            "abcccccccccccaaaaaaacccccaaaaaaccccccccaaccccccccccaaaaccccccccaaaaaaaaaaaaaccccccccccccccccccccaaaaaaccccaaaacccccccccaaaaaaccccccccccccccccccccccccccccccccaaaa\n" +
            "abccccccccccaaaaaaaacccccaaaaaccccccccaaaacccccccccaaaacccccccccccaaaaaaacccccccccccccccccccccccaaaaacccccaaaaaaccccccccaaaaacccccccccccaaaccccccccccccccccccaaaa\n" +
            "abccccccccccaaaaaaaaccccccaaaaacccccccaaaacccccccccaaaacccccaaaccccaaaaaaccccccccccccccccccccccccaaaaacccccaaaaacccccccaaaaaacccccccccccaaaacccccccccccccccccaaaa\n" +
            "abccccccccccaaaaaaccccccccaaaaacccccccaaaaccccccccccaaacccccaaaaccaaaaaaaacccccccccccccccccccccccaaaaaccccaaaaacccccccaaaaaaaaccccccccccaaaaccaaccccccccccccaaaaa\n" +
            "abcccccccccccccaaaccccccccccccccccccccccccccccccccccccccccccaaaaccaaaaaaaaccccccccccccccccccccccccccccccccaccaaccccaaaaaaaaaaacccccccccccaaaaaaccccccccccccccaccc\n" +
            "abcacccccccccccccaaaccccccccccccccaaacccccccccccccccccccccccaaaccaaaacccaaacccccccccccccccccccccccaacccccccccccccccaaacccaaccccccccccccccaaaalllllccccccccccccccc\n" +
            "abaacccccccccccccaaaaaacccccccccccaaaccccccccccccccccccccccccccccaaaccccaaaccccccccccccccccccccccaaccccccccccccccccaaaaaaaaccccccccccccccckklllllllccccaaaccccccc\n" +
            "abaaaaacccccccccaaaaaaacccccccccaaaaaaaacccccaacccccccccccccccccccccccccaaaccccccccaacccccccccaaaaacaacaacaacccccaaaaaaaaccccccccccccaaakkkkllllllllcccaaaccccccc\n" +
            "abaaaaaccccccccaaaaaaaacccccccccaaaaaaaacccccaaaaaacccccccccccccccccccccaaaccccccaaaacacccccccaaaaaaaacaaaaaccccaaaaaaaaaccccccccckkkkkkkkkklsssslllcccaaaaaacccc\n" +
            "abaaaccccccccccaaaaaaacccccccccccaaaaacccccccaaaaaaccccccccccccccccccaaaaaaaaccccaaaaaacccccccccaaaaacaaaaacccccaaaaaaaacccaaaccjjkkkkkkkkkssssssslllcccaaaaacccc\n" +
            "abaaaccccccccccccaaaaaacccccaacccaaaaaaccccaaaaaaaccaaaccccccccccccccaaaaaaaacccccaaaacccccccccaaaaaccaaaaaacccccccaaaaaaccaaaajjjjkkkkkkssssssssslllcddaaaaccccc\n" +
            "abcaaacccccccccccaaaaaacaaacaacccaaaaaaccccaaaaaaaaaaaaaaccccccccccccccaaaaaccccccaaaaccccaaaaaaacaaacccaaaaaaacccaaaaaaaccaaajjjjrrrrrrssssuuuussqmmddddaaaccccc\n" +
            "abccaacccccccccccaaccccccaaaaacccaaaccaccccaaaaaaaaaaaaaacccccccccccccaaaaaacccccaacaaccccaaaaacccaaccccacccaaaaaaaaaccaaccaaajjjrrrrrrrrssuuuuuvqqmmmdddaaaccccc\n" +
            "abccccccccaaccccccccccccccaaaaaacccccccccccccaaaaaaaaaaaccccccccccccccaaaaaacccccccccccccaaaaaaccccccccccccaaaaaaaaaacccccccccjjjrrruuuuuuuuuuuvvqqmmmmddddaccccc\n" +
            "abaacccccaaaaccccccccccccaaaaaaacccccccccccccaacccccaaaaacccccccccccccaccaaacccccccccccccaaaaaacccccccccccaaaaaaaaccccccccccccjjjrrruuuuuuuuxyyvvqqqmmmddddcccccc\n" +
            "abaacccccaaaacccccccccccaaaaaaccccccccaaccccccccacccaaaaacccccccccccccccccccccccccccccccccaaaaacccccccccccaaaaaaacccccccccccccjjjrrttuxxxxuxxyyvvqqqqmmmmddddcccc\n" +
            "abaacccccaaaacccccccccccaacaaacccccaaaaacccaaaaaaaccccccccccccccccccccccccccccccccccccccccaaacccccccccccccccaaaaaaccccccccccccjjjrrtttxxxxxxyyyvvqqqqqmmmmdddcccc\n" +
            "abacccccccccccccccccccccccccaaccccccaaaaaccaaaaaaaccccccccaaccccccccccccccccccccccccccccccccccccccccccccccccaaaaaaccccccccccccjjjqrrttxxxxxxyyyvvvvqqqqmmmdddcccc\n" +
            "abccccccccccccccccccccccccccccccccccaaaaaccaaaaaaacccccccaaaccccccccccaaaccccccccccccccccccaaaccccccccccccccaaccccccccccaaccccjjjqqqtttxxxxxyyyyyvvvqqqqmmmeeeccc\n" +
            "SbaaccccccaccaaacccccccccccccccccccaaaaacccaaaaaaaaccccaaaaaaaacccccccaaacaaccccccccccccccaaaaaaccccccccccccccccccccccaaaaaaccciiiqqqttxxxxEzyyyyyvvvqqqnnneeeccc\n" +
            "abaaccccccaaaaaaccccccccccccccccccccccaaccaaaaaaaaaacccaaaaaaaacccccaaaaaaaaccccccccccccccaaaaaaccccccccccccccccccccccaaaaaaccciiiqqtttxxxyyyyyyyvvvvqqqnnneeeccc\n" +
            "abaaaaacccaaaaaaccccccccccccccccccccccccccaaaaaaaaaaccccaaaaaaccccccaaaaaaaaccccccccccccccaaaaaacccccccccccccccccccccccaaaaacciiiqqqttxxyyyyyyywvvvvrrrqnnneeeccc\n" +
            "abaaaaacccaaaaaaaccccccccaaaccccccccccccccaacaaaccccccccaaaaaaccccccaaaaaaaccccccccccccccccaaaaaccccccccccccccccccccccaaaaaccciiiqqtttxxxyyyyywwwvrrrrrnnneeecccc\n" +
            "abaaaccccaaaaaaaaccccccccaaaacccccccccccccccccaaccccccccaaaaaaccccccccaaaaaccccccccccccccccaacaaccccccccccccccccccccccaaaaaccciiqqqttxxxwwwwyyywwrrrrnnnnneeecccc\n" +
            "abaaaccccaaaaaaaaccccccccaaaacccccaaaaacccccccaaccccccccaaccaacccccccaaacaaacccccccccccccccccccccccccccccccccccccccccccccccccciiqqqtttwwwwwwywwwrrrrnnnnneeeccccc\n" +
            "abcaaaccccccaaaccccccccccaaaccccccaaaaacccccccccccccaaaaccccccccccccccaacccccccccccccccccccccccccccccccaaaacccccccccccccccccciiiqqqtttssssswwwwwrrrnnnneeeecccccc\n" +
            "abccaaccccccaaaccccccccccccccccccaaaaaacccccccccccccaaaaccccccccccccccccccccccccccccccccccccccccccccccaaaaacccccccccccccccccciiiqqqqtssssssswwwwrronnnfeeeacccccc\n" +
            "abcccccccccccccccccccccccccccccccaaaaaacccccccccccccaaaaccccccccccccccccccccccccccccccccccccccccccccccaaaaaaccccccccccccccccciiiiqqppssssssswwwwrroonfffeaacccccc\n" +
            "abcccccccccccccccccccccccccccccccaaaaaacaaaccccccccccaacccccccccccccccccccccccccccccccccaaacccccccccccaaaaaaccccccccccccccccccihhpppppppppsssssrrroonfffaaaaacccc\n" +
            "abcccccccccccccccccccccccccccccccccaacccaaaaacccccccccccccccccccccccccccccccccccccccccccaaaaaaccccccccaaaaaccccccccccccccccccchhhhppppppppppssssrooofffaaaaaacccc\n" +
            "abccccccccaaaccccccccccccccccccccccccccaaaaacccccccccccccccccccccccccccccccccccccaccccaaaaaaaaccccccccccaaacccccccccccccccccccchhhhhhhhhpppposssoooofffaaaaaccccc\n" +
            "abccccccccaaaacccccaaccccccccccccccccccaaaaaccccccccccccccccccccccccaaccccccccccaaccccaaaaaaaacccccccccccccccccccccccccccccccccchhhhhhhhhgppooooooofffaaaaacccccc\n" +
            "abaaccccccaaaacccccaacaaccccccccccccccccaaaaacccccccccccccccaacaaccaaaaaaccccaaaaacaacaaaaaaacccccccccccccccccccccccccccccccccccccchhhhhhgggooooooffffaaaaaaccccc\n" +
            "abaaacccccaaaacccccaaaaaccccccccccccccccaaccccccccccccccccccaaaaaccaaaaaaccccaaaaaaaacccaaaaaccccccccccccccccccccccccaaacaacccccccccccccgggggooooffffccccaacccccc\n" +
            "abaaaccccccccccccaaaaaaccccaaccccccccccccccccccaaacccccccccccaaaaaaaaaaaacaacccaaaaaccccaacaaacccccccccccccccccccccccaaaaaaccccccccccccccaggggggggfffcccccccccccc\n" +
            "abaaaccccccccccccaaaaaaaacaaaaccccccccaaaccccccaaaacccccccccaaaaaaaaaaaaaaaaccaaaaacccccaaaaaccccccccccccccaaccccccccaaaaaaccccccccccccccaagggggggfccccccccccccca\n" +
            "abaacccccccccccccaccaaaaacaaaaccccccccaaaccccccaaaacccccccccaaaaccaaaaaaaaaaccaacaaaccccccaaaccccccccccccaaaaaacccccaaaaaaacccccccccccccaaaaccggggcccccccccccccaa\n" +
            "abaacccccccccccccccaaacaccaaaacccccaaaaaaaaccccaaaccccccccccccaaccaaaaaaaacccccccaacccccaacaaaaacccccccccaaaaaacccccaaaaaaaaccccccccccccaaaccccccccccccccccaaacaa\n" +
            "abcccccccccccccccccaaccccccccccccccaaaaaaaaccccccccccccccccccccaaaaaaaaaaaccccccccccccccaaaaaaaacccccccccaaaaaacccccaaaaaaaaccccccccccccacaccccccccccccccccaaaaaa\n" +
            "abccccccccccccccccccccccccccccccccccaaaaaacccccccccccccccccccccaaaaaaaaaaaaccccccccccccccaaaaaaccccccccccaaaaaccccccccaaacccccccccccccccccccccccccccccccccccaaaaa";

    static Set<AdventOfCodeUtil.Coordinate> hasSeen = new HashSet<>();

    public static void main(String... args) {
        int total = 0;

        Set<AdventOfCodeUtil.Coordinate> coordinates = new HashSet<>();

        for (int i = 0; i < input.split("\n").length; i++) {
            String ii = input.split("\n")[i];
            for (int j = 0; j < ii.split("").length; j++) {
                AdventOfCodeUtil.Coordinate coordinate = new AdventOfCodeUtil.Coordinate(j, i);


                coordinate.number = ii.split("")[j];

                if (coordinate.number.equals("S")) {
                    coordinate.number = "a";
                    coordinate.tentdist = 0;
                    System.out.println(coordinate.x + ", " + coordinate.y);
                }

                if (coordinate.number.equals("E")) {
                    coordinate.number = "z";
                    System.out.println(coordinate.x + ", " + coordinate.y);
                }

                coordinate.numberint = 1;
                coordinates.add(coordinate);
            }
        }

        List<Integer> tentdists = new ArrayList<>();
        Set<AdventOfCodeUtil.Coordinate> coordinates1 = coordinates.stream().filter(coordinate -> coordinate.number.equals("a")).collect(Collectors.toSet());
        List<AdventOfCodeUtil.Coordinate> coordinateListFiltered = new ArrayList<>();
        for (AdventOfCodeUtil.Coordinate coordinate: coordinates1) {
            List<AdventOfCodeUtil.Coordinate> coordinateList = AdventOfCodeUtil.getAdjacentNoVert(coordinate, coordinates);
            if (coordinateList.stream().anyMatch(coordinate1 -> coordinate1.number.equals("b"))) {
                coordinateListFiltered.add(coordinate);
            }
        }

        for (AdventOfCodeUtil.Coordinate coordinate54 : coordinateListFiltered) {
            try {
                hasSeen = new HashSet<>();
                for (AdventOfCodeUtil.Coordinate coordinate : coordinates) {
                    coordinate.tentdist = null;
                }
                coordinate54.tentdist = 0;
                while (AdventOfCodeUtil.getCoordinate(139, 20, coordinates).visited == false && hasSeen.size() < 6601) {

                    AdventOfCodeUtil.Coordinate startCoordinate = findSmallest(coordinates);

                    for (AdventOfCodeUtil.Coordinate coordinate : AdventOfCodeUtil.getAdjacentNoVertNoStrHigher(startCoordinate, coordinates)) {
                        if (hasSeen.contains(coordinate)) {
                            continue;
                        }

                        if (coordinate.tentdist == null || coordinate.tentdist > coordinate.numberint + startCoordinate.tentdist) {
                            coordinate.tentdist = coordinate.numberint + startCoordinate.tentdist;
                        }
                    }

                    hasSeen.add(startCoordinate);
                }
                AdventOfCodeUtil.Coordinate coordinate = AdventOfCodeUtil.getCoordinate(139, 20, coordinates);
                tentdists.add(coordinate.tentdist);
                System.out.println(tentdists.size());
            } catch (Exception e) {
                AdventOfCodeUtil.Coordinate coordinate = AdventOfCodeUtil.getCoordinate(139, 20, coordinates);
                tentdists.add(coordinate.tentdist);
                System.out.println(tentdists.size());
            }
        }

        Collections.sort(tentdists);
        System.out.println(tentdists);
    }

    public static AdventOfCodeUtil.Coordinate findSmallest(Set<AdventOfCodeUtil.Coordinate> coordinates) {
        int tentdist = 9999999;
        AdventOfCodeUtil.Coordinate smallestCoordinate = null;
        for (AdventOfCodeUtil.Coordinate coordinate : coordinates) {
            if (coordinate.tentdist != null && coordinate.tentdist < tentdist && !hasSeen.contains(coordinate)) {
                tentdist = coordinate.tentdist;
                smallestCoordinate = coordinate;
            }
        }

        if (smallestCoordinate == null) {

        }
        return smallestCoordinate;
    }
}
