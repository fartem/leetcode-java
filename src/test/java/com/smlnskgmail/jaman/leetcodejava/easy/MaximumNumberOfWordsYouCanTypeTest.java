package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumNumberOfWordsYouCanTypeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new MaximumNumberOfWordsYouCanType(
                        "hello world",
                        "ad"
                ).solution()
        );
    }

}
