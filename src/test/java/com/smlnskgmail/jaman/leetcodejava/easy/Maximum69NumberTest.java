package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Maximum69NumberTest {

    @Test
    public void defaultTest() {
        assertEquals(
                9969,
                new Maximum69Number(
                        9669
                ).solution()
        );
    }

}
