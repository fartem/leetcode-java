package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayPartitionITest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new ArrayPartitionI(
                        new int[]{1, 2, 3, 4}
                ).solution()
        );
    }

}
