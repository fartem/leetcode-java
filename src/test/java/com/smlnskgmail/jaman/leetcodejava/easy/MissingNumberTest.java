package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingNumberTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new MissingNumber(new int[]{3, 0, 1}).solution()
        );
    }

}
