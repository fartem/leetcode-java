package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DefangingAnIPAddressTest {

    @Test
    public void defaultTest() {
        assertEquals("1[.]1[.]1[.]1", new DefangingAnIPAddress("1.1.1.1").solution());
    }
}
