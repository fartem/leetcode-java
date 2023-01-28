package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumCostToMoveChipsToTheSamePositionTest {

    @Test
    public void defaultTests() {
        assertEquals(1, new MinimumCostToMoveChipsToTheSamePosition(new int[]{1, 2, 3}).solution());
        assertEquals(2, new MinimumCostToMoveChipsToTheSamePosition(new int[]{2, 2, 2, 3, 3}).solution());
        assertEquals(1, new MinimumCostToMoveChipsToTheSamePosition(new int[]{1, 1000000000}).solution());
    }

}
