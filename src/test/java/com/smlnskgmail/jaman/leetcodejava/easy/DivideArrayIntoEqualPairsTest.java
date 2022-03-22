package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DivideArrayIntoEqualPairsTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new DivideArrayIntoEqualPairs(
                        new int[]{3, 2, 3, 2, 2, 2}
                ).solution()
        );
    }

}
