package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RepeatedDNASequencesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of("AAAAACCCCC", "CCCCCAAAAA"),
                new RepeatedDNASequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT").solution()
        );
    }

}
