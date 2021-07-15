package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceAllQuestionMarksAvoidConsecutiveRepeatingCharactersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "azs",
                new ReplaceAllQuestionMarksAvoidConsecutiveRepeatingCharacters(
                        "?zs"
                ).solution()
        );
    }

}
