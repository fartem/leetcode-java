package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumNumberOfMovesToSeatEveryoneTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new MinimumNumberOfMovesToSeatEveryone(
                        new int[]{1, 3, 5},
                        new int[]{2, 7, 4}
                ).solution()
        );
    }

}
