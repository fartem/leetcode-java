package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckIfAll1AreAtLeastLengthKPlacesAwayTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckIfAll1AreAtLeastLengthKPlacesAway(new int[] {1, 0, 0, 0, 1, 0, 0, 1}, 2)
                        .solution());
    }
}
