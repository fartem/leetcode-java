package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidParenthesesTest {

    @Test
    public void defaultTest() {
        assertTrue(new ValidParentheses("()").solution());
    }
}
