package com.example.java_spring_boot_backend_2.repositories;

import com.example.java_spring_boot_backend_2.models.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}