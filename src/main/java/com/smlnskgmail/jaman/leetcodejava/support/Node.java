package com.smlnskgmail.jaman.leetcodejava.support;

import java.util.List;

public class Node {

    public final int val;
    public final List<Node> children;

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }

}
