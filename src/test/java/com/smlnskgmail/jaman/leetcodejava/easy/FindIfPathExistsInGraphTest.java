package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FindIfPathExistsInGraphTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new FindIfPathExistsInGraph(
                        3,
                        new int[][]{{0, 1}, {1, 2}, {2, 0}},
                        0,
                        2
                ).solution()
        );
    }

}
