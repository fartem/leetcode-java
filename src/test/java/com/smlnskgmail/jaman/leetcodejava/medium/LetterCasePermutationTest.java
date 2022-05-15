package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LetterCasePermutationTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2"),
                new LetterCasePermutation("a1b2").solution()
        );
    }

}
