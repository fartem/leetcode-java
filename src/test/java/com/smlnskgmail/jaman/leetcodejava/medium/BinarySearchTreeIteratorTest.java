package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeIteratorTest {

    @Test
    public void defaultTest() {
        var binarySearchTreeIterator = new BinarySearchTreeIterator(
                new TreeNode(
                        7,
                        new TreeNode(3),
                        new TreeNode(
                                15,
                                new TreeNode(9),
                                new TreeNode(20)
                        )
                )
        );
        assertEquals(
                3,
                binarySearchTreeIterator.next()
        );
        assertEquals(
                7,
                binarySearchTreeIterator.next()
        );
        assertTrue(binarySearchTreeIterator.hasNext());
        assertEquals(
                9,
                binarySearchTreeIterator.next()
        );
        assertTrue(binarySearchTreeIterator.hasNext());
        assertEquals(
                15,
                binarySearchTreeIterator.next()
        );
        assertTrue(binarySearchTreeIterator.hasNext());
        assertEquals(
                20,
                binarySearchTreeIterator.next()
        );
        assertFalse(binarySearchTreeIterator.hasNext());
    }

}
