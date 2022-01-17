package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IslandPerimeterTest {

    @Test
    public void defaultTest() {
        assertEquals(
                16,
                new IslandPerimeter(
                                new int[][] {
                                    {0, 1, 0, 0},
                                    {1, 1, 1, 0},
                                    {0, 1, 0, 0},
                                    {1, 1, 0, 0}
                                })
                        .solution());
    }
}
