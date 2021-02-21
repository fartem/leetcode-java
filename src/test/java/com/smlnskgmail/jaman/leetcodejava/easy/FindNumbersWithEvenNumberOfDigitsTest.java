package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindNumbersWithEvenNumberOfDigitsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new FindNumbersWithEvenNumberOfDigits(
                        new int[]{12, 345, 2, 6, 7896}
                ).solution()
        );
    }

}
