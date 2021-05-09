package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MinimumIndexSumOfTwoListsTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new String[]{"Shogun"},
                new MinimumIndexSumOfTwoLists(
                        new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                        new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}
                ).solution()
        );
    }

}
