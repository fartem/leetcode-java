package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TopKFrequentWordsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList("i", "love"),
                new TopKFrequentWords(
                        new String[]{"i", "love", "leetcode", "i", "love", "coding"},
                        2
                ).solution()
        );
    }

}
