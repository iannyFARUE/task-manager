package com.firdiantechnologies.taskmanager.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table
@Entity
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private LocalDateTime startDate;

    private LocalDateTime endDate;
}
