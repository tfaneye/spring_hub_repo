package com.mytraining.springbootdemo.repositories;

import com.mytraining.springbootdemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
