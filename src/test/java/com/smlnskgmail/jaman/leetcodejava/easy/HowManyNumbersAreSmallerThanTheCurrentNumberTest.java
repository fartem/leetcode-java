package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {4, 0, 1, 1, 3},
                new HowManyNumbersAreSmallerThanTheCurrentNumber(new int[] {8, 1, 2, 2, 3})
                        .solution());
    }
}
