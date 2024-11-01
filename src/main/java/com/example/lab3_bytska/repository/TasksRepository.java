package com.example.lab3_bytska.repository;

import com.example.lab3_bytska.entity.Tasks;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TasksRepository extends ReactiveCrudRepository<Tasks, Long> {
}
