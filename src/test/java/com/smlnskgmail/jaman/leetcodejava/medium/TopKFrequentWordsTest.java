package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class TopKFrequentWordsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList("i", "love"),
                new TopKFrequentWords(
                                new String[] {"i", "love", "leetcode", "i", "love", "coding"}, 2)
                        .solution());
    }
}
