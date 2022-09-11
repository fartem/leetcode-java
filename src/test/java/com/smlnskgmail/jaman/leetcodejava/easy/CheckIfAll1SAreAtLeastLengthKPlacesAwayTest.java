package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckIfAll1SAreAtLeastLengthKPlacesAwayTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckIfAll1sAreAtLeastLengthKPlacesAway(
                        new int[]{1, 0, 0, 0, 1, 0, 0, 1},
                        2
                ).solution()
        );
    }

}
