package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Stack;

// https://leetcode.com/problems/crawler-log-folder
public class CrawlerLogFolder {

    private final String[] input;

    public CrawlerLogFolder(String[] input) {
        this.input = input;
    }

    public int solution() {
        Stack<String> stack = new Stack<>();
        for (String log : input) {
            if (log.equals("../")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!log.equals("./")) {
                stack.push(log);
            }
        }
        return stack.size();
    }

}
