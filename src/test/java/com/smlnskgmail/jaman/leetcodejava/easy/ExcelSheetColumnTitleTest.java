package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExcelSheetColumnTitleTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "A",
                new ExcelSheetColumnTitle(1).solution()
        );
    }

}
