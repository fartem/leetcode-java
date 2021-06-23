package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountOfMatchesInTournamentTest {

    @Test
    public void defaultTest() {
        assertEquals(
                6,
                new CountOfMatchesInTournament(
                        7
                ).solution()
        );
    }

}
