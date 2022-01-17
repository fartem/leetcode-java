package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.Node;
import java.util.Arrays;
import org.junit.Test;

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
                                                        3, Arrays.asList(new Node(5), new Node(6))),
                                                new Node(2),
                                                new Node(4))))
                        .solution());
    }
}
