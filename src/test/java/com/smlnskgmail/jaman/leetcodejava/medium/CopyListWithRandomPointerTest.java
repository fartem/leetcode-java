package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNodeWithRandom;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CopyListWithRandomPointerTest {

    @Test
    public void defaultTest() {
        var first = new ListNodeWithRandom(7);
        var second = new ListNodeWithRandom(13);
        var third = new ListNodeWithRandom(11);
        var fourth = new ListNodeWithRandom(10);
        var fifth = new ListNodeWithRandom(1);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        second.random = first;
        third.random = fifth;
        fourth.random = third;
        fifth.random = first;

        assertTrue(
                ListNodeWithRandom.areEqual(
                        first,
                        new CopyListWithRandomPointer(first).solution()
                )
        );
    }

}
