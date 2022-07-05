package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RangeSumQuery2DImmutableTest {

    @Test
    public void defaultTest() {
        var rangeSumQuery2DImmutable = new RangeSumQuery2DImmutable(
                new int[][]{
                        {3, 0, 1, 4, 2},
                        {5, 6, 3, 2, 1},
                        {1, 2, 0, 1, 5},
                        {4, 1, 0, 1, 7},
                        {1, 0, 3, 0, 5}
                }
        );
        assertEquals(8, rangeSumQuery2DImmutable.sumRegion(2, 1, 4, 3));
        assertEquals(11, rangeSumQuery2DImmutable.sumRegion(1, 1, 2, 2));
        assertEquals(12, rangeSumQuery2DImmutable.sumRegion(1, 2, 2, 4));
    }

}
