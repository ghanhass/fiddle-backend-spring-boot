package com.example.java_spring_boot_backend.repositories;

import com.example.java_spring_boot_backend.models.FiddleData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiddleRepository extends JpaRepository<FiddleData, Long> {
}