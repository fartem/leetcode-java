package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ReplaceWordsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "the cat was rat by the bat",
                new ReplaceWords(
                        Arrays.asList("cat", "bat", "rat"),
                        "the cattle was rattled by the battery"
                ).solution()
        );
    }

}
