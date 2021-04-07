package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TruncateSentenceTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "Hello how are you",
                new TruncateSentence(
                        "Hello how are you Contestant",
                        4
                ).solution()
        );
    }

}
