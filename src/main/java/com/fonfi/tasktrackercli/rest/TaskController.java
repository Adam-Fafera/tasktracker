package com.fonfi.tasktrackercli.rest;

import com.fonfi.tasktrackercli.entity.Task;

import com.fonfi.tasktrackercli.repository.TaskRepository;
import com.fonfi.tasktrackercli.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class TaskController {
    private final TaskService taskService;
    private final TaskRepository taskRepository;

    public TaskController(TaskService taskService, TaskRepository taskRepository) {
        this.taskService = taskService;
        this.taskRepository = taskRepository;
    }

    //Works
    @GetMapping("/tasks")
    public List<Task> listAll(){
        return taskService.listAll();
    }

    @GetMapping("/tasks/{task_id}")
    public Task listById(@PathVariable int task_id){
        return taskRepository.findById(task_id).orElseThrow(() -> new RuntimeException("Cannot find task of this id"));
    }

    //Works
    @GetMapping("/tasks/status/{status}")
    public List<Task> listAllByStatus(@PathVariable Task.Status status){
        return taskService.listAllByStatus(status);
    };

    //Works
    @PostMapping("/tasks")
    public Task addTask(@RequestBody Task task){
        return taskService.addTask(task.getDescription());
    }

    @PutMapping("/tasks/{task_id}")
    public Task updateTask(@PathVariable int task_id, @RequestBody Task taskDetails){
        Task updatedTask = taskRepository.findById(task_id).orElseThrow(() -> new RuntimeException("Cannot find task of this id"));
        updatedTask.setDescription(taskDetails.getDescription());
        updatedTask.setStatus(taskDetails.getStatus());
        updatedTask.setUpdatedAt(LocalDateTime.now());
        return taskRepository.save(updatedTask);
    }

    @DeleteMapping("/tasks/{task_id}")
    public void deleteTask(@PathVariable int task_id) {
        taskRepository.deleteById(task_id);
    }

}
