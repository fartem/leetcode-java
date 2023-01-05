package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array/
public class ShortestDistanceToTargetStringInACircularArray {

    private final String[] words;
    private final String target;
    private final int startIndex;

    public ShortestDistanceToTargetStringInACircularArray(
            String[] words,
            String target,
            int startIndex
    ) {
        this.words = words;
        this.target = target;
        this.startIndex = startIndex;
    }

    public int solution() {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                int l = Math.abs(i - startIndex);
                result = Math.min(result, l);
                result = Math.min(result, words.length - l);
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }

}
