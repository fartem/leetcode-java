package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.concurrent.Semaphore;

// https://leetcode.com/problems/print-in-order/
public class PrintInOrder {

    private final Semaphore s1 = new Semaphore(1);
    private final Semaphore s2 = new Semaphore(2);

    public PrintInOrder() {
        try {
            s1.acquire();
            s2.acquire();
        } catch (InterruptedException ignored) {

        }
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        s1.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        s1.acquire();
        printSecond.run();
        s2.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        s2.acquire();
        printThird.run();
    }

}
