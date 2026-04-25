package Repository;

import Model.User;
import java.util.List;
import java.util.Optional;

public interface UserRepository {
    // sauvegarder un utilisateur
    void save(User user);
    // Affiche un id ou rien
    Optional<User> findById(Long id);
    // Lister les utilisateurs
    List<User> findAll();
    // Supprimer l'utilsateur
    void delete(Long id);
}