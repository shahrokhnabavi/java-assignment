package com.learning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to user management Application.");
        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        String message ="please enter a number between 1 to 4. \n";

        int actionNumber = 0;
        while (actionNumber != 4) {
//            clearConsole();
            System.out.println(message +
                    "[1] ADD new user. \n" +
                    "[2] Edit user. \n" +
                    "[3] Remove user. \n" +
                    "[4] Exit. \n" +
                    "what is your action?");

            try {
                actionNumber = scanner.nextInt();
                switch (actionNumber) {
                    case 1:
                        addNewUser();
                        break;
                    case 2:
                        editUser();
                        break;
                    case 3:
                        removeUser();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println(message);
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println(message);
                scanner.next();
            }
        }
    }

    private static void removeUser() {
        //TODO
        System.out.println("removed a user");
    }

    private static void editUser() {
        //TODO
        System.out.println("edited a user");
    }

    private static void addNewUser() {
        //TODO
        System.out.println("added a user");
    }

//    public static void clearConsole() {
//        try {
//            String operatingSystem = System.getProperty("os.name");
//
//            if (operatingSystem.contains("Windows")) {
//                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//            } else {
//                new ProcessBuilder("clear").inheritIO().start().waitFor();
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }

}
