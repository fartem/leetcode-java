package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/jewels-and-stones/
public class JewelsAndStones {

    private final String jewels;
    private final String stones;

    public JewelsAndStones(String jewels, String stones) {
        this.jewels = jewels;
        this.stones = stones;
    }

    public int solution() {
        int result = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                result++;
            }
        }
        return result;
    }

}
