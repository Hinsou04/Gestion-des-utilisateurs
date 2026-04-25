package Service;

import Model.User;
import Repository.UserRepository;

import java.util.List;

public class UserServiceImplemente implements UserService {

    private UserRepository repository;

    public UserServiceImplemente(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addUser(User user) {
        repository.save(user);
    }

    @Override
    public User getUser(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        repository.delete(id);
    }
}