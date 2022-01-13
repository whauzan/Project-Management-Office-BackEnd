package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.TaskRequest;
import com.pbo.pmo.Pojos.TeamRequest;
import com.pbo.pmo.model.Employee;
import com.pbo.pmo.model.Scrum;
import com.pbo.pmo.model.Task;
import com.pbo.pmo.repository.EmployeeRepository;
import com.pbo.pmo.repository.ScrumRepository;
import com.pbo.pmo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements TaskDomain{
    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ScrumRepository scrumRepository;

    @Override
    public List<Task> getAllTaskByScrumID(int scrum_id) {
        return taskRepository.findAllByScrumId(scrum_id);
    }

    @Override
    public Task addTask(TaskRequest taskRequest) {
        Task task = new Task();
        task.setName(taskRequest.name);
        task.setDescription(taskRequest.description);
        Employee employee = employeeRepository.findById(taskRequest.employee_id)
                        .orElseThrow(() -> new IllegalStateException(
                                "employee with id " + taskRequest.employee_id + " does not exist"
                        ));
        task.setEmployee(employee);

        Scrum scrum = scrumRepository.findById(taskRequest.scrum_id)
                .orElseThrow(() -> new IllegalStateException(
                        "employee with id " + taskRequest.scrum_id + " does not exist"
                ));
        task.setScrum(scrum);
        return taskRepository.save(task);
    }

    @Override
    public Task editStatus(Integer id) {
        return null;
    }
}
