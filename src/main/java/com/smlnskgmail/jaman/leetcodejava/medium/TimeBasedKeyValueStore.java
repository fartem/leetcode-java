package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/time-based-key-value-store/
public class TimeBasedKeyValueStore {

    private final Map<String, List<Pair<Integer, String>>> keys = new HashMap<>();

    public void set(String key, String value, int timestamp) {
        if (!keys.containsKey(key)) {
            keys.put(key, new ArrayList<>());
        }
        keys.get(key).add(new Pair<>(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!keys.containsKey(key) || timestamp < keys.get(key).get(0).getKey()) {
            return "";
        }
        int l = 0;
        int r = keys.get(key).size();
        while (l < r) {
            int m = (l + r) / 2;
            if (keys.get(key).get(m).getKey() <= timestamp) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return r == 0 ? "" : keys.get(key).get(r - 1).getValue();
    }

}
