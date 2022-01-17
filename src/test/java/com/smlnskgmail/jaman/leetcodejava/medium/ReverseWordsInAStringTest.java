package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseWordsInAStringTest {

    @Test
    public void defaultTest() {
        assertEquals("blue is sky the", new ReverseWordsInAString("the sky is blue").solution());
    }
}
