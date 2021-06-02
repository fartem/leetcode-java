package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheDuplicateNumberTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new FindTheDuplicateNumber(
                        new int[]{1, 3, 4, 2, 2}
                ).solution()
        );
    }

}
