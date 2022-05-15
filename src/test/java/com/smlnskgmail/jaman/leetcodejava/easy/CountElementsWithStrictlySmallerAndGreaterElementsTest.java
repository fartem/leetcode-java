package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountElementsWithStrictlySmallerAndGreaterElementsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new CountElementsWithStrictlySmallerAndGreaterElements(
                        new int[]{11, 7, 2, 15}
                ).solution()
        );
    }

}
