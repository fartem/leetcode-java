package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FindDuplicateSubtreesTest {

    @Test
    public void defaultTest() {
        List<TreeNode> correct = List.of(
                new TreeNode(
                        2,
                        new TreeNode(4),
                        null
                ),
                new TreeNode(4)
        );
        List<TreeNode> solution = new FindDuplicateSubtrees(
                new TreeNode(
                        1,
                        new TreeNode(
                                2,
                                new TreeNode(4),
                                null
                        ),
                        new TreeNode(
                                3,
                                new TreeNode(
                                        2,
                                        new TreeNode(4),
                                        null
                                ),
                                new TreeNode(4)
                        )
                )
        ).solution();
        assertEquals(correct.size(), solution.size());
        for (int i = 0; i < correct.size(); i++) {
            assertTrue(TreeNode.areEqual(correct.get(i), solution.get(i)));
        }
    }

}
