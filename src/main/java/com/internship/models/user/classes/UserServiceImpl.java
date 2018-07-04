package com.internship.models.user.classes;

import com.internship.models.user.interfaces.User;
import com.internship.models.user.interfaces.UserService;
import com.internship.repository.interfaces.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private Repository repository;



    @Override
    public void writeUserIntoDB(User user) {
        this.repository.saveUser(user);
    }

    @Override
    public List<User> getAllUsers() {

        return this.repository.getAllUsers();
    }

    @Override
    public User getUserByName(String name) {
        return this.repository.getUserByName(name);
    }

    @Override
    public void deleteUser(User user) {
        this.repository.deleteUser(user);
    }

    @Override
    public void editUser(User old, User newUs) {
        this.repository.editUser(old, newUs);
    }
}
