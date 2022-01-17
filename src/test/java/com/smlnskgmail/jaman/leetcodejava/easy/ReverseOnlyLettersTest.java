package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseOnlyLettersTest {

    @Test
    public void defaultTest() {
        assertEquals("dc-ba", new ReverseOnlyLetters("ab-cd").solution());
    }
}
