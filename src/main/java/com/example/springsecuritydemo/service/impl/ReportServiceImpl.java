package com.example.springsecuritydemo.service.impl;

import com.example.springsecuritydemo.service.ReportService;
import org.springframework.stereotype.Service;

@Service
public class ReportServiceImpl implements ReportService {

    @Override
    public String reportCsv(String text) {
        StringBuilder builder =  new StringBuilder();
        setHeader(builder);
        setContent(builder, text);
        return builder.toString();
    }

    private void setHeader(StringBuilder builder) {
        builder.append("id").append(",");
        builder.append("data").append("\n");
    }

    private void setContent(StringBuilder builder, String text) {
        builder.append(0).append(", ");
        builder.append(text).append("\n");
    }
}
