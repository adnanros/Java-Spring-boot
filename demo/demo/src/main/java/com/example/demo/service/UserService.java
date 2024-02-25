package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.api.model.User;

@Service
public class UserService {
    private List<User> users;

   public UserService() {
    users = new ArrayList<User>();
    
    User user1 = new User(1, "John", "John@example.com", 20);
    User user2 = new User(2, "Adnan", "Adnan@example.com", 30);

    users.add(user1);
    users.add(user2);

   }

   public Optional<User> getUser(Integer id) {
    Optional<User> optional = Optional.empty();
    for(User user : users){
        if (id == user.getId()){ 
            optional = Optional.of(user);
            return optional;
         }
    }
    return optional;
   }

   public List<User> getUsers() {
     
    return users;
   }

}
