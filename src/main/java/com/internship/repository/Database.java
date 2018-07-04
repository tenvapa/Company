package com.internship.repository;


import com.internship.models.user.interfaces.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Database implements com.internship.repository.Repository {

    private List<User> users;

    public Database(){
        this.users = new ArrayList<>();
    }


    @Override
    public List<User> getAllUsers() {
        return this.users;
    }

    @Override
    public User getUserByName(String name) {

        return this.users.stream()
                .filter((User user) -> user.getName().equals(name))
                .findFirst()
                .get();
                //Get The First User Found
    }

    @Override
    public void saveUser(User user) {
            this.users.add(user);
    }

    @Override
    public void deleteUser(User user) {
        this.users.remove(user);
    }

    @Override
    public void editUser(User oldUser, User newUser) {
        this.users.set(this.users.indexOf(oldUser) , newUser);

    }
}
