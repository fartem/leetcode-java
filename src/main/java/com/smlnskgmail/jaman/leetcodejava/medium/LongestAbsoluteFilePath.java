package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/longest-absolute-file-path/
public class LongestAbsoluteFilePath {

    private final String input;

    public LongestAbsoluteFilePath(String input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        int[] fileLengths = new int[input.length()];
        for (String name : input.split("\n")) {
            int dirLevel = dirLevel(name);
            String cName = name.substring(dirLevel);
            int part = dirLevel > 0
                    ? fileLengths[dirLevel - 1] + 1
                    : 0;
            fileLengths[dirLevel] = part + cName.length();
            if (cName.contains(".")) {
                result = Math.max(result, fileLengths[dirLevel]);
            }
        }
        return result;
    }

    private int dirLevel(String dirName) {
        int level = 0;
        int i = 0;
        while (dirName.charAt(i++) == '\t') {
            level++;
        }
        return level;
    }

}