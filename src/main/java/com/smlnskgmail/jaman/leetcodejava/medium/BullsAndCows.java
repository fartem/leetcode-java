package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/bulls-and-cows/
public class BullsAndCows {

    private final String secret;
    private final String guess;

    public BullsAndCows(String secret, String guess) {
        this.secret = secret;
        this.guess = guess;
    }

    public String solution() {
        int bulls = 0;
        int cows = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            if (s != guess.charAt(i)) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            } else {
                bulls++;
            }
        }
        for (int i = 0; i < guess.length(); i++) {
            char g = guess.charAt(i);
            char s = secret.charAt(i);
            if (g != s) {
                if (map.getOrDefault(g, 0) != 0) {
                    cows++;
                    map.put(g, map.get(g) - 1);
                }
            }
        }
        return bulls + "A" + cows + "B";
    }

}
