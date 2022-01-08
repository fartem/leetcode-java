package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/serialize-and-deserialize-bst
public class SerializeAndDeserializeBST {

    public String serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }
        StringBuilder result = new StringBuilder();
        result.append(root.val);
        String left = serialize(root.left);
        result.append(",").append(left);
        String right = serialize(root.right);
        result.append(",").append(right);
        return result.toString();
    }

    public TreeNode deserialize(String data) {
        String[] parsedData = data.split(",");
        return deserializeFromString(parsedData, 0, parsedData.length - 1);
    }

    private TreeNode deserializeFromString(String[] data, int l, int r) {
        String candidate = data[l];
        if (candidate.equals("#")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(data[l]));
        boolean built = false;
        for (int i = l + 1; i <= r; i++) {
            String value = data[i];
            if (value.equals("#")) {
                continue;
            }
            if (Integer.parseInt(value) > root.val) {
                built = true;
                root.left = deserializeFromString(data, l + 1, i - 1);
                root.right = deserializeFromString(data, i, r);
                break;
            }
        }
        if (!built) {
            root.left = deserializeFromString(data, l + 1, r);
        }
        return root;
    }

}
