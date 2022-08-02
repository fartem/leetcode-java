package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthSmallestElementInASortedMatrixTest {

    @Test
    public void defaultTest() {
        assertEquals(
                13,
                new KthSmallestElementInASortedMatrix(
                        new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}},
                        8
                ).solution()
        );
    }

}
