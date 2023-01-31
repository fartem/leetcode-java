package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DistributeCandiesToPeopleTest {

    @Test
    public void defaultTests() {
        assertArrayEquals(
                new int[]{1, 2, 3, 1},
                new DistributeCandiesToPeople(7, 4).solution()
        );
        assertArrayEquals(
                new int[]{5, 2, 3},
                new DistributeCandiesToPeople(10, 3).solution()
        );
    }

}
