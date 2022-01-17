package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReplaceAllQuestionMarksAvoidConsecutiveRepeatingCharactersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "azs",
                new ReplaceAllQuestionMarksAvoidConsecutiveRepeatingCharacters("?zs").solution());
    }
}
