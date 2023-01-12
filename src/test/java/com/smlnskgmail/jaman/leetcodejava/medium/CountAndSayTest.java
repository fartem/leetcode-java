package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountAndSayTest {

    @Test
    public void defaultTests() {
        assertEquals("1", new CountAndSay(1).solution());
        assertEquals("1211", new CountAndSay(4).solution());
    }

}
