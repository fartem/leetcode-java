package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheKthLargestIntegerInTheArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "3",
                new FindTheKthLargestIntegerInTheArray(
                        new String[]{"3", "6", "7", "10"},
                        4
                ).solution()
        );
    }

}
