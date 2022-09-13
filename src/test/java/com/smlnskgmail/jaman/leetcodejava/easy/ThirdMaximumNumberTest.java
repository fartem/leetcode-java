package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThirdMaximumNumberTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new ThirdMaximumNumber(new int[]{3, 2, 1}).solution()
        );
    }

}
