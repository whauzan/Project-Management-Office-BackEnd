package com.pbo.pmo.repository;

import com.pbo.pmo.model.ProjectManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectManagerRepository extends JpaRepository<ProjectManager,Integer> {
}
