package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrintInOrderTest {

    @Test
    public void defaultTest() throws InterruptedException {
        StringBuilder output = new StringBuilder();
        Runnable first = () -> output.append("first");
        Runnable second = () -> output.append("second");
        Runnable third = () -> output.append("third");
        PrintInOrder printInOrder = new PrintInOrder();
        printInOrder.first(first);
        printInOrder.second(second);
        printInOrder.third(third);
        assertEquals("firstsecondthird", output.toString());
    }
}
