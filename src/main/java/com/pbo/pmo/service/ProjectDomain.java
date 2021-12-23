package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.ProjectRequest;
import com.pbo.pmo.model.Project;

import java.util.List;

public interface ProjectDomain {
    Project addProject(ProjectRequest projectRequest);

    List<Project> getProject();
}
