package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExcelSheetColumnTitleTest {

    @Test
    public void defaultTest() {
        assertEquals("A", new ExcelSheetColumnTitle(1).solution());
    }
}
