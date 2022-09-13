package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToLowerCaseTest {

    @Test
    public void defaultTest() {
        assertEquals("hello", new ToLowerCase("Hello").solution());
    }

}
