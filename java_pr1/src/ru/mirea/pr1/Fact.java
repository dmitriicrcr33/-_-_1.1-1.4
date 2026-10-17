package ru.mirea.baranov.pr1;

import java.math.BigInteger;
import java.util.Scanner;

public class Fact {
    public static BigInteger factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n ^< 0");
        BigInteger r = BigInteger.ONE;
        for (int i = 2; i <= n; i++) r = r.multiply(BigInteger.valueOf(i));
        return r;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = "^);
        System.out.println(in.nextInt() + " = " + factorial(in.nextInt()));
    }
}
