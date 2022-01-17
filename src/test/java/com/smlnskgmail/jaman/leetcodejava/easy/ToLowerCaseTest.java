package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ToLowerCaseTest {

    @Test
    public void defaultTest() {
        assertEquals("hello", new ToLowerCase("Hello").solution());
    }
}
