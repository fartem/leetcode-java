package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueEmailAddressesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new UniqueEmailAddresses(
                        new String[]{
                                "test.email+alex@leetcode.com",
                                "test.e.mail+bob.cathy@leetcode.com",
                                "testemail+david@lee.tcode.com"
                        }
                ).solution()
        );
    }

}
