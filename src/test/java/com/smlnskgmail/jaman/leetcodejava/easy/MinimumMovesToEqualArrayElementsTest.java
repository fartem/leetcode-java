package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumMovesToEqualArrayElementsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new MinimumMovesToEqualArrayElements(
                        new int[]{1, 2, 3}
                ).solution()
        );
    }

}
