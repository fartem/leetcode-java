package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReformatTheStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "0a1b2c",
                new ReformatTheString("0a1b2c").solution()
        );
    }

}
