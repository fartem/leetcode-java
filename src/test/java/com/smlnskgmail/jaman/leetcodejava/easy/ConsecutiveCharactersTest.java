package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsecutiveCharactersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new ConsecutiveCharacters("leetcode").solution()
        );
    }

}
