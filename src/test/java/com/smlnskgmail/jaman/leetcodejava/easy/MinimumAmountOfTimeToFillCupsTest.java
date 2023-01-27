package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumAmountOfTimeToFillCupsTest {

    @Test
    public void defaultTests() {
        assertEquals(4, new MinimumAmountOfTimeToFillCups(new int[]{1, 4, 2}).solution());
        assertEquals(7, new MinimumAmountOfTimeToFillCups(new int[]{5, 4, 4}).solution());
        assertEquals(5, new MinimumAmountOfTimeToFillCups(new int[]{5, 0, 0}).solution());
    }

}
