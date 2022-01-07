package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.ProjectManagerRequest;
import com.pbo.pmo.model.Employee;
import com.pbo.pmo.model.ProjectManager;
import com.pbo.pmo.repository.EmployeeRepository;
import com.pbo.pmo.repository.ProjectManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectManagerService implements ProjectManagerDomain {
    @Autowired
    private ProjectManagerRepository projectManagerRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public ProjectManager registProjectManager(ProjectManagerRequest projectManagerRequest){
        Employee employee = employeeRepository.findById(projectManagerRequest.employee_id)
                .orElseThrow(() -> new IllegalStateException(
                        "employee with id " + projectManagerRequest.employee_id + " does not exist"
                ));

        ProjectManager projectManager = new ProjectManager();
        projectManager.setName(employee.getName());
        projectManager.setAddress(employee.getAddress());
        projectManager.setGender(employee.getGender());
        projectManager.setId(employee.getId());
        projectManager.setEmail(employee.getEmail());
        projectManager.setPhoneNumber(employee.getPhoneNumber());
        projectManagerRepository.save(projectManager);
        return projectManager;
    }
    @Override
    public List<ProjectManager> getProjectManager() {
        return projectManagerRepository.findAll();
    }
}
