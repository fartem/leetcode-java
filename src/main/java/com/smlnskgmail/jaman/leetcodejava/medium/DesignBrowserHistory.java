package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/design-browser-history
public class DesignBrowserHistory {

    private final List<String> history = new ArrayList<>();
    private int current = 0;

    public DesignBrowserHistory(String homepage) {
        history.add(homepage);
    }

    public void visit(String url) {
        if (current < history.size() - 1) {
            int length = history.size() - 1;
            for (int i = current; i < length; i++) {
                history.remove(history.size() - 1);
            }
        }
        history.add(url);
        current++;
    }

    public String back(int steps) {
        if (current < steps) {
            current = 0;
        } else {
            current = current - steps;
        }
        return history.get(current);
    }

    public String forward(int steps) {
        if (current + steps >= history.size()) {
            current = history.size() - 1;
        } else {
            current = current + steps;
        }
        return history.get(current);
    }
}
