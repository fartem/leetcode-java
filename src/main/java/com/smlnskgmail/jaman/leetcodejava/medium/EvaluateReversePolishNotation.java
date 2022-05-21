package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

// https://leetcode.com/problems/evaluate-reverse-polish-notation/
public class EvaluateReversePolishNotation {

    private static final Set<String> OPS = new HashSet<>(
            Arrays.asList("+", "-", "*", "/")
    );

    private final String[] input;

    public EvaluateReversePolishNotation(String[] input) {
        this.input = input;
    }

    public int solution() {
        Stack<Integer> s = new Stack<>();
        for (String t : input) {
            if (!OPS.contains(t)) {
                s.push(Integer.parseInt(t));
            } else {
                int b = s.pop();
                int a = s.pop();
                switch (t) {
                    case "+":
                        s.push(a + b);
                        break;
                    case "-":
                        s.push(a - b);
                        break;
                    case "*":
                        s.push(a * b);
                        break;
                    default:
                        s.push(a / b);
                        break;
                }
            }
        }
        return s.pop();
    }

}
