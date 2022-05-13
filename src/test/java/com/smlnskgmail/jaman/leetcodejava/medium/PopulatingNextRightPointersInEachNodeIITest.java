package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.NextTreeNode;
import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PopulatingNextRightPointersInEachNodeIITest {

    @Test
    public void defaultTest() {
        var ntn3 = new NextTreeNode(3);
        var ntn5 = new NextTreeNode(5);
        var ntn7 = new NextTreeNode(7);
        ntn3.right = ntn7;
        ntn5.next = ntn7;
        assertTrue(
                NextTreeNode.areEqual(
                        new NextTreeNode(
                                1,
                                new NextTreeNode(
                                        2,
                                        new NextTreeNode(4),
                                        ntn5,
                                        ntn3
                                ),
                                ntn3
                        ),
                        new PopulatingNextRightPointersInEachNodeII(
                                new NextTreeNode(
                                        1,
                                        new NextTreeNode(
                                                2,
                                                new NextTreeNode(4),
                                                new NextTreeNode(5)
                                        ),
                                        new NextTreeNode(
                                                3,
                                                null,
                                                new NextTreeNode(7)
                                        )
                                )
                        ).solution()
                )
        );
    }

}
