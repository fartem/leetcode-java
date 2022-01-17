package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/defuse-the-bomb
public class DefuseTheBomb {

    private final int[] code;
    private final int k;

    public DefuseTheBomb(int[] code, int k) {
        this.code = code;
        this.k = k;
    }

    public int[] solution() {
        int[] result = new int[code.length];
        if (k == 0) {
            return result;
        }
        int limit = k > 0 ? k : -k;
        int breakValue = k > 0 ? code.length : -1;
        int nextIndex = k > 0 ? 0 : code.length - 1;
        for (int i = 0; i < code.length; i++) {
            int count = 0;
            int j = k > 0 ? i + 1 : i - 1;
            int sum = 0;
            while (count != limit) {
                if (j == breakValue) {
                    j = nextIndex;
                }
                sum += code[k > 0 ? j++ : j--];
                count++;
            }
            result[i] = sum;
        }
        return result;
    }
}
