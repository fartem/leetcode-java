package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MaximumNestingDepthOfTwoValidParenthesesStringsTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{0, 1, 1, 1, 1, 0},
                new MaximumNestingDepthOfTwoValidParenthesesStrings("(()())").solution()
        );
    }

}
