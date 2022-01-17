package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestPerimeterTriangleTest {

    @Test
    public void defaultTest() {
        assertEquals(5, new LargestPerimeterTriangle(new int[] {2, 1, 2}).solution());
    }
}
