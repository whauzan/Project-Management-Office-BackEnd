package com.pbo.pmo.controller;


import com.pbo.pmo.Pojos.ProjectManagerRequest;
import com.pbo.pmo.model.ProjectManager;
import com.pbo.pmo.service.ProjectManagerDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projectManager")
@CrossOrigin
public class ProjectManagerController {
    @Autowired
    private ProjectManagerDomain projectManagerDomain;

    @PostMapping("/add")
    public ProjectManager addProjectManager(@RequestBody ProjectManagerRequest projectManagerRequest){
        return projectManagerDomain.addProjectManager(projectManagerRequest);
    }

    @GetMapping("/get")
    public List<ProjectManager> list() { return projectManagerDomain.getProjectManager(); }
}
