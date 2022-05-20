package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/
public class DivideAStringIntoGroupsOfSizeK {

    private final String s;
    private final int k;
    private final char fill;

    public DivideAStringIntoGroupsOfSizeK(String s, int k, char fill) {
        this.s = s;
        this.k = k;
        this.fill = fill;
    }

    public String[] solution() {
        int length = s.length();
        int diff = length % k;
        String[] result = new String[length / k + (diff == 0 ? 0 : 1)];
        int p = 0;
        for (int i = 0; i < length - diff; i += k) {
            result[p++] = s.substring(i, i + k);
        }
        if (diff != 0) {
            String lastSub = s.substring(length - diff);
            result[result.length - 1] = lastSub + String.valueOf(fill).repeat(k - lastSub.length());
        }
        return result;
    }

}
