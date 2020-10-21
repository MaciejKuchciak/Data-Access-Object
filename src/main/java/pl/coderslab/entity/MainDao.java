package pl.coderslab.entity;

import pl.coderslab.ConsoleColors;
import java.util.Scanner;
import static pl.coderslab.entity.CreateUser.createUser;
import static pl.coderslab.entity.DeleteUser.deleteUser;
import static pl.coderslab.entity.Exit.exit;
import static pl.coderslab.entity.FindAllUsers.findAllUsers;
import static pl.coderslab.entity.ReadUser.readUser;
import static pl.coderslab.entity.UpdateUser.updateUser;

public class MainDao {

    public static void main(String[] args) {

        mainMenu();

    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.YELLOW + "Please select a number of an option:" + ConsoleColors.RESET);

        System.out.println("1. Add a new user to database");
        System.out.println("2. Read selected record from database");
        System.out.println("3. Update selected record in database");
        System.out.println("4. Delete selected record from database");
        System.out.println("5. Read all users from database");
        System.out.println("6. Close program");

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Invalid data. Select again.");
        }
        int chosenOption = Integer.parseInt(scanner.next());
        switch (chosenOption) {
            case 1:
                createUser();
                break;
            case 2:
                readUser();
                break;
            case 3:
                updateUser();
                break;
            case 4:
                deleteUser();
                break;
            case 5:
                findAllUsers();
                break;
            case 6:
                exit();
                break;
            default:
                System.out.println(ConsoleColors.YELLOW + "Please select valid option.\n" + ConsoleColors.RESET);
                mainMenu();
        }
    }
}
