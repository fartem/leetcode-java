package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreeSumClosestTest {

    @Test
    public void defaultTests() {
        assertEquals(2, new ThreeSumClosest(new int[]{-1, 2, 1, -4}, 1).solution());
        assertEquals(0, new ThreeSumClosest(new int[]{0, 0, 0}, 1).solution());
    }

}
