package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RandomPickIndexTest {

    @Test
    public void defaultTest() {
        var randomPickIndex = new RandomPickIndex(new int[]{1, 2, 3, 3, 3});
        assertEquals(0, randomPickIndex.solution(1));
        assertEquals(1, randomPickIndex.solution(2));

        int indexForDuplicate = randomPickIndex.solution(3);
        assertTrue(indexForDuplicate > 0 && indexForDuplicate < 5);
    }

}
