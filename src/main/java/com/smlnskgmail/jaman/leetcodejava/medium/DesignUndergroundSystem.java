package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// https://leetcode.com/problems/design-underground-system/
public class DesignUndergroundSystem {

    private final HashMap<String, List<Integer>> stations = new HashMap<>();
    private final HashMap<Integer, CheckIn> checkIns = new HashMap<>();

    public DesignUndergroundSystem() {

    }

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        var checkIn = checkIns.remove(id);
        stations.computeIfAbsent(checkIn.stationName + " -> " + stationName, (v) -> new ArrayList<>())
                .add(t - checkIn.time);
    }

    public double getAverageTime(String startStation, String endStation) {
        int totalTime = 0;
        List<Integer> times = stations.get(startStation + " -> " + endStation);
        for (int time : times) {
            totalTime += time;
        }
        return (double) totalTime / times.size();
    }

    private static class CheckIn {
        public final String stationName;
        public final int time;

        private CheckIn(String stationName, int time) {
            this.stationName = stationName;
            this.time = time;
        }
    }

}
