package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.smlnskgmail.jaman.leetcodejava.support.TreeNode.areEqual;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AllPossibleFullBinaryTreesTest {

    @Test
    public void defaultTest() {
        List<TreeNode> correct = Arrays.asList(
                new TreeNode(
                        0,
                        new TreeNode(0),
                        new TreeNode(
                                0,
                                new TreeNode(0),
                                new TreeNode(
                                        0,
                                        new TreeNode(0),
                                        new TreeNode(0)
                                )
                        )
                ),
                new TreeNode(
                        0,
                        new TreeNode(0),
                        new TreeNode(
                                0,
                                new TreeNode(
                                        0,
                                        new TreeNode(0),
                                        new TreeNode(0)
                                ),
                                new TreeNode(0)
                        )
                ),
                new TreeNode(
                        0,
                        new TreeNode(
                                0,
                                new TreeNode(0),
                                new TreeNode(0)
                        ),
                        new TreeNode(
                                0,
                                new TreeNode(0),
                                new TreeNode(0)
                        )
                ),
                new TreeNode(
                        0,
                        new TreeNode(
                                0,
                                new TreeNode(0),
                                new TreeNode(
                                        0,
                                        new TreeNode(0),
                                        new TreeNode(0)
                                )
                        ),
                        new TreeNode(0)
                ),
                new TreeNode(
                        0,
                        new TreeNode(
                                0,
                                new TreeNode(
                                        0,
                                        new TreeNode(0),
                                        new TreeNode(0)
                                ),
                                new TreeNode(0)
                        ),
                        new TreeNode(0)
                )
        );
        List<TreeNode> solution = new AllPossibleFullBinaryTrees(7).solution();
        assertEquals(correct.size(), solution.size());
        for (int i = 0; i < correct.size(); i++) {
            assertTrue(areEqual(correct.get(i), solution.get(i)));
        }
    }

}
