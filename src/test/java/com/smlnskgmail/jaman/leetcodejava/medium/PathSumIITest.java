package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PathSumIITest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(
                        Arrays.asList(5, 4, 11, 2),
                        Arrays.asList(5, 8, 4, 5)
                ),
                new PathSumII(
                        new TreeNode(
                                5,
                                new TreeNode(
                                        4,
                                        new TreeNode(
                                                11,
                                                new TreeNode(7),
                                                new TreeNode(2)
                                        ),
                                        null
                                ),
                                new TreeNode(
                                        8,
                                        new TreeNode(13),
                                        new TreeNode(
                                                4,
                                                new TreeNode(5),
                                                new TreeNode(1)
                                        )
                                )
                        ),
                        22
                ).solution()
        );
    }

}
