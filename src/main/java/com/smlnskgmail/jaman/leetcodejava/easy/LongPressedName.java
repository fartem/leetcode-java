package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/long-pressed-name/
public class LongPressedName {

    private final String name;
    private final String typed;

    public LongPressedName(String name, String typed) {
        this.name = name;
        this.typed = typed;
    }

    public boolean solution() {
        int namePointer = 0;
        int typedPointer = 0;
        int nameLength = name.length();
        int typedLength = typed.length();
        while (namePointer < nameLength && typedPointer < typedLength) {
            char n = name.charAt(namePointer);
            char t = typed.charAt(typedPointer);
            if (n == t) {
                namePointer++;
                typedPointer++;
            } else if (typedPointer >= 1 && t == typed.charAt(typedPointer - 1)) {
                typedPointer++;
            } else {
                return false;
            }
        }
        return true;
    }

}
