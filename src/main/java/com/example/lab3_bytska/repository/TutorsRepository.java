package com.example.lab3_bytska.repository;

import com.example.lab3_bytska.entity.Tutors;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TutorsRepository extends ReactiveCrudRepository<Tutors, Long> {
}
