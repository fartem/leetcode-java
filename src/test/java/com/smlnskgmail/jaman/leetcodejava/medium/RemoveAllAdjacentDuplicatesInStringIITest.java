package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveAllAdjacentDuplicatesInStringIITest {

    @Test
    public void defaultTest() {
        assertEquals(
                "abcd",
                new RemoveAllAdjacentDuplicatesInStringII(
                        "abcd",
                        2
                ).solution()
        );
    }

}
