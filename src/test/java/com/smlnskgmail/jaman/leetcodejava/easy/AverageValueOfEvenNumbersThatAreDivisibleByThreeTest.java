package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AverageValueOfEvenNumbersThatAreDivisibleByThreeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                9,
                new AverageValueOfEvenNumbersThatAreDivisibleByThree(
                        new int[]{1, 3, 6, 10, 12, 15}
                ).solution()
        );
    }

}
