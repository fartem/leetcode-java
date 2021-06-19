package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RearrangeSpacesBetweenWordsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "this   is   a   sentence",
                new RearrangeSpacesBetweenWords(
                        "  this   is  a sentence "
                ).solution()
        );
    }

}
