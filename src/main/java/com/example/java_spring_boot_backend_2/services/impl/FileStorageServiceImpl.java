package com.example.java_spring_boot_backend_2.services.impl;

import com.example.java_spring_boot_backend_2.models.FileDB;
import com.example.java_spring_boot_backend_2.repositories.FileDBRepository;
import com.example.java_spring_boot_backend_2.services.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class FileStorageServiceImpl implements FileStorageService {

    @Autowired
    private FileDBRepository fileDBRepository;

    public FileDB store(MultipartFile file) throws IOException{
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        FileDB fileDB = new FileDB(fileName, file.getContentType(), file.getBytes());

        return fileDBRepository.save(fileDB);
    }

    public FileDB getFile(String id){
        Optional<FileDB> file = fileDBRepository.findById(id);
        if(file.isPresent()){
            return file.get();
        }
        return null;
    }

    public List<FileDB> getAllFiles(){
        return fileDBRepository.findAll();
    }
}
