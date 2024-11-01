package com.example.lab3_bytska.controller;


import com.example.lab3_bytska.entity.Marks;
import com.example.lab3_bytska.service.MarksService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class MarksController {

    private final MarksService marksService;
    @GetMapping("/marks")
    public Flux<Marks> getAllMarks() {
        return marksService.findAll();
    }
}
