package Repository;

import Model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

// implementation de Userrepository
public class UserRepositoryImplements implements UserRepository{

    private Map<Long,User> baseDonne = new HashMap<>();

    // Enregistrer l'utilisateur
    public User save(User user) {
        baseDonne.put(user.getId(), user);
        return user;
    }

    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    // Lister l'utilisateur
    public List<User> findAll() {
        return baseDonne.values().stream().toList();
    }

    // Supprimer l'utilisateur
    public void delete(Long id) {
        baseDonne.remove(id);}

    // Recuperer l'utilisateur
    public User getUser(long id) {
        return (User) baseDonne.values().stream().toList();
    }

    // Modifier l'utilisateur
    public User updtateUser(long id, User user) {
        if(baseDonne.containsKey(id)){
            baseDonne.put(id,user);
        }
        return user;
    }

    public List<User> getAllUsers() {
        return baseDonne.values().stream().toList();
    }

}
