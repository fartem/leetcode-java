package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MakeTheStringGreatTest {

    @Test
    public void defaultTest() {
        assertEquals("leetcode", new MakeTheStringGreat("leEeetcode").solution());
    }
}
