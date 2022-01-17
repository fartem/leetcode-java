package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountSpecialQuadrupletsTest {

    @Test
    public void defaultTest() {
        assertEquals(1, new CountSpecialQuadruplets(new int[] {1, 2, 3, 6}).solution());
    }
}
