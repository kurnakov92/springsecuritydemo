package com.example.springsecuritydemo.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Users")
@Data
public class User {

    @Id
    private Long id;

    @Field("Name")
    private String name;

    @Field("Surname")
    private String surname;

    @Field("Creating_Date")
    private String creatingDate;



}
