package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.Node;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class NAryTreePostorderTraversalTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(5, 6, 3, 2, 4, 1),
                new NAryTreePostorderTraversal(
                        new Node(
                                1,
                                Arrays.asList(
                                        new Node(
                                                3,
                                                Arrays.asList(
                                                        new Node(5, null),
                                                        new Node(6, null)
                                                )
                                        ),
                                        new Node(2, null),
                                        new Node(4, null)
                                )
                        )
                ).solution()
        );
    }

}
