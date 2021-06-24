package services;

import entities.UsersEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class UserDAO {
    private static EntityManagerFactory setupFactory() {
        return Persistence.createEntityManagerFactory("default");
    }

    private static EntityManager setup(EntityManagerFactory factory){
        return factory.createEntityManager();
    }
    public static List<UsersEntity> retrieveUser(){
        EntityManagerFactory factory = setupFactory();
        EntityManager manager = setup(factory);
        return manager.createNativeQuery(("select * FROM users.users"), UsersEntity.class).getResultList();
    }
}
