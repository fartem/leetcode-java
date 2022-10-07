package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodedStringAtIndexTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "o",
                new DecodedStringAtIndex("leet2code3", 10).solution()
        );
    }

}
