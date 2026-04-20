package Repository;

import Model.User;

import java.util.List;
import java.util.Optional;

// Creation de l'interface Userrepository
public interface UserRepository {

    // Enregistrer l'utilisateur
    public User save(User user);

    // Optional est le conteneur qui permet de contenir : Une valeur ou rien
    public Optional<User> findById(Long id);

    // Lister l'utilisateur
    public List<User> findAll();

    // Supprimer l'utilisateur
    public void delete(Long id);

    // Recuperer l'ulisateur
    public User getUser(long id);
    //modifier l'utilisateur
    public User updtateUser(long id, User user);

    public List<User> getAllUsers();
}
