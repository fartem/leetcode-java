package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/slowest-key
public class SlowestKey {

    private final int[] releaseTimes;
    private final String keysPressed;

    public SlowestKey(int[] releaseTimes, String keysPressed) {
        this.releaseTimes = releaseTimes;
        this.keysPressed = keysPressed;
    }

    public char solution() {
        int slow = releaseTimes[0];
        Map<Integer, Character> keys = new HashMap<>();
        keys.put(slow, keysPressed.charAt(0));
        for (int i = 1; i < releaseTimes.length; i++) {
            char c = keysPressed.charAt(i);
            int time = releaseTimes[i] - releaseTimes[i - 1];
            if (time > slow) {
                slow = time;
            }
            if (time == slow) {
                char exists = keys.getOrDefault(time, '0');
                if (exists == '0' || exists < c) {
                    keys.put(time, c);
                }
            }
        }
        return keys.get(slow);
    }

}
