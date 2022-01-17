package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CreateTargetArrayInTheGivenOrderTest {

    @Test
    public void defaultTest() {
        //        assertArrayEquals(
        //                new int[]{0, 4, 1, 3, 2},
        //                new CreateTargetArrayInTheGivenOrder(
        //                        new int[]{0, 1, 2, 3, 4},
        //                        new int[]{0, 1, 2, 2, 1}
        //                ).solution()
        //        );
        assertArrayEquals(
                new int[] {1, 3, 3},
                new CreateTargetArrayInTheGivenOrder(new int[] {3, 3, 1}, new int[] {0, 0, 0})
                        .solution());
    }
}
