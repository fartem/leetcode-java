package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FindLargestValueInEachTreeRowTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(1, 3, 9),
                new FindLargestValueInEachTreeRow(
                        new TreeNode(
                                1,
                                new TreeNode(
                                        3,
                                        new TreeNode(5),
                                        new TreeNode(3)
                                ),
                                new TreeNode(
                                        2,
                                        null,
                                        new TreeNode(9)
                                )
                        )
                ).solution()
        );
    }

}
