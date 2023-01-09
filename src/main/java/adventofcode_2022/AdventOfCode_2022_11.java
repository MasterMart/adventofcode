package adventofcode_2022;


import utils.AdventOfCodeUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AdventOfCode_2022_11 {

    static String input = "Monkey 0:\n" +
			"  Starting items: 59, 65, 86, 56, 74, 57, 56\n" +
			"  Operation: new = old * 17\n" +
			"  Test: divisible by 3\n" +
			"    If true: throw to monkey 3\n" +
			"    If false: throw to monkey 6\n" +
			"\n" +
			"Monkey 1:\n" +
			"  Starting items: 63, 83, 50, 63, 56\n" +
			"  Operation: new = old + 2\n" +
			"  Test: divisible by 13\n" +
			"    If true: throw to monkey 3\n" +
			"    If false: throw to monkey 0\n" +
			"\n" +
			"Monkey 2:\n" +
			"  Starting items: 93, 79, 74, 55\n" +
			"  Operation: new = old + 1\n" +
			"  Test: divisible by 2\n" +
			"    If true: throw to monkey 0\n" +
			"    If false: throw to monkey 1\n" +
			"\n" +
			"Monkey 3:\n" +
			"  Starting items: 86, 61, 67, 88, 94, 69, 56, 91\n" +
			"  Operation: new = old + 7\n" +
			"  Test: divisible by 11\n" +
			"    If true: throw to monkey 6\n" +
			"    If false: throw to monkey 7\n" +
			"\n" +
			"Monkey 4:\n" +
			"  Starting items: 76, 50, 51\n" +
			"  Operation: new = old * old\n" +
			"  Test: divisible by 19\n" +
			"    If true: throw to monkey 2\n" +
			"    If false: throw to monkey 5\n" +
			"\n" +
			"Monkey 5:\n" +
			"  Starting items: 77, 76\n" +
			"  Operation: new = old + 8\n" +
			"  Test: divisible by 17\n" +
			"    If true: throw to monkey 2\n" +
			"    If false: throw to monkey 1\n" +
			"\n" +
			"Monkey 6:\n" +
			"  Starting items: 74\n" +
			"  Operation: new = old * 2\n" +
			"  Test: divisible by 5\n" +
			"    If true: throw to monkey 4\n" +
			"    If false: throw to monkey 7\n" +
			"\n" +
			"Monkey 7:\n" +
			"  Starting items: 86, 85, 52, 86, 91, 95\n" +
			"  Operation: new = old + 6\n" +
			"  Test: divisible by 7\n" +
			"    If true: throw to monkey 4\n" +
			"    If false: throw to monkey 5";

	static int totalz = 7 * 5 * 17 * 19 * 11 * 2 * 13 * 3;

    public static void main(String... args) {
        int total = 0;

        List<Monkey> monkeys = new ArrayList<>();

        for (int i = 0; i < input.split("\n\n").length; i++) {
            Monkey monkey = new Monkey();
            String ii = input.split("\n\n")[i];

            Integer number = AdventOfCodeUtil.getFirstNumberOfString(ii.split("Monkey ")[1]);
            monkey.number = number;

            String startingitems = ii.split("  Starting items: ")[1].split("\n")[0];
            for (String item : startingitems.split(", ")) {
                monkey.items.add(Long.parseLong(item));
            }
            String operation = ii.split("  Operation: ")[1].split("\n")[0];
            monkey.operation = operation;

            String test = ii.split("  Test: ")[1].split("\n")[0];
            monkey.test = test;

            Integer truer = AdventOfCodeUtil.getFirstNumberOfString(ii.split("    If true: throw to monkey ")[1]);
            monkey.iftrue = truer;

            Integer falser = AdventOfCodeUtil.getFirstNumberOfString(ii.split("    If false: throw to monkey ")[1]);
            monkey.iffalse = falser;

            monkeys.add(monkey);
        }

        for (int j = 1; j <= 10000; j++) {
            for (Monkey monkey : monkeys) {
                for (Long item : monkey.items) {
					if (monkey.operation.contains("+")) {
                        int number = AdventOfCodeUtil.getFirstNumberOfString(monkey.operation);
                        item = item + number;

                    } else if (monkey.operation.contains("* old")) {
						item = item * item;
                    } else {
						int number = AdventOfCodeUtil.getFirstNumberOfString(monkey.operation);
						item = item * number;
                    }
                    monkey.itemsinsp++;
                    int divis = AdventOfCodeUtil.getFirstNumberOfString(monkey.test.split("divisible by ")[1]);
                    if (item % divis == 0) {
                        getByNumber(monkeys, monkey.iftrue).items.add(item % totalz);
                    } else {
                        getByNumber(monkeys, monkey.iffalse).items.add(item % totalz);
                    }
                }

                monkey.items = new ArrayList<>();
            }
        }

		List<Integer> numbers = monkeys.stream().map(monkey -> monkey.itemsinsp).collect(Collectors.toList());
		Collections.sort(numbers);
        System.out.println(total);

    }

    static Monkey getByNumber(List<Monkey> monkeys, int number) {
        return monkeys.stream().filter(monkey -> monkey.number == number).findFirst().get();
    }

    private static class Monkey {

        public int number;
        public List<Long> items = new ArrayList<>();
        public String operation;
        public String test;
        public int iftrue;
        public int iffalse;

        public int itemsinsp;
    }
}
