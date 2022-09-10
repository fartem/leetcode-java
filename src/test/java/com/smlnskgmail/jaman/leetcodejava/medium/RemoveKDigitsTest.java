package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveKDigitsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "1219",
                new RemoveKDigits("1432219", 3).solution()
        );
    }

}
