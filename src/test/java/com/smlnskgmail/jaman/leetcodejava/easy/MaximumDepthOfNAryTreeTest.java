package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.Node;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MaximumDepthOfNAryTreeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new MaximumDepthOfNAryTree(
                        new Node(
                                1,
                                Arrays.asList(
                                        new Node(
                                                3,
                                                Arrays.asList(
                                                        new Node(5),
                                                        new Node(6)
                                                )
                                        ),
                                        new Node(2),
                                        new Node(4)
                                )
                        )
                ).solution()
        );
    }

}
