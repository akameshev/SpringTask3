package org.project.hometask3.services;

import org.project.hometask3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserRepository getUserRepository(){
        return userRepository;
    }
}
