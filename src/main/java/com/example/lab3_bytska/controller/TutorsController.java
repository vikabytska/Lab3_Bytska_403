package com.example.lab3_bytska.controller;

import com.example.lab3_bytska.entity.Tutors;
import com.example.lab3_bytska.service.TutorsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class TutorsController {

    private final TutorsService tutorsService;

    @GetMapping("/tutors")
    public Flux<Tutors> getAllTutors() {
        return tutorsService.findAll();
    }

}