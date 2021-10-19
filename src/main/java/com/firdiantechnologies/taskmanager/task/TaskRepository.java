package com.firdiantechnologies.taskmanager.task;

import com.firdiantechnologies.taskmanager.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
