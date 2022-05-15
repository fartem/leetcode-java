package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LetterCombinationsOfAPhoneNumberTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
                new LetterCombinationsOfAPhoneNumber("23").solution()
        );
    }

}
