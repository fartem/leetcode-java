package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.Node;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

public class NAryTreeLevelOrderTraversalTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(List.of(1), Arrays.asList(3, 2, 4), Arrays.asList(5, 6)),
                new NAryTreeLevelOrderTraversal(
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
