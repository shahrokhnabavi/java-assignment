package com.learning;

import java.util.Scanner;

final public class Console {
    private static Scanner scanner;

    public static void out(String message) {
        System.out.print(message);
    }

    public static void out(String message, int newLineBefore) {
        for (int i = 0; i < newLineBefore; i++) {
            message = "\n" + message;
        }

        Console.out(message);
    }

    public static void out(String message, int newLineBefore, int newLineAfter) {
        for (int i = 0; i < newLineAfter; i++) {
            message = message + "\n";
        }

        Console.out(message, newLineBefore);
    }

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void pressEnterToContinue() {
        System.out.println("Press Enter to continue.");

        Console.getScanner().nextLine();
        Console.getScanner().nextLine();
    }

    public static int getNumber(String message) {
        System.out.print(message);

        return Console.getScanner().nextInt();
    }

    private static Scanner getScanner() {
        if (Console.scanner == null) {
            Console.scanner = new Scanner(System.in);
        }

        return Console.scanner;
    }
}
