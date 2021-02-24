package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImplementStrStrTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new ImplementStrStr(
                        "hello",
                        "ll"
                ).solution()
        );
    }

}
