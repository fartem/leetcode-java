package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckIfMatrixIsXMatrixTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckIfMatrixIsXMatrix(
                        new int[][]{
                                {2, 0, 0, 1},
                                {0, 3, 1, 0},
                                {0, 5, 2, 0},
                                {4, 0, 0, 2}
                        }
                ).solution()
        );
    }

}
