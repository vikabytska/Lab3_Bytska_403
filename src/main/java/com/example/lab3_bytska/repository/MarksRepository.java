package com.example.lab3_bytska.repository;

import com.example.lab3_bytska.entity.Marks;
import com.example.lab3_bytska.entity.Users;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface MarksRepository extends ReactiveCrudRepository<Marks, Long> {
    Flux<Marks> findByStudentId(Long studentId);
    Flux<Marks> findByTaskId(Long taskId);
}
