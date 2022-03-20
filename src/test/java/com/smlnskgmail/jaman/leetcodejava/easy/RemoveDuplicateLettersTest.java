package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicateLettersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "abc",
                new RemoveDuplicateLetters("bcabc").solution()
        );
    }

}
