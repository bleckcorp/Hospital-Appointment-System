package com.bctech.hospitalappointmentsystem.repository;

import com.bctech.activitytracker.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findAllByUserId(Long id);
    List<Task> findAllByUserIdAndStatus(Long id, String status);
}
