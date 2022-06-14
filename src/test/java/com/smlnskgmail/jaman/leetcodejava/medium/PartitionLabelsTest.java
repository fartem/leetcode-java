package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PartitionLabelsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of(9, 7, 8),
                new PartitionLabels("ababcbacadefegdehijhklij").solution()
        );
    }

}
