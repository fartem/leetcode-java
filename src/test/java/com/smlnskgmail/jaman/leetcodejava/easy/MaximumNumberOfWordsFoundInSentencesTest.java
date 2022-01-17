package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumNumberOfWordsFoundInSentencesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                6,
                new MaximumNumberOfWordsFoundInSentences(
                                new String[] {
                                    "alice and bob love leetcode",
                                    "i think so too",
                                    "this is great thanks very much"
                                })
                        .solution());
    }
}
