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
        System.out.println("asiiiiiiiiiappppppp" + taskRequest.employee_id);
        task.setName(taskRequest.name);
        task.setDescription(taskRequest.description);
        task.setDone(false);
        Employee employee = employeeRepository.findById(taskRequest.employee_id)
                        .orElseThrow(() -> new IllegalStateException(
                                "employee with id " + taskRequest.employee_id + " does not exist"
                        ));
        System.out.println(employee.getName());

        task.setEmployee(employee);

        Scrum scrum = scrumRepository.findById(taskRequest.scrum_id)
                .orElseThrow(() -> new IllegalStateException(
                        "scrum with id " + taskRequest.scrum_id + " does not exist"
                ));
        task.setScrum_id(scrum.getId());
        return taskRepository.save(task);
    }

    @Override
    public Task doneTask(int id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(
                        "task with id " + id + " does not exist"
                ));
        task.setDone(true);
        return taskRepository.save(task);
    }
}
