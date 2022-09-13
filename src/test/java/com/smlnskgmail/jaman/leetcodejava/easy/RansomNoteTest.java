package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class RansomNoteTest {

    @Test
    public void defaultTest() {
        assertFalse(new RansomNote("a", "b").solution());
    }

}
