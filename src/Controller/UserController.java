package Controller;

import Model.User;
import Service.UserService;

import java.util.List;
import java.util.Scanner;

public class UserController {

    private UserService service;
    private Scanner scanner = new Scanner(System.in);

    public UserController(UserService service) {
        this.service = service;
    }

    public void start() {
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Ajouter utilisateur");
            System.out.println("2. Afficher utilisateur par ID");
            System.out.println("3. Afficher tous");
            System.out.println("4. Supprimer utilisateur");
            System.out.println("0. Quitter");
            System.out.print("Choix: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addUser();
                case 2 -> getUser();
                case 3 -> getAllUsers();
                case 4 -> deleteUser();
                case 0 -> System.out.println("Au revoir !");
                default -> System.out.println("Choix invalide !");
            }

        } while (choice != 0);
    }

    private void addUser() {
        System.out.print("ID: ");
        Long id = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Nom: ");
        String name = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        User user = new User(id, name, email);
        service.addUser(user);

        System.out.println("Utilisateur ajouté !");
    }

    private void getUser() {
        System.out.print("ID: ");
        Long id = scanner.nextLong();

        try {
            User user = service.getUser(id);
            System.out.println(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void getAllUsers() {
        List<User> users = service.getAllUsers();
        users.forEach(System.out::println);
    }

    private void deleteUser() {
        System.out.print("ID: ");
        Long id = scanner.nextLong();

        service.deleteUser(id);
        System.out.println("Utilisateur supprimé !");
    }
}