package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HammingDistanceTest {

    @Test
    public void defaultTest() {
        assertEquals(2, new HammingDistance(1, 4).solution());
    }
}
