package com.example.java_spring_boot_backend.controllers;

import com.example.java_spring_boot_backend.dto.FiddleDto;
import com.example.java_spring_boot_backend.dto.ResponseDto;
import com.example.java_spring_boot_backend.services.FiddleService;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/fiddle")
public class FiddleController {
    /********************/
    @Autowired
    FiddleService fiddleService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<ResponseDto> getFiddleList(){
        ResponseDto response;
        try {
            List<FiddleDto> fiddles = fiddleService.getFiddleList();
            response = new ResponseDto(fiddles, "ok", null);
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
        catch (Exception e){
            response = new ResponseDto(null, "error", null);
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(response);
        }

    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseDto> getFiddle(@PathVariable Long id){
        ResponseDto response;
        try {
            FiddleDto fiddle = fiddleService.getFiddle(id);
            ArrayList<FiddleDto> result = new ArrayList<>();
            result.add(fiddle);
            response = new ResponseDto(result, "ok", null);
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
        catch (Exception e){
            response = new ResponseDto(null, "error", null);
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(response);
        }

    }

    @PostMapping
    public ResponseEntity<ResponseDto> saveFiddle(@RequestBody FiddleDto fiddle){
        
        ResponseDto responseDto;
        try{
            FiddleDto newFiddle = this.fiddleService.saveFiddle(fiddle);
            ArrayList<FiddleDto> result = new ArrayList<>();
            result.add(newFiddle);
            responseDto = new ResponseDto(result, "ok", null);
            return ResponseEntity.status(HttpStatus.OK).body(responseDto);
        }
        catch(Exception e){
            responseDto = new ResponseDto(null, "error", null);
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(responseDto);
        }
    }
}
