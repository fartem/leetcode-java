package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractTheProductAndSumOfDigitsOfAnIntegerTest {

    @Test
    public void defaultTest() {
        assertEquals(
                15,
                new SubtractTheProductAndSumOfDigitsOfAnInteger(
                        234
                ).solution()
        );
    }

}
