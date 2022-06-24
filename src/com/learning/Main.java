package com.learning;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> menuItem = List.of(
            "[1] ADD new user.",
            "[2] EDIT user.",
            "[3] REMOVE user.",
            "[4] Exit."
        );

        Menu menu = new Menu(menuItem);

        menu.execute();
    }
}
