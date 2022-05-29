package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/rearrange-characters-to-make-target-string/
public class RearrangeCharactersToMakeTargetString {

    private final String s;
    private final String target;

    public RearrangeCharactersToMakeTargetString(String s, String target) {
        this.s = s;
        this.target = target;
    }

    public int solution() {
        int[] sCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 97]++;
        }
        int[] tCount = new int[26];
        for (int i = 0; i < target.length(); i++) {
            tCount[target.charAt(i) - 97]++;
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < tCount.length; i++) {
            if (tCount[i] != 0) {
                if (sCount[i] == 0) {
                    return 0;
                } else {
                    result = Math.min(result, sCount[i] / tCount[i]);
                }
            }
        }
        return result;
    }

}
