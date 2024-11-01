package com.example.lab3_bytska.repository;

import com.example.lab3_bytska.entity.Courses;
import com.example.lab3_bytska.entity.Marks;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CoursesRepository extends ReactiveCrudRepository<Courses, Long> {
    Flux<Marks> findByTutorId(Long tutorId);
}
