package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TwoOutOfThreeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(2, 3),
                new TwoOutOfThree(
                        new int[]{1, 1, 3, 2},
                        new int[]{2, 3},
                        new int[]{3}
                ).solution()
        );
    }

}
