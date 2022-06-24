package com.learning;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private static final int ADD = 1;
    private static final int EDIT = 2;
    private static final int REMOVE = 3;
    private static final int EXIT = 4;

    private static final List<String> items = new ArrayList<String>(
        List.of(
            "[1] ADD new user.",
            "[2] EDIT user.",
            "[3] REMOVE user.",
            "[4] Exit."
        )
    );

    public void execute() {
        int action = 1;
        do {
            Console.clear();
            Console.out("Welcome to user management Application.", 0, 2);

            this.render();
            action = this.readAction();

            this.handleAction(action);
        } while (action != 4);

        Console.out("Thank you for using our Application.", 1, 1);
    }

    private int readAction() {
        int action = Console.getNumber("Please select your action? ");

        if (action < 1 || action > Menu.items.size()) {
            Console.out("Action number should be between 1 - " + Menu.items.size() + ", ");
            action = this.readAction();
        }

        return action;
    }

    private void handleAction(int action) {
        switch (action) {
            case Menu.ADD:
                Console.out("*We should do operation to add new user in our database*", 1, 1);
                break;
            case Menu.EDIT:
                Console.out("*We should update user information in our database*", 1, 1);
                break;
            case Menu.REMOVE:
                Console.out("*User is not needed we can remove user from our database*", 1, 1);
                break;
            case Menu.EXIT:
                return;
        }

        Console.pressEnterToContinue();
    }

    private void render() {
        for (String item : Menu.items) {
            Console.out(item, 0, 1);
        }
    }
}
