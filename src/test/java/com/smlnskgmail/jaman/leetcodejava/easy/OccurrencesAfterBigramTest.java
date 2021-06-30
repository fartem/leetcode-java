package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class OccurrencesAfterBigramTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new String[]{"girl", "student"},
                new OccurrencesAfterBigram(
                        "alice is a good girl she is a good student",
                        "a",
                        "good"
                ).solution()
        );
    }

}
