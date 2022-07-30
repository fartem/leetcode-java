package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumRemoveToMakeValidParenthesesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "lee(t(c)o)de",
                new MinimumRemoveToMakeValidParentheses(
                        "lee(t(c)o)de)"
                ).solution()
        );
    }

}
