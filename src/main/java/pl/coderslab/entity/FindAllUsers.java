package pl.coderslab.entity;

import pl.coderslab.ConsoleColors;

import static pl.coderslab.entity.MainDao.mainMenu;

public class FindAllUsers {

    public static void main(String[] args) {

        findAllUsers();
    }
    public static void findAllUsers() {
        System.out.println(ConsoleColors.YELLOW + "A full list of users below: " + ConsoleColors.RESET);
        UserDao userDao = new UserDao();
        User[] all = userDao.findAll();
        for (User u : all) {
            System.out.println(u);
        }
        System.out.println();
        mainMenu();
    }
}
