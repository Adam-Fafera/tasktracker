package com.fonfi.tasktrackercli.service;

import com.fonfi.tasktrackercli.entity.Task;
import com.fonfi.tasktrackercli.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task addTask(String description){
        Task task = new Task();
        task.setDescription(description);
        task.setStatus(Task.Status.todo);
        task.setCreatedAt(LocalDateTime.now());
        task.setUpdatedAt(LocalDateTime.now());
        return taskRepository.save(task);
    }

    public Task updateTask(Integer id, String description){
        Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        task.setDescription(description);
        task.setUpdatedAt(LocalDateTime.now());
        return taskRepository.save((task));
    }

    public void deleteTask(Integer id){
        taskRepository.deleteById(id);
    }

    public Task changeStatusTask(Integer id, Task.Status status){
        Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        task.setStatus(status);
        return taskRepository.save(task);
    }

    public List<Task> listAll(){
        return taskRepository.findAll();
    }

    public List<Task> listAllByStatus(Task.Status status){
        return taskRepository.findByStatus(status);
    }
}
