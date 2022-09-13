package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class XOROperationInAnArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                8,
                new XOROperationInAnArray(5, 0).solution()
        );
    }

}
