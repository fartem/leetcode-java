package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RearrangeSpacesBetweenWordsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "this   is   a   sentence",
                new RearrangeSpacesBetweenWords("  this   is  a sentence ").solution());
    }
}
