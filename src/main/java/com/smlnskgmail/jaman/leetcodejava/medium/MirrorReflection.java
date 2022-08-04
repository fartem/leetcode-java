package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/mirror-reflection/
public class MirrorReflection {

    private int p;
    private int q;

    public MirrorReflection(int p, int q) {
        this.p = p;
        this.q = q;
    }

    public int solution() {
        while (p % 2 == 0 && q % 2 == 0) {
            p >>= 1;
            q >>= 1;
        }
        return 1 - p % 2 + q % 2;
    }

}
