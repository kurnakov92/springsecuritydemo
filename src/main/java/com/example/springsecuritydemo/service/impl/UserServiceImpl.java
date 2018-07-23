package com.example.springsecuritydemo.service.impl;

import com.example.springsecuritydemo.document.User;
import com.example.springsecuritydemo.repository.UserRepository;
import com.example.springsecuritydemo.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserSerivce {

    @Autowired
    private UserRepository repository;

    @Override
    public User findUserById(long id) {
        return repository.findById(id);
    }

    @Override
    public String addUser(long id, String name, String surname, String createdDate) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setSurname(surname);
        user.setCreatingDate(createdDate);
        return repository.save(user).toString() + " saved successfully";
    }

    @Override
    public String updateUser(long id, String name, String surname, String createdDate) {
        User user = repository.findById(id);
        user.setName(name);
        user.setSurname(surname);
        user.setCreatingDate(createdDate);
        return repository.save(user).toString() + "updated successfully";
    }

    @Override
    public String findAll() {
        return repository.findAll().toString();
    }
}
