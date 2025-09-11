package com.example.java_spring_boot_backend_2.repositories;

import com.example.java_spring_boot_backend_2.models.Fiddle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiddleRepository extends JpaRepository<Fiddle, Long> {
}