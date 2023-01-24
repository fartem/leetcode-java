package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlternatingDigitSumTest {

    @Test
    public void defaultTests() {
        assertEquals(4, new AlternatingDigitSum(521).solution());
        assertEquals(1, new AlternatingDigitSum(111).solution());
        assertEquals(0, new AlternatingDigitSum(886996).solution());
    }

}
