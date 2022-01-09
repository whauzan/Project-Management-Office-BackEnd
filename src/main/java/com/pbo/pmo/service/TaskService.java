//package com.pbo.pmo.service;
//
//import com.pbo.pmo.Pojos.TeamRequest;
//import com.pbo.pmo.model.Task;
//import com.pbo.pmo.repository.TaskRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class TaskService implements TaskDomain{
//    @Autowired
//    private TaskRepository taskRepository;
//
//
//    @Override
//    public List<Task> getAllTaskByScrumID() {
//        return taskRepository.findAllByScrumId();
//    }
//
//    @Override
//    public Task addTask(TeamRequest teamRequest) {
//        return null;
//    }
//
//    @Override
//    public Task editStatus(Integer id) {
//        return null;
//    }
//}
