package adventofcode_2022;


import utils.AdventOfCodeUtil;

import java.util.*;

public class AdventOfCode_2022_16 {

    static Map<Valve, List<Valve>> valves = new HashMap<>();

    static String input = "Valve AA has flow rate=0; tunnels lead to valves DD, II, BB\n" +
            "Valve BB has flow rate=13; tunnels lead to valves CC, AA\n" +
            "Valve CC has flow rate=2; tunnels lead to valves DD, BB\n" +
            "Valve DD has flow rate=20; tunnels lead to valves CC, AA, EE\n" +
            "Valve EE has flow rate=3; tunnels lead to valves FF, DD\n" +
            "Valve FF has flow rate=0; tunnels lead to valves EE, GG\n" +
            "Valve GG has flow rate=0; tunnels lead to valves FF, HH\n" +
            "Valve HH has flow rate=22; tunnel leads to valve GG\n" +
            "Valve II has flow rate=0; tunnels lead to valves AA, JJ\n" +
            "Valve JJ has flow rate=21; tunnel leads to valve II";

    public static void main(String... args) {
        int total = 0;

        List<Valve> valves1 = new ArrayList<>();


        for (int i = 0; i < input.split("\n").length; i++) {
            String ii = input.split("\n")[i];
            String valve = ii.split("Valve ")[1].split(" has")[0];
            int pressure = Integer.parseInt(ii.split("flow rate=")[1].split(";")[0]);
            Valve valvef = new Valve();
            valvef.name = valve;
            valvef.currentflow = pressure;
            valves1.add(valvef);
        }

        for (int i = 0; i < input.split("\n").length; i++) {
            String ii = input.split("\n")[i];
            String valve = ii.split("Valve ")[1].split(" has")[0];
            int pressure = Integer.parseInt(ii.split("flow rate=")[1].split(";")[0]);
            Valve valvef = new Valve();
            valvef.name = valve;
            valvef.currentflow = pressure;
            String valuess;
            try {
                valuess = ii.split("valves ")[1];
            } catch (Exception e) {
                valuess = ii.split("valve ")[1];
            }

            List<Valve> list = new ArrayList<>();
            for (String s: valuess.split(",")) {
                Valve valve1 = valves1.stream().filter(valve2 -> valve2.name.equals(s.trim())).findFirst().get();
                list.add(valve1);
            }

            valves.put(valvef, list);
        }

        Valve valve = new Valve();
        valve.name = "AA";
        valve.currentflow = 0;

        List<Valve> opened = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            calc(valve, 0, new ArrayList<>(), false, 0);
        }
        System.out.println(total);
    }

    static int calc(Valve valve, int sofar, List<Valve> seen, boolean movedtosame, int timestep) {
        List<Valve> valves2 = getValve(valve);
        for (Valve valve1: valves2) {
            if (!seen.stream().anyMatch(valve2 -> valve2.name.equals(valve1.name)) && movedtosame) {
                seen.add(valve1);
                calc(valve1, sofar + timestep * valve.currentflow, seen, false, timestep + 1);
            } else {
                if (valve.name.equals(valve1)) {
                    calc(valve1, sofar + timestep * valve.currentflow, seen, true, timestep + 1);
                } else {
                    calc(valve1, sofar + timestep * valve.currentflow, seen, false, timestep + 1);
                }
            }
        }
        return sofar;
    }



    static class Valve {
        String name;
        int currentflow;

        @Override
        public boolean equals(Object valve) {
            Valve valve1 = (Valve)valve;
            return valve1.name.equals(this.name);
        }
    }

    static class ValveResult {
        int total;
        List<String> newValves;
    }

    static List<Valve> getValve(Valve valve) {
        for (Map.Entry<Valve, List<Valve>> entry: valves.entrySet()) {
            if (valve.name.equals(entry.getKey().name)) {
                return entry.getValue();
            }
        }
        return null;
    }


}
