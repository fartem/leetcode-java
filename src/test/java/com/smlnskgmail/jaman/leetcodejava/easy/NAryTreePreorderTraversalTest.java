package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.Node;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class NAryTreePreorderTraversalTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(1, 3, 5, 6, 2, 4),
                new NAryTreePreorderTraversal(
                        new Node(
                                1,
                                Arrays.asList(
                                        new Node(
                                                3,
                                                Arrays.asList(
                                                        new Node(
                                                                5,
                                                                Collections.emptyList()
                                                        ),
                                                        new Node(
                                                                6,
                                                                Collections.emptyList()
                                                        )
                                                )
                                        ),
                                        new Node(
                                                2,
                                                Collections.emptyList()
                                        ),
                                        new Node(
                                                4,
                                                Collections.emptyList()
                                        )
                                )
                        )
                ).solution()
        );
    }

}
