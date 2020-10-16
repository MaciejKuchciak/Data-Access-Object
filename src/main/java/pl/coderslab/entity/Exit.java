package pl.coderslab.entity;

import pl.coderslab.ConsoleColors;

public class Exit {

    public static void main(String[] args) {
        exit();
    }

    public static void exit() {
        System.out.println("\n"+ ConsoleColors.YELLOW + "EXIT");
        System.out.println(ConsoleColors.YELLOW + "Program closed!");
        System.out.print(ConsoleColors.RESET);
        System.exit(0);
    }
}
