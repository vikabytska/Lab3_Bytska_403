package com.example.lab3_bytska.repository;

import com.example.lab3_bytska.entity.Students;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface StudentsRepository extends ReactiveCrudRepository<Students, Long> {
}
