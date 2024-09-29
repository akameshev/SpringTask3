package org.project.hometask3.repository;

import org.project.hometask3.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<User> users = new ArrayList<>();
    public List<User> getAllUsers(){
        return users;
    }
}
