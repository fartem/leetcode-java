package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LicenseKeyFormattingTest {

    @Test
    public void defaultTest() {
        assertEquals("5F3Z-2E9W", new LicenseKeyFormatting("5F3Z-2e-9-w", 4).solution());
    }
}
