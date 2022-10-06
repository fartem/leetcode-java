package com.smlnskgmail.jaman.leetcodejava.support;

public class Pair<T, K> {

    private final T key;
    private final K value;

    public Pair(T key, K value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public K getValue() {
        return value;
    }

}
