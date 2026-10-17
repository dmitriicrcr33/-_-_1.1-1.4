package ru.mirea.baranov.pr1;

import java.util.Locale;

public class Harmonic {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) System.out.printf(Locale.US, "H^(%2d^) = %.5f%n", i, 1.0 / i);
    }
}
