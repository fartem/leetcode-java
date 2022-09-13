package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeTheStringGreatTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "leetcode",
                new MakeTheStringGreat("leEeetcode").solution()
        );
    }

}
