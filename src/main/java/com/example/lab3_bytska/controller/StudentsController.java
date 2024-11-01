package com.example.lab3_bytska.controller;

import com.example.lab3_bytska.entity.Students;
import com.example.lab3_bytska.service.StudentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class StudentsController {
    private final StudentsService studentsService;

    @GetMapping("/students")
    public Flux<Students> getAllStudents() {
        return studentsService.findAll();
    }
}