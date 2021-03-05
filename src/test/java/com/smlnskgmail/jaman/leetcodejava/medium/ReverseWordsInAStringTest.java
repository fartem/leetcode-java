package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseWordsInAStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "blue is sky the",
                new ReverseWordsInAString(
                        "the sky is blue"
                ).solution()
        );
    }

}
