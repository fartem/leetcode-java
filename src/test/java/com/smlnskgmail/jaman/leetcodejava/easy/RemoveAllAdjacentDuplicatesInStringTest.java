package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveAllAdjacentDuplicatesInStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "ca",
                new RemoveAllAdjacentDuplicatesInString(
                        "abbaca"
                ).solution()
        );
    }

}
