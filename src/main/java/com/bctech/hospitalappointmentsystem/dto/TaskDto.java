package com.bctech.hospitalappointmentsystem.dto;

import com.bctech.activitytracker.model.User;
import jakarta.persistence.ManyToOne;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {

    @NotBlank (message = "Task description is required")
    private Long taskId;

    @NotBlank (message = "Task title is required")
    private String title;

    @NotBlank (message = "Task descrition is required")
    private String description;

    private String status = "PENDING";


    private String createdAt;


    private String  updatedAt;


    private String  completedAt;

    @ManyToOne
    private User user;

}
