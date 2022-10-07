package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Stack;

// https://leetcode.com/problems/asteroid-collision/
public class AsteroidCollision {

    private final int[] input;

    public AsteroidCollision(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        Stack<Integer> stack = new Stack<>();
        for (int ast : input) {
            collision:
            {
                while (!stack.isEmpty() && ast < 0 && 0 < stack.peek()) {
                    int peek = stack.peek();
                    if (peek < -ast) {
                        stack.pop();
                        continue;
                    } else if (peek == -ast) {
                        stack.pop();
                    }
                    break collision;
                }
                stack.push(ast);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

}
