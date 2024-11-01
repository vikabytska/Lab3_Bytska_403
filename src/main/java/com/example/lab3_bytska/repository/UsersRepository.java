package com.example.lab3_bytska.repository;

import com.example.lab3_bytska.entity.Users;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface UsersRepository extends ReactiveCrudRepository<Users, Long> {
    Flux<Users> findByRole(String role);
}
