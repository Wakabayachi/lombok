package com.crud.dbservice.service;

import com.crud.dbservice.Task;
import com.crud.dbservice.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DbService {

    private final TaskRepository taskRepository;

    @Autowired
    public DbService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Optional<Task> getTaskById(Long taskId) {
        return taskRepository.findById(taskId);
    }
}
