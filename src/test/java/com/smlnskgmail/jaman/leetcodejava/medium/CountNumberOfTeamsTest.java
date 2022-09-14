package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountNumberOfTeamsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new CountNumberOfTeams(new int[]{2, 5, 3, 4, 1}).solution()
        );
    }

}
