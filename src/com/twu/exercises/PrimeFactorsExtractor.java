package com.twu.exercises;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsExtractor {
    public List<Integer> generate(int number) {
        if (number < 0) throw new IllegalArgumentException("Number should not be negative.");
        int n = number;
        List<Integer> factors = new ArrayList<>();
        for (int factor = 2; n / factor > 0; factor++) {
            while (n % factor == 0 ) {
                factors.add(factor);
                n /= factor;
            }
        }
        return factors;
    }
}
