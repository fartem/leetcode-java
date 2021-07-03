package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubstringsOfSizeThreeWithDistinctCharactersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new SubstringsOfSizeThreeWithDistinctCharacters(
                        "xyzzaz"
                ).solution()
        );
    }

}
