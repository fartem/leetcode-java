package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidateStackSequencesTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new ValidateStackSequences(
                        new int[]{1, 2, 3, 4, 5},
                        new int[]{4, 5, 3, 2, 1}
                ).solution()
        );
    }

}
