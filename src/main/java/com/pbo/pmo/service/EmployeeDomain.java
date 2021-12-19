package com.pbo.pmo.service;

import com.pbo.pmo.model.Employee;

import java.util.List;

public interface EmployeeDomain {
    public Employee RegisterEmployee(Employee employee);
    public List<Employee> getAllEmployees();
}
