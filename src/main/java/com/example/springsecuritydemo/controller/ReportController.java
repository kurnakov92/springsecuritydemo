package com.example.springsecuritydemo.controller;

import com.example.springsecuritydemo.service.ReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("report")
public class ReportController {

    @Autowired
    private ReportService service;

    @RequestMapping("demo")
    public String demo(){
        return "Hello";
    }


}
