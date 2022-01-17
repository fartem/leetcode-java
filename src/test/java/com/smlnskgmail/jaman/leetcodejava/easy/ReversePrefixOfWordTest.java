package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReversePrefixOfWordTest {

    @Test
    public void defaultTest() {
        assertEquals("dcbafd", new ReversePrefixOfWord("abcdfd", 'd').solution());
    }
}
