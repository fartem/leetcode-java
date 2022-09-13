package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortingTheSentenceTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "This is a sentence",
                new SortingTheSentence("is2 sentence4 This1 a3").solution()
        );
    }

}
