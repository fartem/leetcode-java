package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestPerimeterTriangleTest {

    @Test
    public void defaultTest() {
        assertEquals(
                5,
                new LargestPerimeterTriangle(new int[]{2, 1, 2}).solution()
        );
    }

}
