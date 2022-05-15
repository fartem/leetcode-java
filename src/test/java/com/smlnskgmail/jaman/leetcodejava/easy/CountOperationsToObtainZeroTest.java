package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountOperationsToObtainZeroTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new CountOperationsToObtainZero(2, 3).solution()
        );
    }

}
