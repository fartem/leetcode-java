package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleNumberTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new SingleNumber(
                        new int[]{2, 2, 1}
                ).solution()
        );
    }

}
