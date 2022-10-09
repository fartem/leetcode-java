package com.smlnskgmail.jaman.leetcodejava.hard;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class RegularExpressionMatchingTest {

    @Test
    public void defaultTest() {
        assertFalse(new RegularExpressionMatching("aa", "a").solution());
    }

}
