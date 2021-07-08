package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation
public class PrimeNumberOfSetBitsInBinaryRepresentation {

    private final int left;
    private final int right;

    public PrimeNumberOfSetBitsInBinaryRepresentation(
            int left,
            int right
    ) {
        this.left = left;
        this.right = right;
    }

    public int solution() {
        int result = 0;
        for (int i = left; i <= right; i++) {
            int bits = Integer.bitCount(i);
            if (isPrime(bits)) {
                result++;
            }
        }
        return result;
    }

    private boolean isPrime(int num) {
        if (num == 2 || num == 3) {
            return true;
        }
        if (num <= 1 || num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}
