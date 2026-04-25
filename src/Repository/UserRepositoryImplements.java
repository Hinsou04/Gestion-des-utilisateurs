package Repository;

import Model.User;
import java.util.*;

public class UserRepositoryImplements implements UserRepository {

    // Base de donnee fictive
    private Map<Long, User> database = new HashMap<>();

    @Override
    // Sauvegarder l'utilisateur
    public void save(User user) {
        database.put(user.getId(), user);
    }

    @Override
    // rechercher un utilisateur par son id
    public Optional<User> findById(Long id) {
        return Optional.ofNullable(database.get(id));
    }

    @Override
    // Afficher l'utilisateur
    public List<User> findAll() {
        return new ArrayList<>(database.values());
    }

    @Override
    // Supprimer l'utilisateur
    public void delete(Long id) {
        database.remove(id);
    }
}