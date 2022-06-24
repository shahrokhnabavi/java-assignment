package com.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static final List<String> items = new ArrayList<String>(
        List.of(
            "[1] ADD new user.",
            "[2] EDIT user.",
            "[3] REMOVE user.",
            "[4] Exit."
        )
    );

    public void execute() {
        int selectedItem = 1;
        do {
            this.clearConsole();
            System.out.println("Welcome to user management Application.\n");

            if (selectedItem < 1 || selectedItem > Menu.items.size()) {
                System.out.println("Number should be between 1 - " + Menu.items.size());
            }

            selectedItem = this.render();
            this.operate(selectedItem);
        } while (selectedItem != 4);

        System.out.println("\nThank you for using our Application.");
    }

    private void operate(int selectedItem) {
        switch (selectedItem) {
            case 1:
                System.out.println("\n*We should do operation to add new user in our database*");
                this.pressAnyKey();
                break;
            case 2:
                System.out.println("\n*We should update user information in our database*");
                this.pressAnyKey();
                break;
            case 3:
                System.out.println("\n*User is not needed we can remove user from our database*");
                this.pressAnyKey();
                break;
        }
    }

    private int render() {
        for (String item : Menu.items) {
            System.out.println(item);
        }
        System.out.print("Please select your action? ");

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    private void pressAnyKey() {
        try {
            System.out.println("Press any key to continue.");
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
