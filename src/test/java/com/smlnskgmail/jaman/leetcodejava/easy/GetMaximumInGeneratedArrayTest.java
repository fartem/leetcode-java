package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetMaximumInGeneratedArrayTest {

    @Test
    public void defaultTests() {
        assertEquals(3, new GetMaximumInGeneratedArray(7).solution());
        assertEquals(1, new GetMaximumInGeneratedArray(2).solution());
        assertEquals(2, new GetMaximumInGeneratedArray(3).solution());
    }

}
