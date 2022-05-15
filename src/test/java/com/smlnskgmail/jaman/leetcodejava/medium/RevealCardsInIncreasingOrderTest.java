package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RevealCardsInIncreasingOrderTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{2, 13, 3, 11, 5, 17, 7},
                new RevealCardsInIncreasingOrder(
                        new int[]{17, 13, 11, 2, 3, 5, 7}
                ).solution()
        );
    }

}
