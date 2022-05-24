package com.smlnskgmail.jaman.leetcodejava.hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestValidParenthesesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new LongestValidParentheses("(()").solution()
        );
    }

}
