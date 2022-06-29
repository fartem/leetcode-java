package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DetermineWhetherMatrixCanBeObtainedByRotationTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new DetermineWhetherMatrixCanBeObtainedByRotation(
                        new int[][]{{0, 1}, {1, 0}},
                        new int[][]{{1, 0}, {0, 1}}
                ).solution()
        );
    }

}
