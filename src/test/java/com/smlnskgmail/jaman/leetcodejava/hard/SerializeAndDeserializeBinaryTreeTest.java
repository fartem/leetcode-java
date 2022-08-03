package com.smlnskgmail.jaman.leetcodejava.hard;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class SerializeAndDeserializeBinaryTreeTest {

    @Test
    public void defaultTest() {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(2),
                new TreeNode(
                        3,
                        new TreeNode(4),
                        new TreeNode(5)
                )
        );
        var serializeAndDeserializeBinaryTree = new SerializeAndDeserializeBinaryTree();
        var data = serializeAndDeserializeBinaryTree.serialize(root);
        assertTrue(TreeNode.areEqual(root, serializeAndDeserializeBinaryTree.deserialize(data)));
    }

}
