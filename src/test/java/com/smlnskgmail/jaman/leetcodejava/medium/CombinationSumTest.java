package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CombinationSumTest {

    @Test
    public void defaultTests() {
        assertEquals(
                List.of(List.of(2, 2, 3), List.of(7)),
                new CombinationSum(new int[]{2, 3, 6, 7}, 7).solution()
        );
        assertEquals(
                List.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5)),
                new CombinationSum(new int[]{2, 3, 5}, 8).solution()
        );
        assertEquals(
                Collections.emptyList(),
                new CombinationSum(new int[]{2}, 1).solution()
        );
    }

}
