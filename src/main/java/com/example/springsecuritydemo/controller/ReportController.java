package com.example.springsecuritydemo.controller;

import com.example.springsecuritydemo.service.ReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @RequestMapping("demo")
    public String demo() {
        return "Hello";
    }

    @RequestMapping(value = "report.csv", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public String getReportCsv(@RequestParam String text){
        String result = "";
        if (text != null) {
            result = reportService.reportCsv(text);
        } else {
            result = "Текста нет";
        }
        return result;
    }


}
