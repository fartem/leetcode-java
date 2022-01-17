package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class KidsWithTheGreatestNumberOfCandiesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(true, true, true, false, true),
                new KidsWithTheGreatestNumberOfCandies(new int[] {2, 3, 5, 1, 3}, 3).solution());
    }
}
