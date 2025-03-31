package com.fonfi.tasktrackercli.repository;

import com.fonfi.tasktrackercli.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    List<Task> findByStatus(Task.Status status);
}
