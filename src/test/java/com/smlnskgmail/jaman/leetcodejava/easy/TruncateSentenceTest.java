package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TruncateSentenceTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "Hello how are you",
                new TruncateSentence("Hello how are you Contestant", 4).solution());
    }
}
