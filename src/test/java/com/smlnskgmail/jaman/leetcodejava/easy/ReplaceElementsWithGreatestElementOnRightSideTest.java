package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReplaceElementsWithGreatestElementOnRightSideTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{18, 6, 6, 6, 1, -1},
                new ReplaceElementsWithGreatestElementOnRightSide(
                        new int[]{17, 18, 5, 4, 6, 1}
                ).solution()
        );
    }

}
