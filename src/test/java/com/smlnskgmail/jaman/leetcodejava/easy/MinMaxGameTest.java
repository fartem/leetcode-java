package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinMaxGameTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new MinMaxGame(new int[]{1, 3, 5, 2, 4, 8, 2, 2}).solution()
        );
    }

}
