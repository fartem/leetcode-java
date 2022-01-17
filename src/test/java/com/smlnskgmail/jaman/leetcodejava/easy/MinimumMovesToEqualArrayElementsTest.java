package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumMovesToEqualArrayElementsTest {

    @Test
    public void defaultTest() {
        assertEquals(3, new MinimumMovesToEqualArrayElements(new int[] {1, 2, 3}).solution());
    }
}
