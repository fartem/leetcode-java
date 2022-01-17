package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckIfTheSentenceIsPangramTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckIfTheSentenceIsPangram("thequickbrownfoxjumpsoverthelazydog").solution());
    }
}
