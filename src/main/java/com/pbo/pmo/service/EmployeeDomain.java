package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.EmployeeRequest;
import com.pbo.pmo.model.Employee;

import java.util.List;

public interface EmployeeDomain {
    List<Employee> getAllEmployeesById(int company_id);
    Employee addEmployee(EmployeeRequest employeeRequest);
}
