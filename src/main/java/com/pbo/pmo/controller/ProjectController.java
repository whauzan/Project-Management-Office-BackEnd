package com.pbo.pmo.controller;

import com.pbo.pmo.Pojos.ProjectRequest;
import com.pbo.pmo.model.Project;
import com.pbo.pmo.service.ProjectDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
@CrossOrigin
public class ProjectController {
    @Autowired
    private ProjectDomain projectDomain;

    @PostMapping("/add")
    public Project addProject(@RequestBody ProjectRequest projectRequest) {
        return projectDomain.addProject(projectRequest);
    }

    @GetMapping("/get")
    public List<Project> list() {
        return projectDomain.getProject();
    }
}
