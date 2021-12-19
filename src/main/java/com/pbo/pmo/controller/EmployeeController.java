package com.pbo.pmo.controller;

import com.pbo.pmo.model.Employee;
import com.pbo.pmo.service.EmployeeDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeController {
    @Autowired
    private EmployeeDomain employeeDomain;

    @PostMapping("/add")
    public String add(@RequestBody Employee employee) {
        employeeDomain.RegisterEmployee(employee);
        return "New Employee is added";
    }

    @GetMapping("/get")
    public List<Employee> list() {
        return employeeDomain.getAllEmployees();
    }
}
