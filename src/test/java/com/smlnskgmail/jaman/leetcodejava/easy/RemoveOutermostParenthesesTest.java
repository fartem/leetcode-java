package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveOutermostParenthesesTest {

    @Test
    public void defaultTest() {
        assertEquals("()()()", new RemoveOutermostParentheses("(()())(())").solution());
    }
}
