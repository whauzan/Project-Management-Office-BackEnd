package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.ProjectManagerRequest;
import com.pbo.pmo.model.ProjectManager;

import java.util.List;

public interface ProjectManagerDomain {
    ProjectManager addProjectManager(ProjectManagerRequest projectRequest);

    List<ProjectManager> getProjectManager();
}
