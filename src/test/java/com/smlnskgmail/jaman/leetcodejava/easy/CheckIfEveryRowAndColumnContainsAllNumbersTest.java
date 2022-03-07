package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class CheckIfEveryRowAndColumnContainsAllNumbersTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckIfEveryRowAndColumnContainsAllNumbers(
                        new int[][]{{1, 2, 3}, {3, 1, 2}, {2, 3, 1}}
                ).solution()
        );
    }

}
