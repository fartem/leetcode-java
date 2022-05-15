package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LongestWordInDictionaryThroughDeletingTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "apple",
                new LongestWordInDictionaryThroughDeleting(
                        "abpcplea",
                        Arrays.asList("ale", "apple", "monkey", "plea")
                ).solution()
        );
    }

}
