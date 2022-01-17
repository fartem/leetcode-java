package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.NextTreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PopulatingNextRightPointersInEachNodeTest {

    @Test
    public void defaultTest() {
        NextTreeNode l3n4 = new NextTreeNode(7);
        NextTreeNode l3n3 = new NextTreeNode(6, l3n4);
        NextTreeNode l3n2 = new NextTreeNode(5, l3n3);
        NextTreeNode l3n1 = new NextTreeNode(4, l3n2);

        NextTreeNode l2n2 = new NextTreeNode(3, l3n3, l3n4);
        NextTreeNode l2n1 = new NextTreeNode(2, l3n1, l3n2, l2n2);
        assertTrue(
                NextTreeNode.areEqual(
                        new NextTreeNode(1, l2n1, l2n2),
                        new PopulatingNextRightPointersInEachNode(
                                new NextTreeNode(
                                        1,
                                        new NextTreeNode(
                                                2,
                                                new NextTreeNode(4),
                                                new NextTreeNode(5)
                                        ),
                                        new NextTreeNode(
                                                3,
                                                new NextTreeNode(6),
                                                new NextTreeNode(7)
                                        )
                                )
                        ).solution()
                )
        );
    }

}
