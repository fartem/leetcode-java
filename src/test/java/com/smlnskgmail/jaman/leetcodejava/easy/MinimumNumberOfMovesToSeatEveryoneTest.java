package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumNumberOfMovesToSeatEveryoneTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new MinimumNumberOfMovesToSeatEveryone(new int[] {1, 3, 5}, new int[] {2, 7, 4})
                        .solution());
    }
}
