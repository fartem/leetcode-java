package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefangingAnIPAddressTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "1[.]1[.]1[.]1",
                new DefangingAnIPAddress("1.1.1.1").solution()
        );
    }

}
