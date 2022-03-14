package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CellsInARangeOnAnExcelSheetTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList("K1", "K2", "L1", "L2"),
                new CellsInARangeOnAnExcelSheet("K1:L2").solution()
        );
    }

}
