package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MergeSimilarItemsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of(List.of(1, 6), List.of(3, 9), List.of(4, 5)),
                new MergeSimilarItems(
                        new int[][]{{1, 1}, {4, 5}, {3, 8}},
                        new int[][]{{3, 1}, {1, 5}}
                ).solution()
        );
    }

}
