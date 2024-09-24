package com.thanh.mathutil.main;

import com.thanh.mathutil.core.MathUtil;
import org.junit.Test;

public class Main {
    public static void main(String[] args) {
        long actual = MathUtil.getFactorial(5);

        System.out.println(actual);
    }
}