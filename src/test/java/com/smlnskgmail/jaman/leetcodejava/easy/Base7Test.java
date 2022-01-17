package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Base7Test {

    @Test
    public void defaultTest() {
        assertEquals("202", new Base7(100).solution());
    }
}
