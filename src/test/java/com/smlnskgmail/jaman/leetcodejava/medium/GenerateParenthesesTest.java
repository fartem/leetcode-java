package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GenerateParenthesesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of("()()()", "()(())", "(())()", "(()())", "((()))"),
                new GenerateParentheses(3).solution()
        );
    }

}
