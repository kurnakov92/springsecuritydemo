package com.example.springsecuritydemo.service;

import com.example.springsecuritydemo.document.User;


public interface UserSerivce {

    User findUserById(long id);

    String addUser(long id, String name, String surname, String createdDate);

    String updateUser(long id, String name, String surname, String createdDate);

    String findAll();

}
