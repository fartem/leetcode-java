package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDuplicateTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new ContainsDuplicate(
                        new int[]{1, 2, 3, 1}
                ).solution()
        );
    }

}
