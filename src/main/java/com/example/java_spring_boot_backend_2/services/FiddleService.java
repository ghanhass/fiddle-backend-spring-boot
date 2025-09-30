package com.example.java_spring_boot_backend_2.services;

import com.example.java_spring_boot_backend_2.dto.FiddleDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FiddleService {
    FiddleDto getFiddle(Long id);
    FiddleDto saveFiddle(FiddleDto fiddleObj);
    List<FiddleDto> getFiddleList();
}
