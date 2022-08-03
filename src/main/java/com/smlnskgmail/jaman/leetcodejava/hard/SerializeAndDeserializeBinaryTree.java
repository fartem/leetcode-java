package com.smlnskgmail.jaman.leetcodejava.hard;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
public class SerializeAndDeserializeBinaryTree {

    public String serialize(TreeNode root) {
        var out = new ByteArrayOutputStream(1024 * 16);
        serialize(root, out);
        return out.toString(StandardCharsets.ISO_8859_1);
    }

    private void serialize(TreeNode node, ByteArrayOutputStream out) {
        if (node == null) {
            out.write(0);
        } else {
            out.write(1);
            writeInt(out, node.val);
            serialize(node.left, out);
            serialize(node.right, out);
        }
    }

    private void writeInt(ByteArrayOutputStream out, int val) {
        out.write((val >>> 24) & 0xFF);
        out.write((val >>> 16) & 0xFF);
        out.write((val >>> 8) & 0xFF);
        out.write(val & 0xFF);
    }

    public TreeNode deserialize(String data) {
        var bytes = data.getBytes(StandardCharsets.ISO_8859_1);
        var in = new ByteArrayInputStream(bytes);
        return deserialize(in);
    }

    private TreeNode deserialize(ByteArrayInputStream in) {
        if (in.available() == 0 || in.read() == 0) {
            return null;
        }
        var node = new TreeNode(readInt(in));
        node.left = deserialize(in);
        node.right = deserialize(in);
        return node;
    }

    private int readInt(ByteArrayInputStream in) {
        int val = in.read() << 24;
        val |= in.read() << 16;
        val |= in.read() << 8;
        val |= in.read();
        return val;
    }

}
