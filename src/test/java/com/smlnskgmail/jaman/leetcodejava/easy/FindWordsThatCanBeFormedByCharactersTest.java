package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindWordsThatCanBeFormedByCharactersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                6,
                new FindWordsThatCanBeFormedByCharacters(
                                new String[] {"cat", "bt", "hat", "tree"}, "atach")
                        .solution());
    }
}
