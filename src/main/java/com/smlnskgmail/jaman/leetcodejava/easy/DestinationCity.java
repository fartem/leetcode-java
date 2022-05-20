package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/destination-city/
public class DestinationCity {

    private final List<List<String>> input;

    public DestinationCity(List<List<String>> input) {
        this.input = input;
    }

    public String solution() {
        Set<String> cities = new HashSet<>();
        for (List<String> path : input) {
            cities.add(path.get(0));
            cities.add(path.get(1));
        }
        for (List<String> path : input) {
            cities.remove(path.get(0));
        }
        return cities.iterator().next();
    }

}
