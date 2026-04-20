package Controller;

import Model.User;
import Service.UserService;

import java.util.List;

public class UserController {
    private static UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // ajouter l'utilisateur
    public User addUser(User user){
        userService.addUser(user);
        return user;
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Recuper l'utilisateur
    public User getUser (long id, User user){
        return userService.getUser(id);
    }

    // Supprimer l'utilisateur
    public void deleteUser (long id){
        userService.deleteUser(id);
    }
}
