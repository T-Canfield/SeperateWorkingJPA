package services;

import entities.UsersEntity;
import repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LoginChecker {

    public static boolean isValidUser(UsersEntity user) {
        UserRepository userRepository = new UserRepository();
        List<UsersEntity> users = userRepository.getUsers();
        System.out.println(users);
        for (UsersEntity userToCheck:
             users) {
            if(userToCheck.equals(user)){
                System.out.println(userToCheck.getUsername());
                return true;
            }



        }
        return false;
    }
}
