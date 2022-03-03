package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CapitalizeTheTitleTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "Capitalize The Title",
                new CapitalizeTheTitle("capiTalIze tHe titLe").solution()
        );
    }

}
