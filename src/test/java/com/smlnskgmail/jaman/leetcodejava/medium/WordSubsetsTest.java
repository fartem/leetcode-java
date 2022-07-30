package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordSubsetsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of("facebook", "google", "leetcode"),
                new WordSubsets(
                        new String[]{"amazon", "apple", "facebook", "google", "leetcode"},
                        new String[]{"e", "o"}
                ).solution()
        );
    }

}
