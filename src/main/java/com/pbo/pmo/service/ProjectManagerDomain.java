package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.ProjectManagerRequest;
import com.pbo.pmo.model.ProjectManager;

import java.util.List;

public interface ProjectManagerDomain {
    ProjectManager registProjectManager(ProjectManagerRequest projectRequest);

    List<ProjectManager> getProjectManager();
}
