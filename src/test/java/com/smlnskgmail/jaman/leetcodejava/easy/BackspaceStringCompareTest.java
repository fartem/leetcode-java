package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BackspaceStringCompareTest {

    @Test
    public void defaultTest() {
        assertTrue(new BackspaceStringCompare("ab#c", "ad#c").solution());
    }

}
