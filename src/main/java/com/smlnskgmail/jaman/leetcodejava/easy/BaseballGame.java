package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Stack;

public class BaseballGame {

    private final String[] input;

    public BaseballGame(String[] input) {
        this.input = input;
    }

    public int solution() {
        Stack<Integer> stack = new Stack<>();
        for (String op : input) {
            switch (op) {
                case "+":
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b);
                    stack.push(a);
                    stack.push(a + b);
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.valueOf(op));
                    break;
            }
        }
        int result = 0;
        for (int value : stack) {
            result += value;
        }
        return result;
    }

}
