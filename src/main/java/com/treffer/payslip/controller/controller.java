package com.treffer.payslip.controller;

import com.treffer.payslip.dao.EmployeeRepository;
import com.treffer.payslip.to.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/treffer")
public class controller {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.print("entering");
        List<Employee> employees = this.employeeRepository.findAll();
        Employee test;
        test = this.employeeRepository.findByEmpId(1.0);
        System.out.println(test);
        employees.forEach(employee -> System.out.println(employee.getEmpName()));
        System.out.println("exiting");
        return "hi";
    }
}
