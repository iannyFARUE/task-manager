package com.firdiantechnologies.taskmanager.task;

import com.firdiantechnologies.taskmanager.models.Task;
import com.firdiantechnologies.taskmanager.task.data.TaskDto;

import java.util.List;

public interface TaskService {

    TaskDto saveTask(Task task);

    List<TaskDto> getAllTasks();

    TaskDto getTask(Long id);
}
