package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class KidsWithTheGreatestNumberOfCandiesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(true, true, true, false, true),
                new KidsWithTheGreatestNumberOfCandies(
                        new int[]{2, 3, 5, 1, 3},
                        3
                ).solution()
        );
    }

}
