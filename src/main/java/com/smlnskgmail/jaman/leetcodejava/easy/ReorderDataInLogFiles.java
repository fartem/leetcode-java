package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/reorder-data-in-log-files
public class ReorderDataInLogFiles {

    private final String[] input;

    public ReorderDataInLogFiles(String[] input) {
        this.input = input;
    }

    public String[] solution() {
        Arrays.sort(
                input,
                (o1, o2) -> {
                    int o1Start = o1.indexOf(' ');
                    int o2Start = o2.indexOf(' ');
                    boolean o1IsLet = isLetter(o1, o1Start);
                    boolean o2IsLet = isLetter(o2, o2Start);
                    if (o1IsLet && o2IsLet) {
                        String o1Log = o1.substring(o1Start);
                        String o2Log = o2.substring(o2Start);
                        int result = o1Log.compareTo(o2Log);
                        if (result == 0) {
                            return o1.substring(0, o1Start).compareTo(o2.substring(0, o2Start));
                        }
                        return result;
                    } else if (!o1IsLet && !o2IsLet) {
                        return 0;
                    } else {
                        return o1IsLet ? -1 : 1;
                    }
                });
        return input;
    }

    private boolean isLetter(String s, int start) {
        for (int i = start; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
