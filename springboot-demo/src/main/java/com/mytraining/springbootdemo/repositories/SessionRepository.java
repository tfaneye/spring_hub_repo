package com.mytraining.springbootdemo.repositories;

import com.mytraining.springbootdemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
