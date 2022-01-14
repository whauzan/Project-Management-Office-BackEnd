package com.pbo.pmo.controller;

import com.pbo.pmo.Pojos.TaskRequest;
import com.pbo.pmo.model.Task;
import com.pbo.pmo.service.TaskDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
@CrossOrigin
public class TaskController {

    @Autowired
    private TaskDomain taskDomain;

    @PostMapping("/add")
    public Task addTask(@RequestBody TaskRequest taskRequest) {
        return taskDomain.addTask(taskRequest);
    }

    @GetMapping("/get")
    public List<Task> list(@RequestParam int scrum_id){
        return taskDomain.getAllTaskByScrumID(scrum_id);
    }

    @PostMapping("/taskdone")
    public Task doneTask(@RequestParam int id) {
        return taskDomain.doneTask(id);
    }
}
