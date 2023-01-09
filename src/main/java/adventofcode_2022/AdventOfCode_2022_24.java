package adventofcode_2022;


import utils.AdventOfCodeUtil;

import java.util.*;

public class AdventOfCode_2022_24 {

    static String input = "#.########################################################################################################################\n" +
            "#<<<^<^^>v<<^<^><><v<^<<.v^><<<v>><^v<vv>v<vv>^>>^^^^.>>^vv<^<<>^.vv.<>>v>v^>^<><.vv^v.^<^v>^vv<^vv<<>v<<>><<<v^^>v><<<^>#\n" +
            "#>^^v><.<>>v.v.^>v^..>^<vv>v^><v^<<>v>>.^v^vv^^>.^><^>>^>vv>>v^>vvvv^v^vv<<^<^>^>^v<v^>><><v^^^<v.^v<>^.>v><vv.^<^^^^<>>>#\n" +
            "#<<.><>v<>.v^<^^v<^^>.^.>>v.^^^v>^^^.<><.^.<>>^<>.v><^^^>^>^^^^><vv^.v^<<^v>v^^^<<<^<..^vv><.^v<vv^>>vv>v.><v^>>^<v^>>vv>#\n" +
            "#.><^v.>^v>>vv><^>.>>>>>^.>>.>^v>v^>v^^>v^^..>^.^<^.v<>v<<<^^^.vvv>>.<>^vvv>>.^<^v^>^<^<vv>^>^.<>^<<>v.<<<.^<>^>.<v.vvv^>#\n" +
            "#>><v<>.v><<^^vvv<<<^>^v^v><^>^<>>v.<.<>^<>vv>vv>^.v><<<^<v^vvv.<<<><^<^<^.^^vv>^v^^v<>>vv^<^.^v^v<v^>^.>.v>v^^<v<^<>^>v>#\n" +
            "#>>><v<.>>v^<.^vvvv<v<^<<v>>v>vv.^><v^.>>vv><<.<^.^v>^^><>^<^v<vvvvv<<<<^^>..>>>v^^>.vv<>.^^^.<v>v^>>^>^^>v^v^^<.>>^^<.<>#\n" +
            "#<<v>>v<>^><^v<>^>vvv..v.^.<^.v.vv^.<.v<>v>^<^v^<^>><.<>v^v>^<<^<v^^<v^<v^.<v><<<>^^<><>.v><^^^<<^<v>><vv<^<^.^<<^.^<<v>>#\n" +
            "#>>>^^>v^>^>>v><<>^<v><>>^>.<v<<>v<>^<>^v.<<^.^^^^>^.v>v><v^>vv^^^.>v^<v^^v<<^.vv^>vvv>^>>v<.^^vv<<v.v..^v.^vvv.<.>^<^v>>#\n" +
            "#><^vv^>>v.<^<v^^><v^>^><<<v^>v><v^^>><vv^><.>>^vv>><vv<^v^v^>^>>.vvvvvv<>>>.>^<vv^<vv<<<^^v^>.v><^.<<^<>^^>.^v><^^vv.^>>#\n" +
            "#>..<<v<<>>.<^v<<.>v^<..^<^^v^>.><.<v>>v><<>^>>v<vvv>>v<v>.vvvv<.<<<^<^v>^<v^>>v.^v^<^v..^..<^<><>^<<>^>^<<^^.>^^<v<>v<><#\n" +
            "#<v^v>v<^^<v>>vv^v<..^>v>>>.>^^<>>>^..>>>^<<^<^<>^<v>>^>>><^v^v^<.^<<<^v^.^^^<v>>><^^<>>><..vv.^.^<<v^v.>>^v^^><>><.v^>v>#\n" +
            "#.<^^<v>v.<v<^.^v^<.v^vvv^vv^<..v<.>>>v<<>>vv>>^.>^.v>vv>.v^<<v^>>v.<^^<^<<>^^.^^>^>>^<^<<^^vv^^.<.><^.>^^<>v<.^v<>v><v<.#\n" +
            "#>^.v^^><^<.>^v>v><>>>..>.v>vvv<<vv^.>v>.>v.<^vv.^>^vvv>.>v^v>>.>^^<<>>.^.>>>^>v<>v>v^^<>^<^.^><.vv^^<<.^v>>.>>>.^>^^^^^<#\n" +
            "#..^>vv><^^.>>^^.<<<v..<<>^.<.<^^.v<<<^<<>><>v>v<^^^.<><^<<>v^^<^v^>^v>v<<^<<v<><<>.><..<^vv^<.><>^^><<.>>^.^v><>v^<^v>^>#\n" +
            "#><<>v>.>^<<v>>>>>^>v..<vv<^<v>>^<<^v<v<<<<.v^>v.v<^>>>v.^><^><>.<>.^v><><<v>^^^^.<<.>^>><>.<<.<^<.^>..^>^.^>^v^v.<.^v>><#\n" +
            "#><><^v.<<<<>>v<<<<^v<<^^<><<.>^^.^.^.<>vv<<<v>^<><^^<^>^>^^.v<^>>vv^v.>^.<<><vv>>.>.<><^<.<<>.v>.^>>>^<<>.<v>^^v^v^<>.<<#\n" +
            "#<^>^v^>v^v.<^^>.^>^<<>.<.<<vvv>v>v^v^vvv>v^v^v<^^^<^>>v.^v.^>v><.^^^<>^>^^vv.v>>>^v<<>>^<^.v^>>>><v>v><^<.^v^v^^.<<>><^<#\n" +
            "#>^>v.><v<^<><>><v<^^<^><<<<^v>^<v^>v<<>^>>.><v<v<^^>^<><><^<.<.<><v^^.^>>v^v^.>><vvvv^v^vv><<^<<^>.v>>>vv>v^v^^<v^^>^>><#\n" +
            "#<<v^^>vv^^v.<<v<v<^><^v.>.<^v^>^^>^<^^v>>v<^^vv<>^v^.^v<>.<^^>^^v><>^^v.><.v^^>.<<.v^<v<^<>^<^><v^>.>^v>v<v<.>v<.<v.>.<<#\n" +
            "#>^<<v^vv..vv^v><>>>^>v.>v^..^>^vv>^^>v^v<>.><v<<<<^><>v^.v^>.>^vv>vv>.>^<<.v<^^v^<<>^^^>^.<.v>^><.<^<^>>><.<<^^^>^<^<v<>#\n" +
            "#<^><v<v><<<>v>>vv.>^<v>><>v>^.v^<v><<^<>>^<^^.<v<<vv>^v.v.<vv<^<<^>v>v.<<<v^><^^>.>>v>.<^vv.^v>^^^<><<^<>>><v^v>>>v<^>v>#\n" +
            "#>>>^.v><<<>^v<.<.^><v>><>.<.<>v^v>>>^<^^vvv.vv<v<^^^>><^v>>>v>v<>v<v<vv^.^>v<>^>>>^<<v<vv^>><.v<^v<v^<.<>v>^>^><.>v<>.><#\n" +
            "#<^<v>v.vv>vv^v<.>>.v.^..>^v<.v><>^<.^^<v><^.v^<v^vv^^v^<>>^<^><v.vvv^>.^v>><<>><<<>.<v^<^.<vv^.v<><v^v^>^v^>v<<v^>vv>^v>#\n" +
            "#<><.v.^v>>><^.<.^<<v>^^><<^>>.^^.v>vv^^.v>^<<^^<<<^>>^>^>v..^v><>v<vv<<v^v<>>><v>^v<><.>v>v>v^^.^>>vv^v.vv<>v^<><^^><vv<#\n" +
            "#<<v<v>^><^v^<^<v>><.v<.>^vv^>^<v^v>v<.vvv<v<^^>^^^^v^<<v^>v<v^vv>.^vv>v^.>>.^<.>>v<..^v.>^<<v<vvv^<..^<<>^^>v<<><^^><>>>#\n" +
            "########################################################################################################################.#";

    public static void main(String... args) {


        int total = 0;

        List<AdventOfCodeUtil.Coordinate> coordinates = new ArrayList<>();

        for (int i = 0; i < input.split("\n").length; i++) {
            String ii = input.split("\n")[i];
            for (int j = 0; j < ii.split("").length; j++) {
                AdventOfCodeUtil.Coordinate coordinate = new AdventOfCodeUtil.Coordinate(j, i);
                String str = ii.split("")[j];
                if (str.equals("<") || str.equals(">") || str.equals("v") || str.equals("#") || str.equals("^")) {
                    coordinate.number = ii.split("")[j];
                    coordinates.add(coordinate);
                }
            }
        }
        int maxy = input.split("\n").length;
        int maxx = input.split("\n")[0].split("").length;
        AdventOfCodeUtil.Coordinate finishedCoor = new AdventOfCodeUtil.Coordinate(maxx - 2, maxy - 1);
        List<AdventOfCodeUtil.Coordinate> newCoords = new ArrayList<>();
        Set<Path> paths = new HashSet<>();
        Path path = new Path();
        path.current = new AdventOfCodeUtil.Coordinate(1, 0);
        paths.add(path);
        List<Integer> finished = new ArrayList<>();

        for (int i = 0; i < 277 + 305; i++) {
            for (AdventOfCodeUtil.Coordinate coordinate : coordinates) {
                if (coordinate.number.equals("#")) {
                    newCoords.add(coordinate);
                }
                if (coordinate.number.equals("v")) {
                    AdventOfCodeUtil.Coordinate coordinate1 = new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y);
                    coordinate1.number = "v";
                    if (coordinate.y + 1 == maxy - 1) {
                        coordinate1.y = 1;
                        newCoords.add(coordinate1);
                    } else {
                        coordinate1.y = coordinate1.y + 1;
                        newCoords.add(coordinate1);
                    }
                }

                if (coordinate.number.equals("^")) {
                    AdventOfCodeUtil.Coordinate coordinate1 = new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y);
                    coordinate1.number = "^";
                    if (coordinate.y - 1 == 0) {
                        coordinate1.y = maxy - 2;
                        newCoords.add(coordinate1);
                    } else {
                        coordinate1.y = coordinate1.y - 1;
                        newCoords.add(coordinate1);
                    }
                }

                if (coordinate.number.equals("<")) {
                    AdventOfCodeUtil.Coordinate coordinate1 = new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y);
                    coordinate1.number = "<";
                    if (coordinate.x - 1 == 0) {
                        coordinate1.x = maxx - 2;
                        newCoords.add(coordinate1);
                    } else {
                        coordinate1.x = coordinate1.x - 1;
                        newCoords.add(coordinate1);
                    }
                }
                if (coordinate.number.equals(">")) {
                    AdventOfCodeUtil.Coordinate coordinate1 = new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y);
                    coordinate1.number = ">";
                    if (coordinate.x + 1 == maxx - 1) {
                        coordinate1.x = 1;
                        newCoords.add(coordinate1);
                    } else {
                        coordinate1.x = coordinate1.x + 1;
                        newCoords.add(coordinate1);
                    }
                }
            }
            coordinates = newCoords;
            newCoords = new ArrayList<>();
        }

        while (finished.size() == 0 || paths.size() > 1) {
            for (AdventOfCodeUtil.Coordinate coordinate : coordinates) {
                if (coordinate.number.equals("#")) {
                    newCoords.add(coordinate);
                }
                if (coordinate.number.equals("v")) {
                    AdventOfCodeUtil.Coordinate coordinate1 = new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y);
                    coordinate1.number = "v";
                    if (coordinate.y + 1 == maxy - 1) {
                        coordinate1.y = 1;
                        newCoords.add(coordinate1);
                    } else {
                        coordinate1.y = coordinate1.y + 1;
                        newCoords.add(coordinate1);
                    }
                }

                if (coordinate.number.equals("^")) {
                    AdventOfCodeUtil.Coordinate coordinate1 = new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y);
                    coordinate1.number = "^";
                    if (coordinate.y - 1 == 0) {
                        coordinate1.y = maxy - 2;
                        newCoords.add(coordinate1);
                    } else {
                        coordinate1.y = coordinate1.y - 1;
                        newCoords.add(coordinate1);
                    }
                }

                if (coordinate.number.equals("<")) {
                    AdventOfCodeUtil.Coordinate coordinate1 = new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y);
                    coordinate1.number = "<";
                    if (coordinate.x - 1 == 0) {
                        coordinate1.x = maxx - 2;
                        newCoords.add(coordinate1);
                    } else {
                        coordinate1.x = coordinate1.x - 1;
                        newCoords.add(coordinate1);
                    }
                }
                if (coordinate.number.equals(">")) {
                    AdventOfCodeUtil.Coordinate coordinate1 = new AdventOfCodeUtil.Coordinate(coordinate.x, coordinate.y);
                    coordinate1.number = ">";
                    if (coordinate.x + 1 == maxx - 1) {
                        coordinate1.x = 1;
                        newCoords.add(coordinate1);
                    } else {
                        coordinate1.x = coordinate1.x + 1;
                        newCoords.add(coordinate1);
                    }
                }
            }
            coordinates = newCoords;
            newCoords = new ArrayList<>();
            Set<Path> newPaths = new HashSet<>();

            for (Path path1 : paths) {

                if (path1.length > 500) {
                    continue;
                }

                if (finished.size() > 0 && path1.length > Collections.min(finished)) {
                    continue;
                }
                List<AdventOfCodeUtil.Coordinate> empty = AdventOfCodeUtil.getAdjacentEmpty(path1.current, coordinates);
                for (AdventOfCodeUtil.Coordinate coordinate1 : empty) {
                    Path path2 = new Path();
                    path2.length = path1.length + 1;
                    path2.current = coordinate1;
                    path2.path = new ArrayList<>(path1.path);
                    path2.path.add(path1.current);
                    if (coordinate1.equals(finishedCoor)) {
                        finished.add(path2.length);
                    } else {
                        newPaths.add(path2);
                    }
                }
            }
            paths = newPaths;
        }
        System.out.println(Collections.min(finished));

    }

    static class Path {
        public List<AdventOfCodeUtil.Coordinate> path = new ArrayList<>();
        public AdventOfCodeUtil.Coordinate current;
        public int length = 0;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Path path1 = (Path) o;
            return current.equals(path1.current);
        }

        @Override
        public int hashCode() {
            return Objects.hash(current);
        }
    }
}
