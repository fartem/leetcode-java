package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReformatPhoneNumberTest {

    @Test
    public void defaultTest() {
        assertEquals("123-456", new ReformatPhoneNumber("1-23-45 6").solution());
    }
}
