package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/minimum-index-sum-of-two-lists/
public class MinimumIndexSumOfTwoLists {

    private final String[] firstList;
    private final String[] secondList;

    public MinimumIndexSumOfTwoLists(String[] firstList, String[] secondList) {
        this.firstList = firstList;
        this.secondList = secondList;
    }

    public String[] solution() {
        Map<String, Integer> firstMap = new HashMap<>();
        for (int i = 0; i < firstList.length; i++) {
            firstMap.put(firstList[i], i);
        }
        int min = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < secondList.length; i++) {
            String restaurant = secondList[i];
            if (firstMap.containsKey(restaurant)) {
                int sum = i + firstMap.get(restaurant);
                if (sum <= min) {
                    if (sum != min) {
                        result.clear();
                    }
                    min = sum;
                    result.add(restaurant);
                }
            }
        }
        return result.toArray(new String[0]);
    }

}
