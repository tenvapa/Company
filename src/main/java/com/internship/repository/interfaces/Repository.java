package com.internship.repository.interfaces;


import com.internship.models.user.interfaces.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface Repository {

    List<User> getAllUsers();
    User getUserByName(String name);
    void saveUser(User user);
    void deleteUser(User user);
    void editUser(User oldUser, User newUser);





}
