package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestRepeatingCharacterReplacementTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new LongestRepeatingCharacterReplacement("ABAB", 2).solution()
        );
    }

}
