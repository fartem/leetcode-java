package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateMoneyInLeetcodeBankTest {

    @Test
    public void defaultTests() {
        assertEquals(10, new CalculateMoneyInLeetcodeBank(4).solution());
        assertEquals(37, new CalculateMoneyInLeetcodeBank(10).solution());
        assertEquals(96, new CalculateMoneyInLeetcodeBank(20).solution());
    }

}
