package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountVowelSubstringsOfAStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new CountVowelSubstringsOfAString(
                        "aeiouu"
                ).solution()
        );
    }

}
