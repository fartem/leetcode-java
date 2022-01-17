package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentenceTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new CheckIfAWordOccursAsAPrefixOfAnyWordInASentence("i love eating burger", "burg")
                        .solution());
    }
}
