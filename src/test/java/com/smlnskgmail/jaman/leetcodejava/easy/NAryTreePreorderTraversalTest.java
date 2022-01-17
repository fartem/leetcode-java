package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.Node;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

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
                                                                        5, Collections.emptyList()),
                                                                new Node(
                                                                        6,
                                                                        Collections.emptyList()))),
                                                new Node(2, Collections.emptyList()),
                                                new Node(4, Collections.emptyList()))))
                        .solution());
    }
}
