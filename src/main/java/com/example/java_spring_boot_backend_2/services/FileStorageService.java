package com.example.java_spring_boot_backend_2.services;

import com.example.java_spring_boot_backend_2.models.FileDB;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface FileStorageService {

    public FileDB store(MultipartFile file) throws IOException;

    public FileDB getFile(String id);

    public List<FileDB> getAllFiles();
}
