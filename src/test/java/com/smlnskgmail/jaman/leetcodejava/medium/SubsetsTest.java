package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SubsetsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(
                        Collections.emptyList(),
                        List.of(1),
                        List.of(2),
                        Arrays.asList(1, 2),
                        List.of(3),
                        Arrays.asList(1, 3),
                        Arrays.asList(2, 3),
                        Arrays.asList(1, 2, 3)
                ),
                new Subsets(new int[]{1, 2, 3}).solution()
        );
    }

}
