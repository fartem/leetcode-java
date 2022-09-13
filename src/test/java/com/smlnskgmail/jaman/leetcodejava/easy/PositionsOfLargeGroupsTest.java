package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PositionsOfLargeGroupsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of(Arrays.asList(3, 6)),
                new PositionsOfLargeGroups("abbxxxxzyy").solution()
        );
    }

}
