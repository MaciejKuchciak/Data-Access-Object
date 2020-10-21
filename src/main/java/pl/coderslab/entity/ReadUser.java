package pl.coderslab.entity;

import pl.coderslab.ConsoleColors;
import java.util.Scanner;
import static pl.coderslab.entity.MainDao.mainMenu;

public class ReadUser {

    public static void readUser() {
        UserDao userDao = new UserDao();
        System.out.println(ConsoleColors.YELLOW + "Please provide user id to display: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Invalid data. Select again.");
        }
        int id = scanner.nextInt();
        User user = userDao.read(id);
        System.out.println("User ID: " + id + ConsoleColors.RESET);
        System.out.println(user);
        System.out.println();
        mainMenu();
    }
}
