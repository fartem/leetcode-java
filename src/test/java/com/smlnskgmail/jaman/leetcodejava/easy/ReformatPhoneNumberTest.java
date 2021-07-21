package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReformatPhoneNumberTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "123-456",
                new ReformatPhoneNumber(
                        "1-23-45 6"
                ).solution()
        );
    }

}
