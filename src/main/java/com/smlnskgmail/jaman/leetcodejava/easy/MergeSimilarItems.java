package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/merge-similar-items/
public class MergeSimilarItems {

    private final int[][] items1;
    private final int[][] items2;

    public MergeSimilarItems(int[][] items1, int[][] items2) {
        this.items1 = items1;
        this.items2 = items2;
    }

    public List<List<Integer>> solution() {
        int[] map = new int[1000];
        for (int[] item : items1) {
            map[item[0] - 1] = item[1];
        }
        for (int[] item : items2) {
            map[item[0] - 1] = map[item[0] - 1] + item[1];
        }
        List<List<Integer>> result = new ArrayList<>(items1.length + items2.length);
        for (int i = 0; i < map.length; i++) {
            int curr = map[i];
            if (curr > 0) {
                result.add(List.of(i + 1, curr));
            }
        }
        return result;
    }

}
