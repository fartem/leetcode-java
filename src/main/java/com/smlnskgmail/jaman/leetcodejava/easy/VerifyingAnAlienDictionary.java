package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/verifying-an-alien-dictionary
public class VerifyingAnAlienDictionary {

    private final String[] words;
    private final String order;

    public VerifyingAnAlienDictionary(String[] words, String order) {
        this.words = words;
        this.order = order;
    }

    public boolean solution() {
        int[] dictionary = new int[128];
        dictionary['@'] = -1;
        for (int i = 0; i < order.length(); i++) {
            dictionary[order.charAt(i)] = i;
        }
        for (int i = 1; i < words.length; i++) {
            String f = words[i - 1];
            String s = words[i];
            int fL = f.length();
            int sL = s.length();
            int maxL = Math.max(fL, sL);
            for (int j = 0; j < maxL; j++) {
                char a = fL <= j ? '@' : f.charAt(j);
                char b = sL <= j ? '@' : s.charAt(j);
                if (dictionary[a] > dictionary[b]) {
                    return false;
                } else if (a != b) {
                    break;
                }
            }
        }
        return true;
    }
}
