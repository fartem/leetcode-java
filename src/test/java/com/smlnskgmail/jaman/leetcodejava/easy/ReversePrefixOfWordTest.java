package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversePrefixOfWordTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "dcbafd",
                new ReversePrefixOfWord("abcdfd", 'd').solution()
        );
    }

}
