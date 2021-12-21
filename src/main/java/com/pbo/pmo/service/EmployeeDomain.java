package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.EmployeeRequest;
import com.pbo.pmo.model.Employee;

import java.util.List;

public interface EmployeeDomain {
    public List<Employee> getAllEmployeesById(int company_id);
    public Employee addEmployee(EmployeeRequest employeeRequest);
}
