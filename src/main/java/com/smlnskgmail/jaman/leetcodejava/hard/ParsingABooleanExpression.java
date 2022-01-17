package com.smlnskgmail.jaman.leetcodejava.hard;

// https://leetcode.com/problems/parsing-a-boolean-expression
public class ParsingABooleanExpression {

    private final String input;

    public ParsingABooleanExpression(String input) {
        this.input = input;
    }

    public boolean solution() {
        return calc(input, 0, input.length() - 1);
    }

    private boolean calc(String e, int l, int h) {
        if (l == h) {
            return e.charAt(l) == 't';
        }
        char op = e.charAt(l);
        int c = 0;
        int prev = l + 2;
        boolean result = op != '|';
        for (int i = l + 1; i <= h; i++) {
            char v = e.charAt(i);
            if (v == '(') {
                c++;
            } else if (v == ')') {
                c--;
            }
            if ((c == 1 && v == ',') || (c == 0 && v == ')')) {
                boolean next = calc(e, prev, i - 1);
                prev = i + 1;
                switch (op) {
                    case '|':
                        result |= next;
                        break;
                    case '&':
                        result &= next;
                        break;
                    default:
                        result = !next;
                }
            }
        }
        return result;
    }
}
