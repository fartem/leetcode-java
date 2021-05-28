package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IncreasingDecreasingStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "abccbaabccba",
                new IncreasingDecreasingString(
                        "aaaabbbbcccc"
                ).solution()
        );
    }

}
