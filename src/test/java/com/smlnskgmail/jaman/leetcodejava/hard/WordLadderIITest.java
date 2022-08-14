package com.smlnskgmail.jaman.leetcodejava.hard;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordLadderIITest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of(
                        List.of("hit", "hot", "lot", "log", "cog"),
                        List.of("hit", "hot", "dot", "dog", "cog")
                ),
                new WordLadderII(
                        "hit",
                        "cog",
                        List.of("hot", "dot", "dog", "lot", "log", "cog")
                ).solution()
        );
    }

}
