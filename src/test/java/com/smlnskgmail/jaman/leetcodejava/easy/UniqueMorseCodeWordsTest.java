package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueMorseCodeWordsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new UniqueMorseCodeWords(
                        new String[]{"gin", "zen", "gig", "msg"}
                ).solution()
        );
    }

}
