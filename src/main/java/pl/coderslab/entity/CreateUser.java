package pl.coderslab.entity;

import pl.coderslab.ConsoleColors;

import java.util.Scanner;

import static pl.coderslab.entity.MainDao.mainMenu;

public class CreateUser {

    public static void main(String[] args) {
        createUser();
    }

    public static void createUser() {
        UserDao userDao = new UserDao();
        User user = new User();
        System.out.println(ConsoleColors.YELLOW + "Please provide user name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        user.setUserName(name);
        System.out.println("Please provide user e-mail: ");
        String email = scanner.nextLine();
        user.setEmail(email);
        System.out.println("Please provide user password: ");
        String password = scanner.nextLine();
        user.setPassword(password);
        userDao.create(user);
        System.out.println("User successfully added into database!" + ConsoleColors.RESET + "\n");
        mainMenu();

    }
}
