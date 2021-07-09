package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpecialArrayWithXElementsGreaterThanOrEqualXTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new SpecialArrayWithXElementsGreaterThanOrEqualX(
                        new int[]{3, 5}
                ).solution()
        );
    }

}
