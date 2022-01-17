package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubstringsOfSizeThreeWithDistinctCharactersTest {

    @Test
    public void defaultTest() {
        assertEquals(1, new SubstringsOfSizeThreeWithDistinctCharacters("xyzzaz").solution());
    }
}
