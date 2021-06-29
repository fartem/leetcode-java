package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PascalsTriangleTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(
                        Arrays.asList(1),
                        Arrays.asList(1, 1),
                        Arrays.asList(1, 2, 1),
                        Arrays.asList(1, 3, 3, 1),
                        Arrays.asList(1, 4, 6, 4, 1)
                ),
                new PascalsTriangle(5).solution()
        );
    }

}
