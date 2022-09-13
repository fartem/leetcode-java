package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfUniqueElementsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new SumOfUniqueElements(new int[]{1, 2, 3, 2}).solution()
        );
    }

}
