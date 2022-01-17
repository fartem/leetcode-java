package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestUncommonSubsequenceITest {

    @Test
    public void defaultTest() {
        assertEquals(3, new LongestUncommonSubsequenceI("aba", "cdc").solution());
    }
}
