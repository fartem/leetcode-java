package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainerWithMostWaterTest {

    @Test
    public void defaultTest() {
        assertEquals(
                49,
                new ContainerWithMostWater(
                        new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}
                ).solution()
        );
    }

}
