package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class ValidMountainArrayTest {

    @Test
    public void defaultTest() {
        assertFalse(new ValidMountainArray(new int[] {2, 1}).solution());
    }
}
