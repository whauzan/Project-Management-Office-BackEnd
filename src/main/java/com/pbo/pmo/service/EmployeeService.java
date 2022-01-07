package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.EmployeeRequest;
import com.pbo.pmo.model.Company;
import com.pbo.pmo.model.Employee;
import com.pbo.pmo.repository.CompanyRepository;
import com.pbo.pmo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements EmployeeDomain {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Employee> getAllEmployeesById(int company_id) {
        return employeeRepository.findAllByCompanyId(company_id);
    }

    @Override
    public Employee addEmployee(EmployeeRequest employeeRequest) {
        Company company = companyRepository.findById(employeeRequest.company_id)
                        .orElseThrow(() -> new IllegalStateException(
                                "company with id " + employeeRequest.company_id + " does not exist"
                        ));

        Employee employee = new Employee();
        employee.setName(employeeRequest.name);
        employee.setGender(employeeRequest.gender);
        employee.setEmail(employeeRequest.email);
        employee.setAddress(employeeRequest.address);
        employee.setPhoneNumber(employeeRequest.phoneNumber);
        employee.setCompany_id(company.getId());
        return employeeRepository.save(employee);
    }
}
