package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.concurrent.Semaphore;

// https://leetcode.com/problems/print-foobar-alternately/
public class PrintFooBarAlternately {

    private final Semaphore foo = new Semaphore(1);
    private final Semaphore bar = new Semaphore(0);
    private final int n;

    public PrintFooBarAlternately(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            foo.acquire();
            printFoo.run();
            bar.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            bar.acquire();
            printBar.run();
            foo.release();
        }
    }

}
