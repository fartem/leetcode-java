package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindWordsThatCanBeFormedByCharactersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                6,
                new FindWordsThatCanBeFormedByCharacters(
                        new String[]{"cat", "bt", "hat", "tree"},
                        "atach"
                ).solution()
        );
    }

}
