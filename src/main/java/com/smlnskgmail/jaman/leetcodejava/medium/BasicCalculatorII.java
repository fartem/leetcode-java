package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Stack;

// https://leetcode.com/problems/basic-calculator-ii
public class BasicCalculatorII {

    private final String input;

    public BasicCalculatorII(String s) {
        this.input = s;
    }

    public int solution() {
        Stack<Integer> stack = new Stack<>();
        int curr = 0;
        char op = '+';
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                curr = curr * 10 + c - '0';
            } else if (c != ' ') {
                stack.push(performOperation(stack, op, curr));
                curr = 0;
                op = c;
            }
        }
        stack.push(performOperation(stack, op, curr));
        int result = 0;
        for (int num : stack) {
            result += num;
        }
        return result;
    }

    private int performOperation(Stack<Integer> stack, char op, int num) {
        switch (op) {
            case '+':
                return num;
            case '-':
                return -num;
            case '*':
                return stack.pop() * num;
            case '/':
                return stack.pop() / num;
        }
        return -1;
    }
}
