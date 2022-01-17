package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class DIStringMatchTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(new int[] {0, 4, 1, 3, 2}, new DIStringMatch("IDID").solution());
    }
}
