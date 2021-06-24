import entities.UsersEntity;
import services.LoginChecker;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        UsersEntity user=new UsersEntity();
        user.setUserId(1);
        user.setUsername("Tom");
        user.setPassword("password");
        user.setRole("admin");
        System.out.println(LoginChecker.isValidUser(user));
    }

}
