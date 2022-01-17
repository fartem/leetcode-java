package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class PositionsOfLargeGroupsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of(Arrays.asList(3, 6)), new PositionsOfLargeGroups("abbxxxxzyy").solution());
    }
}
