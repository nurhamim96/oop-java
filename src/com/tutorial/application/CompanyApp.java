package com.tutorial.application;

import com.tutorial.data.inner_class.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("PT. JVM Indonesia");

        Company.Employee employee = company.new Employee();
        employee.setName("Ibad Aja");
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
