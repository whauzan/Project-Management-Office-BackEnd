package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.TaskRequest;
import com.pbo.pmo.Pojos.TeamRequest;
import com.pbo.pmo.model.Task;

import java.util.List;

public interface TaskDomain {
    List<Task> getAllTaskByScrumID(int scrum_id);
    Task addTask(TaskRequest taskRequest);
    Task doneTask(int id);
}
