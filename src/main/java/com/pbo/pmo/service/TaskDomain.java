package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.TeamRequest;
import com.pbo.pmo.model.Task;

import java.util.List;

public interface TaskDomain {
    List<Task> getAllTaskByScrumID();
    Task addTask(TeamRequest teamRequest);
    Task editStatus(Integer id);

}
