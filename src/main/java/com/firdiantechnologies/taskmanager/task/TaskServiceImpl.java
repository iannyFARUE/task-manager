package com.firdiantechnologies.taskmanager.task;

import com.firdiantechnologies.taskmanager.common.TaskConverter;
import com.firdiantechnologies.taskmanager.models.Task;
import com.firdiantechnologies.taskmanager.task.data.TaskDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    public final TaskRepository taskRepository;

    @Override
    public TaskDto saveTask(Task task) {
        Task savedTask = taskRepository.save(task);
        return TaskConverter.taskToDto(savedTask);
    }

    @Override
    public List<TaskDto> getAllTasks() {
        List<Task> tasks = taskRepository.findAll();
        return TaskConverter.taskToDto(tasks);
    }

    @Override
    public TaskDto getTask(Long id) {
        Optional<Task> optionalTask =taskRepository.findById(id);
        Task task = optionalTask.orElse(null);
        return TaskConverter.taskToDto(task);
    }


}
