package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SerializeAndDeserializeBSTTest {

    @Test
    public void defaultTest() {
        TreeNode root = new TreeNode(
                2,
                new TreeNode(1),
                new TreeNode(3)
        );
        var serializeAndDeserializeBST = new SerializeAndDeserializeBST();
        String tree = serializeAndDeserializeBST.serialize(root);
        assertTrue(
                TreeNode.areEqual(
                        root,
                        serializeAndDeserializeBST.deserialize(tree)
                )
        );
    }

}
