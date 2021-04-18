package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckIfTheSentenceIsPangramTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckIfTheSentenceIsPangram(
                        "thequickbrownfoxjumpsoverthelazydog"
                ).solution()
        );
    }

}
