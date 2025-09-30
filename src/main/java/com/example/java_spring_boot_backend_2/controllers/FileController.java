package com.example.java_spring_boot_backend_2.controllers;

import com.example.java_spring_boot_backend_2.dto.ResponseFile;
import com.example.java_spring_boot_backend_2.dto.ResponseMessage;
import com.example.java_spring_boot_backend_2.models.Fiddle;
import com.example.java_spring_boot_backend_2.models.FileDB;
import com.example.java_spring_boot_backend_2.services.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FileController {

    @Autowired
    private FileStorageService fileStorageService;

    @PostMapping("/upload")
    public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file){
        String message = "";
        try{
            fileStorageService.store(file);

            message = "Uploaded file successfully: " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
        }
        catch(Exception e){
            message = "Could not upload the file: " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
    }
    ////
    @GetMapping("/files")
    public ResponseEntity<List<ResponseFile>> getListFiles(){
        List<ResponseFile> files = new ArrayList<>();
        String test = ServletUriComponentsBuilder.fromCurrentContextPath().toUriString();
        System.out.println("test = "+test);
        fileStorageService.getAllFiles().forEach(dbFile -> {

                    String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/files/").path(dbFile.getId()).toUriString();
                    files.add(new ResponseFile(dbFile.getName(), fileDownloadUri, dbFile.getType(), dbFile.getData().length));
                });
        return ResponseEntity.status(HttpStatus.OK).body(files);
    }

    @GetMapping("/files/{id}")
    public ResponseEntity<byte[]> getFile(@PathVariable String id){
        FileDB fileDB = fileStorageService.getFile(id);

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getName() + "\"").body(fileDB.getData());
    }
}
