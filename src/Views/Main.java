package Views;

import Controller.UserController;
import Repository.UserRepositoryImplements;
import Service.UserServiceImplemente;

public class Main {
    public static void main(String[] args) {

        UserRepositoryImplements repository = new UserRepositoryImplements();
        UserServiceImplemente service = new UserServiceImplemente(repository);
        UserController controller = new UserController(service);

        controller.start();
    }
}