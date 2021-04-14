package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MostCommonWordTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "ball",
                new MostCommonWord(
                        "Bob hit a ball, the hit BALL flew far after it was hit.",
                        new String[]{"hit"}
                ).solution()
        );
    }

}
