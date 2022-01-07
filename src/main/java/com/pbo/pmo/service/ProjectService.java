package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.ProjectRequest;
import com.pbo.pmo.model.Customer;
import com.pbo.pmo.model.Project;
import com.pbo.pmo.repository.CustomerRepository;
import com.pbo.pmo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService implements ProjectDomain {
    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Project addProject(ProjectRequest projectRequest) {
        Project project = new Project();
        project.setName(projectRequest.name);
        project.setType(projectRequest.type);
        project.setTechnolgy(projectRequest.technology);
        project.setPrice(projectRequest.price);
        project.setDuedate(projectRequest.duedate);
        project.setProject_manager_id(projectRequest.project_manager_id);
        projectRepository.save(project);

        Customer customer = customerRepository.findById(projectRequest.customer_id)
                .orElseThrow(() -> new IllegalStateException(
                        "customer with id " + projectRequest.customer_id + " does not exist"
                ));
        customer.setProject(project);
        customerRepository.save(customer);
        return project;
    }

    @Override
    public List<Project> getProject() {
        return projectRepository.findAll();
    }
}
