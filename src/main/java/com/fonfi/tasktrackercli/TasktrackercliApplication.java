package com.fonfi.tasktrackercli;

import com.fonfi.tasktrackercli.entity.Task;
import com.fonfi.tasktrackercli.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TasktrackercliApplication{

	public static void main(String[] args) {
		SpringApplication.run(TasktrackercliApplication.class, args);
	}

}
