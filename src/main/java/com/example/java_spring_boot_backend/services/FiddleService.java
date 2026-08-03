package com.example.java_spring_boot_backend.services;

import com.example.java_spring_boot_backend.dto.FiddleDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FiddleService {
    FiddleDto getFiddle(Long id);
    FiddleDto saveFiddle(FiddleDto fiddleObj);
    List<FiddleDto> getFiddleList();
}
