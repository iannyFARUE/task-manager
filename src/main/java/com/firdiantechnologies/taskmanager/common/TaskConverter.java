package com.firdiantechnologies.taskmanager.common;

import com.firdiantechnologies.taskmanager.models.Task;
import com.firdiantechnologies.taskmanager.task.data.TaskDto;

import java.util.List;
import java.util.stream.Collectors;

public class TaskConverter {

    public static TaskDto taskToDto(Task task){
        TaskDto taskDto = new TaskDto();
        taskDto.setEndDate(task.getEndDate());
        taskDto.setStartDate(task.getStartDate());
        taskDto.setId(task.getId());
        taskDto.setName(task.getName());
        return taskDto;
    }

    public static List<TaskDto> taskToDto(List<Task> tasks){
        return tasks.stream().map(TaskConverter::taskToDto).collect(Collectors.toList());
    }

    public static Task dtoToTask(TaskDto taskDto){
        Task task = new Task();
        task.setEndDate(taskDto.getEndDate());
        task.setStartDate(taskDto.getStartDate());
        task.setId(taskDto.getId());
        task.setName(taskDto.getName());
        return task;
    }


}
