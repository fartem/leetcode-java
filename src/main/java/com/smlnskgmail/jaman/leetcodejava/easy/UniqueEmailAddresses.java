package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/unique-email-addresses/
public class UniqueEmailAddresses {

    private final String[] input;

    public UniqueEmailAddresses(String[] input) {
        this.input = input;
    }

    public int solution() {
        Set<String> uniq = new HashSet<>();
        for (String email : input) {
            StringBuilder parsed = new StringBuilder();
            boolean ignore = false;
            boolean domain = false;
            for (int i = 0; i < email.length(); i++) {
                char c = email.charAt(i);
                if (c != '.' || domain) {
                    if (c == '+') {
                        ignore = true;
                    } else if (c == '@') {
                        ignore = false;
                        domain = true;
                    }
                    if (!ignore) {
                        parsed.append(c);
                    }
                }
            }
            uniq.add(parsed.toString());
        }
        return uniq.size();
    }

}
