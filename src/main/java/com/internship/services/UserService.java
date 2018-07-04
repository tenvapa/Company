package com.internship.services;

import com.internship.models.user.interfaces.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    void writeUserIntoDB(User user);
    List<User> getAllUsers();
    User getUserByName(String name);
    void deleteUser(User user);
    void editUser(User old, User newUs);
}
