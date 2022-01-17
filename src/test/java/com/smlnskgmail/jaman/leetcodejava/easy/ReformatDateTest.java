package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReformatDateTest {

    @Test
    public void defaultTest() {
        assertEquals("2052-10-20", new ReformatDate("20th Oct 2052").solution());
    }
}
