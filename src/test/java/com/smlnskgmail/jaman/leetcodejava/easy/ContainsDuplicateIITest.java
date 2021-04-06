package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ContainsDuplicateIITest {

    @Test
    public void defaultTest() {
        assertTrue(
                new ContainsDuplicateII(
                        new int[]{1, 2, 3, 1},
                        3
                ).solution()
        );
    }

}
