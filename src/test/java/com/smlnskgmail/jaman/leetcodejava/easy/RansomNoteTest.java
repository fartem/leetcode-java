package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class RansomNoteTest {

    @Test
    public void defaultTest() {
        assertFalse(new RansomNote("a", "b").solution());
    }
}
