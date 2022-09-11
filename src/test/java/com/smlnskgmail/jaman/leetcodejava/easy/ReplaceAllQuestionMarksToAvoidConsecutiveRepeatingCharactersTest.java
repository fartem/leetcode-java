package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceAllQuestionMarksToAvoidConsecutiveRepeatingCharactersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "azs",
                new ReplaceAllQuestionMarksToAvoidConsecutiveRepeatingCharacters(
                        "?zs"
                ).solution()
        );
    }

}
