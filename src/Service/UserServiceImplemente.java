package Service;

import Model.User;
import Repository.UserRepository;

import java.util.List;

// Implemention de l'interface UserService
public class UserServiceImplemente implements UserService{

    // Attribut
    private final UserRepository userRepository;

    // Constructeur
    public UserServiceImplemente(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Ajouter
    public User addUser(User user) {
        return userRepository.save(user);
    }

    // Recuperer
    public User getUser(long id) {
        return userRepository.getUser(id);
    }

    // Lister
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    // Supprimer
    public void deleteUser(long id) {
        userRepository.delete(id);

    }
    // Modifier l'utilsateur
    public User updateUser(long id, User user) {
        return userRepository.updtateUser(id,user);
    }
}
