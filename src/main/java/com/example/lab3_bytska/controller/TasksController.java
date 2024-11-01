package com.example.lab3_bytska.controller;


import com.example.lab3_bytska.entity.Tasks;
import com.example.lab3_bytska.service.TasksService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class TasksController {
    private final TasksService tasksService;

    @GetMapping("/tasks")
    public Flux<Tasks> getAllTasks() {
        return tasksService.findAll();
    }
}
