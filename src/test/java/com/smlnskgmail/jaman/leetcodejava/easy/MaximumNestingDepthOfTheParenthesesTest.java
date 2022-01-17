package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumNestingDepthOfTheParenthesesTest {

    @Test
    public void defaultTest() {
        assertEquals(3, new MaximumNestingDepthOfTheParentheses("(1+(2*3)+((8)/4))+1").solution());
    }
}
