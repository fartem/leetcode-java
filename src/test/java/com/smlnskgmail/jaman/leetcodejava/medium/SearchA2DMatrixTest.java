package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SearchA2DMatrixTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new SearchA2DMatrix(
                        new int[][]{
                                {1, 3, 5, 7},
                                {10, 11, 16, 20},
                                {23, 30, 34, 60}
                        },
                        3
                ).solution()
        );
    }

}
