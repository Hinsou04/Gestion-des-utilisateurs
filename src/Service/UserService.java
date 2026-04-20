package Service;

import Model.User;

import java.util.List;

//Creation de l'interface UserService
public interface UserService {

    // Ajouter Utilisateur
    public User addUser(User user);

    // Afficher l'utilisateur
    public User getUser(long id);

    // Lister tous les utilisateur
    public List<User> getAllUsers();

    // Supprimer l'ulisateur
    public void deleteUser(long id);

}
