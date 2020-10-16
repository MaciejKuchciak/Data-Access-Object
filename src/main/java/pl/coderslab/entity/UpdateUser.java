package pl.coderslab.entity;

import pl.coderslab.ConsoleColors;

import java.util.Scanner;

import static pl.coderslab.entity.MainDao.mainMenu;

public class UpdateUser {

    public static void main(String[] args) {

        updateUser();
    }
    public static void updateUser() {
        UserDao userDao = new UserDao();
        System.out.println(ConsoleColors.YELLOW + "Please provide user id to be updated: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Invalid data. Select again.");
        }
        int id = scanner.nextInt();
        User userToUpdate = userDao.read(id);
        System.out.println("Please provide user new name: ");
        String name = scanner.nextLine(); // 2 razy wrzucony nextLine, bo po nextInt() lub next() scanner.nextLine() jest pomijany...
        name = scanner.nextLine();
        userToUpdate.setUserName(name);
        System.out.println("Please provide user new e-mail: ");
        String email = scanner.nextLine();
        userToUpdate.setEmail(email);
        System.out.println("Please provide user new password: ");
        String password = scanner.nextLine();
        userToUpdate.setPassword(password);
        userDao.update(userToUpdate);
        System.out.println("User ID: " + id + " updated in database!" + ConsoleColors.RESET + "\n");
        mainMenu();
    }

}
