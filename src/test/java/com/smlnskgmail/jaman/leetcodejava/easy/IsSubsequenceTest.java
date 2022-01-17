package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IsSubsequenceTest {

    @Test
    public void defaultTest() {
        assertTrue(new IsSubsequence("abc", "ahbgdc").solution());
    }
}
