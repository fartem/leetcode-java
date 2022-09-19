package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/find-duplicate-file-in-system/
class FindDuplicateFileInSystem {

    private final String[] input;

    FindDuplicateFileInSystem(String[] input) {
        this.input = input;
    }

    public List<List<String>> solution() {
        Map<String, List<String>> map = new HashMap<>();
        for (String path : input) {
            String[] values = path.split(" ");
            for (int i = 1; i < values.length; i++) {
                String[] name = values[i].split("\\(");
                name[1] = name[1].replace(")", "");
                List<String> list = map.getOrDefault(name[1], new ArrayList<>());
                list.add(values[0] + "/" + name[0]);
                map.put(name[1], list);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key).size() > 1) {
                result.add(map.get(key));
            }
        }
        return result;
    }

}
