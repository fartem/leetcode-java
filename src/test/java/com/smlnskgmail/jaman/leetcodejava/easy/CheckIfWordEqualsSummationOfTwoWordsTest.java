package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckIfWordEqualsSummationOfTwoWordsTest {

    @Test
    public void defaultTest() {
        assertTrue(new CheckIfWordEqualsSummationOfTwoWords("acb", "cba", "cdb").solution());
    }
}
