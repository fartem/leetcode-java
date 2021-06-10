package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckIfWordEqualsSummationOfTwoWordsTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckIfWordEqualsSummationOfTwoWords(
                        "acb",
                        "cba",
                        "cdb"
                ).solution()
        );
    }

}
