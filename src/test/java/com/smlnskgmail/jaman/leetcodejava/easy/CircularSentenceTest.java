package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CircularSentenceTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CircularSentence(
                        "leetcode exercises sound delightful"
                ).solution()
        );
    }

}
