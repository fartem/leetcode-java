package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestUncommonSubsequenceITest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new LongestUncommonSubsequenceI("aba", "cdc").solution()
        );
    }

}
