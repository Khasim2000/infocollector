package com.collect.data.service;

import com.collect.data.entity.TaskEntity;
import com.collect.data.entity.UserEntity;
import com.collect.data.repository.TaskRepository;
import com.collect.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TaskRepository taskRepository;

    public UserEntity findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public void saveTask(TaskEntity task) {
        taskRepository.save(task);
    }

    public TaskEntity findTaskByName(String taskName) {
        return taskRepository.findByTaskName(taskName);
    }
}
