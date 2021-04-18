package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReformatDateTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "2052-10-20",
                new ReformatDate(
                        "20th Oct 2052"
                ).solution()
        );
    }

}
