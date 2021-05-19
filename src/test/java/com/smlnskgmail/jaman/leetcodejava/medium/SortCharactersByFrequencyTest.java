package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortCharactersByFrequencyTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "eert",
                new SortCharactersByFrequency(
                        "tree"
                ).solution()
        );
    }

}
