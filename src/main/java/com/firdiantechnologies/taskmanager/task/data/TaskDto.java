package com.firdiantechnologies.taskmanager.task.data;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskDto {

    private Long id;
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
