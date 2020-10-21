package pl.coderslab.entity;

import pl.coderslab.ConsoleColors;

import java.util.Scanner;

import static pl.coderslab.entity.MainDao.mainMenu;

public class DeleteUser {

    public static void deleteUser() {
        UserDao userDao = new UserDao();
        System.out.println(ConsoleColors.YELLOW + "Please provide user id to be removed: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Invalid data. Select again.");
        }
        int id = scanner.nextInt();
        userDao.delete(id);
        System.out.println("User ID: " + id + " removed from database!" + ConsoleColors.RESET + "\n");
        mainMenu();
    }

}
