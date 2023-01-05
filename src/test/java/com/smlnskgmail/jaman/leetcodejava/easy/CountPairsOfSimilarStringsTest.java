package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountPairsOfSimilarStringsTest {

    @Test
    public void defaultTests() {
        assertEquals(
                2,
                new CountPairsOfSimilarStrings(
                        new String[]{"aba", "aabb", "abcd", "bac", "aabc"}
                ).solution()
        );
        assertEquals(
                3,
                new CountPairsOfSimilarStrings(
                        new String[]{"aabb", "ab", "ba"}
                ).solution()
        );
        assertEquals(
                0,
                new CountPairsOfSimilarStrings(
                        new String[]{"nba", "cba", "dba"}
                ).solution()
        );
    }

}
