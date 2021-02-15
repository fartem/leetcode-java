package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{4, 0, 1, 1, 3},
                new HowManyNumbersAreSmallerThanTheCurrentNumber(
                        new int[]{8, 1, 2, 2, 3}
                ).solution()
        );
    }

}
