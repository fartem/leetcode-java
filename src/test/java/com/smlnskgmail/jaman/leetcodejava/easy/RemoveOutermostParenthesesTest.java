package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveOutermostParenthesesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "()()()",
                new RemoveOutermostParentheses(
                        "(()())(())"
                ).solution()
        );
    }

}
