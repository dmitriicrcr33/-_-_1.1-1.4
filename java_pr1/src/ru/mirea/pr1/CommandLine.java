package ru.mirea.baranov.pr1;

public class CommandLine {
    public static void main(String[] args) {
        if (args.length == 0) { System.out.println("Аргументы не переданы"); return; }
        for (int i = 0; i < args.length; i++) System.out.printf("[%d] %s%n", i, args[i]);
    }
}
