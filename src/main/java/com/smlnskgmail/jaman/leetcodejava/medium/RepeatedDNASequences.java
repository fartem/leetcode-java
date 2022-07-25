package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.*;

// https://leetcode.com/problems/repeated-dna-sequences/
public class RepeatedDNASequences {

    private final String input;

    public RepeatedDNASequences(String input) {
        this.input = input;
    }

    public List<String> solution() {
        if (input.length() <= 10) {
            return Collections.emptyList();
        }
        Set<String> seq = new HashSet<>();
        Set<String> rep = new HashSet<>();
        for (int i = 0; i <= input.length() - 10; i++) {
            String sub = input.substring(i, i + 10);
            if (!seq.contains(sub)) {
                seq.add(sub);
            } else {
                rep.add(sub);
            }
        }
        return new ArrayList<>(rep);
    }

}
