package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HammingDistanceTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new HammingDistance(
                        1,
                        4
                ).solution()
        );
    }

}
