package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void defaultTest() {
        char[] input = new char[] {'h', 'e', 'l', 'l', 'o'};
        ReverseString reverseString = new ReverseString(input);
        reverseString.solution();
        assertArrayEquals(new char[] {'o', 'l', 'l', 'e', 'h'}, input);
    }
}
