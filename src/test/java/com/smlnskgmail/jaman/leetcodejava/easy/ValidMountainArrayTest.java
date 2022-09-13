package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class ValidMountainArrayTest {

    @Test
    public void defaultTest() {
        assertFalse(new ValidMountainArray(new int[]{2, 1}).solution());
    }

}
