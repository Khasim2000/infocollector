package com.collect.data.repository;

import com.collect.data.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
    TaskEntity findByTaskName(String taskName);
}
