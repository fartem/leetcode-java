package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DeleteNodesAndReturnForestTest {

    @Test
    public void defaultTest() {
        List<TreeNode> correct = Arrays.asList(
                new TreeNode(6),
                new TreeNode(7),
                new TreeNode(
                        1,
                        new TreeNode(
                                2,
                                new TreeNode(4),
                                null
                        ),
                        null
                )
        );
        List<TreeNode> solution = new DeleteNodesAndReturnForest(
                new TreeNode(
                        1,
                        new TreeNode(
                                2,
                                new TreeNode(4),
                                new TreeNode(5)
                        ),
                        new TreeNode(
                                3,
                                new TreeNode(6),
                                new TreeNode(7)
                        )
                ),
                new int[]{3, 5}
        ).solution();
        for (int i = 0; i < correct.size(); i++) {
            TreeNode n1 = correct.get(i);
            TreeNode n2 = solution.get(i);
            areEqual(n1, n2);
        }
    }

    private boolean areEqual(TreeNode n1, TreeNode n2) {
        if (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            return areEqual(n1.left, n2.left) && areEqual(n1.right, n2.right);
        }
        return n1 == null && n2 == null;
    }

}
