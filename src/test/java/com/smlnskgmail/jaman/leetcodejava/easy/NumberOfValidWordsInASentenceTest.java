package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfValidWordsInASentenceTest {

    @Test
    public void defaultTests() {
        assertEquals(3, new NumberOfValidWordsInASentence("cat and  dog").solution());
        assertEquals(0, new NumberOfValidWordsInASentence("!this  1-s b8d!").solution());
        assertEquals(
                5,
                new NumberOfValidWordsInASentence(
                        "alice and  bob are playing stone-game10"
                ).solution()
        );
    }

}
