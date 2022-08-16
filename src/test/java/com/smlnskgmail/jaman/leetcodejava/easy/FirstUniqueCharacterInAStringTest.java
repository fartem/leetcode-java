package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstUniqueCharacterInAStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                0,
                new FirstUniqueCharacterInAString("leetcode").solution()
        );
    }

}
