package com.spring.core.SrcCode.assignment.javaconfig;

public class PostgreSQLDataSource implements DataSource {

    @Override
    public String[] getEmails() {

        String[] emails = {"ramesh@gmail.com", "tony@gmail.com", "john@gmail.com"};

        return emails;
    }
}
