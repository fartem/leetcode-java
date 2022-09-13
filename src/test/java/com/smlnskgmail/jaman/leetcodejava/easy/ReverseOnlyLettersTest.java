package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseOnlyLettersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "dc-ba",
                new ReverseOnlyLetters("ab-cd").solution()
        );
    }

}
