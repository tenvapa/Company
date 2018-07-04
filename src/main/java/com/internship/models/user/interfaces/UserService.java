package com.internship.models.user.interfaces;

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
