package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentenceTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new CheckIfAWordOccursAsAPrefixOfAnyWordInASentence(
                        "i love eating burger",
                        "burg"
                ).solution()
        );
    }

}
