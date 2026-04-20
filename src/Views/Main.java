package Views;

import Controller.UserController;
import Model.User;
import Repository.UserRepository;
import Repository.UserRepositoryImplements;
import Service.UserService;
import Service.UserServiceImplemente;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepositoryImplements();
        UserService userService = new UserServiceImplemente(userRepository);
        UserController userController = new UserController(userService);

        // Creation des Utilisateurs

        User user1 = userController.addUser(new User(12L, "Hinsou", "loumhinsou1@gmail.com"));

        User user2 = userController.addUser(new User(13L, "Hinsou", "loumhinsou1@gmail.com"));
        User user3 = userController.addUser(new User(14L, "Hinsou", "loumhinsou1@gmail.com"));

        List<User> users = userController.getAllUsers();

        for (User user : users){
            System.out.println(user);
        }
    }
}