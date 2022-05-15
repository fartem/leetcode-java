package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// https://leetcode.com/problems/flatten-nested-list-iterator
public class FlattenNestedListIterator implements Iterator<Integer> {

    private final List<Integer> values = new ArrayList<>();
    private int pointer = 0;

    public FlattenNestedListIterator(List<NestedInteger> nestedList) {
        prepare(nestedList, values);
    }

    private void prepare(List<NestedInteger> nestedList, List<Integer> values) {
        for (NestedInteger nestedInteger : nestedList) {
            if (!nestedInteger.isInteger()) {
                prepare(nestedInteger.getList(), values);
            } else {
                values.add(nestedInteger.getInteger());
            }
        }
    }

    @Override
    public Integer next() {
        return values.get(pointer++);
    }

    @Override
    public boolean hasNext() {
        return pointer < values.size();
    }

    public static class NestedInteger {
        private final boolean isInteger;
        private int integer;
        private List<NestedInteger> nestedIntegers;

        public NestedInteger(int integer) {
            this.isInteger = true;
            this.integer = integer;
        }

        public NestedInteger(List<NestedInteger> nestedIntegers) {
            this.isInteger = false;
            this.nestedIntegers = nestedIntegers;
        }

        public boolean isInteger() {
            return isInteger;
        }

        public Integer getInteger() {
            return integer;
        }

        public List<NestedInteger> getList() {
            return nestedIntegers;
        }
    }

}
