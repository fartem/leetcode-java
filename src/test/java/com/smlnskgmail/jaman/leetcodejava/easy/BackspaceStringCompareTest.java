package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BackspaceStringCompareTest {

    @Test
    public void defaultTest() {
        assertTrue(new BackspaceStringCompare("ab#c", "ad#c").solution());
    }
}
