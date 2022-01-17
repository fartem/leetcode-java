package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryGapTest {

    @Test
    public void defaultTest() {
        //        assertEquals(
        //                2,
        //                new BinaryGap(22).solution()
        //        );
        assertEquals(2, new BinaryGap(13).solution());
    }
}
