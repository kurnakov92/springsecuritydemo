package com.example.springsecuritydemo.repository;

import com.example.springsecuritydemo.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {

    User findById(long id);

}
