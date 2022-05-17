package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTwoIntegersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                17,
                new AddTwoIntegers(12, 5).solution()
        );
    }

}
