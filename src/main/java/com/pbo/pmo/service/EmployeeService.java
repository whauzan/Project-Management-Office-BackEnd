package com.pbo.pmo.service;

import com.pbo.pmo.model.Employee;
import com.pbo.pmo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements EmployeeDomain {
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public Employee RegisterEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
