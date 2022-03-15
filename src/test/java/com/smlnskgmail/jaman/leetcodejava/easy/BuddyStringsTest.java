package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BuddyStringsTest {

    @Test
    public void defaultTest() {
        assertTrue(new BuddyStrings("ab", "ba").solution());
    }

}
