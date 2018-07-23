package com.example.springsecuritydemo.controller;

import com.example.springsecuritydemo.service.UserSerivce;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserSerivce serivce;

    @RequestMapping("findUserById")
    public String findUserById(@RequestParam long id) {
        return serivce.findUserById(id).toString();
    }

    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public String addUser(@RequestParam long id, @RequestParam String name, @RequestParam String surname,
                          @RequestParam String date) {
        return serivce.addUser(id, name, surname, date);
    }

    @RequestMapping(value = "updateUser", method = RequestMethod.PUT)
    public String updateUser(@RequestParam long id, @RequestParam String name, @RequestParam String surname,
                             @RequestParam String date) {
        return serivce.updateUser(id, name, surname, date);
    }

    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    public String findAll(){
        return serivce.findAll();
    }
}
