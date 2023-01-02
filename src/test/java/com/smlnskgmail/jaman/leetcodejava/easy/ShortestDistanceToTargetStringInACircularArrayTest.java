package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortestDistanceToTargetStringInACircularArrayTest {

    @Test
    public void defaultTests() {
        assertEquals(
                1,
                new ShortestDistanceToTargetStringInACircularArray(
                        new String[]{"hello", "i", "am", "leetcode", "hello"},
                        "hello",
                        1
                ).solution()
        );
        assertEquals(
                1,
                new ShortestDistanceToTargetStringInACircularArray(
                        new String[]{"a", "b", "leetcode"},
                        "leetcode",
                        0
                ).solution()
        );
        assertEquals(
                -1,
                new ShortestDistanceToTargetStringInACircularArray(
                        new String[]{"i", "eat", "leetcode"},
                        "ate",
                        0
                ).solution()
        );
    }

}
