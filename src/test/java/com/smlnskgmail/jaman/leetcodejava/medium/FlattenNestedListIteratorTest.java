package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FlattenNestedListIteratorTest {

    @Test
    public void defaultTest() {
        var flattenNestedListIterator = new FlattenNestedListIterator(
                Arrays.asList(
                        new FlattenNestedListIterator.NestedInteger(
                                Arrays.asList(
                                        new FlattenNestedListIterator.NestedInteger(1),
                                        new FlattenNestedListIterator.NestedInteger(1)
                                )
                        ),
                        new FlattenNestedListIterator.NestedInteger(2),
                        new FlattenNestedListIterator.NestedInteger(
                                Arrays.asList(
                                        new FlattenNestedListIterator.NestedInteger(1),
                                        new FlattenNestedListIterator.NestedInteger(1)
                                )
                        )
                )
        );
        assertEquals(1, flattenNestedListIterator.next().intValue());
        assertEquals(1, flattenNestedListIterator.next().intValue());
        assertEquals(2, flattenNestedListIterator.next().intValue());
        assertEquals(1, flattenNestedListIterator.next().intValue());
        assertEquals(1, flattenNestedListIterator.next().intValue());
        assertFalse(flattenNestedListIterator.hasNext());
    }

}
