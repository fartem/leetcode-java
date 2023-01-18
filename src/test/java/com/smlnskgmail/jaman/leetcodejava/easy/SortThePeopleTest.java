package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortThePeopleTest {

    @Test
    public void defaultTests() {
        assertArrayEquals(
                new String[]{"Mary", "Emma", "John"},
                new SortThePeople(
                        new String[]{"Mary", "John", "Emma"},
                        new int[]{180, 165, 170}
                ).solution()
        );
        assertArrayEquals(
                new String[]{"Bob", "Alice", "Bob"},
                new SortThePeople(
                        new String[]{"Alice", "Bob", "Bob"},
                        new int[]{155, 185, 150}
                ).solution()
        );
    }

}
