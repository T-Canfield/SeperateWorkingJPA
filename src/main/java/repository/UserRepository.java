package repository;



import entities.UsersEntity;
import services.UserDAO;

import java.util.List;

public class UserRepository {
    private List<UsersEntity> users;
    UserDAO dao = new UserDAO();
    public List<UsersEntity> getUsers() {
        users = dao.retrieveUser();
        System.out.println(users);
        return users;
    }

}
