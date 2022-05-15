package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Iterator;

// https://leetcode.com/problems/peeking-iterator
public class PeekingIterator implements Iterator<Integer> {

    private final Iterator<Integer> iterator;
    private boolean isInPeek;
    private int peekNum = 0;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    public Integer peek() {
        if (!isInPeek) {
            peekNum = iterator.next();
            isInPeek = true;
        }
        return peekNum;
    }

    @Override
    public Integer next() {
        if (isInPeek) {
            isInPeek = false;
            return peekNum;
        }
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        if (isInPeek) {
            return true;
        }
        return iterator.hasNext();
    }

}
