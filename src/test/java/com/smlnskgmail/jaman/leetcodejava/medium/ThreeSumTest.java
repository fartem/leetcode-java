package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ThreeSumTest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)),
                new ThreeSum(new int[]{-1, 0, 1, 2, -1, -4}).solution()
        );
    }

}
