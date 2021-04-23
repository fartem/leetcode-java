package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Base7Test {

    @Test
    public void defaultTest() {
        assertEquals(
                "202",
                new Base7(100).solution()
        );
    }

}
