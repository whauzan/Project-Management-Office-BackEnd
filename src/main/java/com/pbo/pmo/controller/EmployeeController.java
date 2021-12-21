package com.pbo.pmo.controller;

import com.pbo.pmo.Pojos.EmployeeRequest;
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

    @GetMapping("/get")
    public List<Employee> list(@RequestBody EmployeeRequest employeeRequest) {
        return employeeDomain.getAllEmployeesById(employeeRequest.company_id);
    }

    @PostMapping("/save")
    public Employee addEmployee(@RequestBody EmployeeRequest employeeRequest) {
        return employeeDomain.addEmployee(employeeRequest);
    }
}
