package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeleteColumnsToMakeSortedTest {

    @Test
    public void defaultTests() {
        assertEquals(1, new DeleteColumnsToMakeSorted(new String[]{"cba", "daf", "ghi"}).solution());
        assertEquals(0, new DeleteColumnsToMakeSorted(new String[]{"a", "b"}).solution());
        assertEquals(3, new DeleteColumnsToMakeSorted(new String[]{"zyx", "wvu", "tsr"}).solution());
    }

}
