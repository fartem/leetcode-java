package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindThreeConsecutiveIntegersThatSumToAGivenNumberTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new long[]{10, 11, 12},
                new FindThreeConsecutiveIntegersThatSumToAGivenNumber(33).solution()
        );
    }

}
