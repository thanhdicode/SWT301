package com.thanh.mathutil.core;

import java.util.regex.MatchResult;

public class MathUtil {
    public static long getFactorial(int n) {
        if(n < 0 || n > 20) throw new IllegalArgumentException("n must be between 0 and 20");
        if(n == 0 || n == 1 ) return 1;
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
