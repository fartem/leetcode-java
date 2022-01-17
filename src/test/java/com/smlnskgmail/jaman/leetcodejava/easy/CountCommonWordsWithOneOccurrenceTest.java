package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountCommonWordsWithOneOccurrenceTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new CountCommonWordsWithOneOccurrence(
                                new String[] {"leetcode", "is", "amazing", "as", "is"},
                                new String[] {"amazing", "leetcode", "is"})
                        .solution());
    }
}
