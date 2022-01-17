package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IncreasingDecreasingStringTest {

    @Test
    public void defaultTest() {
        assertEquals("abccbaabccba", new IncreasingDecreasingString("aaaabbbbcccc").solution());
    }
}
