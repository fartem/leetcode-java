package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindNearestPointThatHasTheSameXOrYCoordinateTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new FindNearestPointThatHasTheSameXOrYCoordinate(
                                3, 4, new int[][] {{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}})
                        .solution());
    }
}
