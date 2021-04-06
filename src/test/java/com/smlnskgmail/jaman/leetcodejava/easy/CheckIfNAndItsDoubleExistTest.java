package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckIfNAndItsDoubleExistTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckIfNAndItsDoubleExist(
                        new int[]{10, 2, 5, 3}
                ).solution()
        );
    }

}
