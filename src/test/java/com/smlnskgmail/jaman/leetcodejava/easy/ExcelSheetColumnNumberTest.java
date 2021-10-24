package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExcelSheetColumnNumberTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new ExcelSheetColumnNumber("A").solution()
        );
    }

}
