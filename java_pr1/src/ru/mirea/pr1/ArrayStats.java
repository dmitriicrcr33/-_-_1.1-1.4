package ru.mirea.baranov.pr1;

import java.util.Scanner;

public class ArrayStats {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] fixed = {12, 5, 8, 21, 3, 17};
        System.out.println("Сумма (for): " + sumFor(fixed));
        System.out.printf("Среднее: %.2f%n", average(fixed));
        System.out.print("Сколько чисел введёте? "^);
        int n = in.nextInt();
        int[] data = new int[n];
        int i = 0;
        do { data[i++] = in.nextInt(); } while (i < n);
        System.out.println("Сумма (while): " + sumWhile(data));
        System.out.println("Сумма (do-while): " + sumDoWhile(data));
        System.out.println("Минимум: " + min(data));
        System.out.println("Максимум: " + max(data));
    }
    static int sumFor(int[] a) { int s = 0; for (int i = 0; i < a.length; i++) s += a[i]; return s; }
    static double average(int[] a) { return (double) sumFor(a) / a.length; }
    static int sumWhile(int[] a) { int s = 0, i = 0; while (i < a.length) s += a[i++]; return s; }
    static int sumDoWhile(int[] a) { int s = 0, i = 0; do { s += a[i++]; } while (i < a.length); return s; }
    static int min(int[] a) { int m = a[0]; for (int x : a) if (x < m) m = x; return m; }
    static int max(int[] a) { int m = a[0]; for (int x : a) if (x > m) m = x; return m; }
}
