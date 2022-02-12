package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrintFooBarAlternatelyTest {

    @Test
    public void defaultTest() throws InterruptedException {
        StringBuffer result = new StringBuffer();
        var printFooBarAlternately = new PrintFooBarAlternately(1);
        printFooBarAlternately.foo(() -> result.append("foo"));
        printFooBarAlternately.bar(() -> result.append("bar"));
        assertEquals("foobar", result.toString());
    }

}
