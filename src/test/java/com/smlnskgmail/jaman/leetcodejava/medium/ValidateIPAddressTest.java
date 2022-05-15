package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidateIPAddressTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "IPv4",
                new ValidateIPAddress("172.16.254.1").solution()
        );
    }

}
