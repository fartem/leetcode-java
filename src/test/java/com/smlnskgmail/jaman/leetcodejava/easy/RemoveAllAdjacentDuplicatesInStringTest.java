package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveAllAdjacentDuplicatesInStringTest {

    @Test
    public void defaultTest() {
        assertEquals("ca", new RemoveAllAdjacentDuplicatesInString("abbaca").solution());
    }
}
