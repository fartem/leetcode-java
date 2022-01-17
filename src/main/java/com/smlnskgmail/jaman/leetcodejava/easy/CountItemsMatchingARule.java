package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.List;

// https://leetcode.com/problems/count-items-matching-a-rule
public class CountItemsMatchingARule {

    private final List<List<String>> items;
    private final String ruleKey;
    private final String ruleValue;

    public CountItemsMatchingARule(List<List<String>> items, String ruleKey, String ruleValue) {
        this.items = items;
        this.ruleKey = ruleKey;
        this.ruleValue = ruleValue;
    }

    public int solution() {
        int matches = 0;
        int index = 0;
        switch (ruleKey) {
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
        }
        for (List<String> item : items) {
            if (ruleValue.equals(item.get(index))) {
                matches++;
            }
        }
        return matches;
    }
}
