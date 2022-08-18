package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReduceArraySizeToTheHalfTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new ReduceArraySizeToTheHalf(new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7}).solution()
        );
    }

}
