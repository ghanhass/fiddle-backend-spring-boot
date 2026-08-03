package com.example.java_spring_boot_backend.services.impl;

import com.example.java_spring_boot_backend.dto.FiddleDto;
import com.example.java_spring_boot_backend.models.FiddleData;
import com.example.java_spring_boot_backend.repositories.FiddleRepository;
import com.example.java_spring_boot_backend.services.FiddleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class FiddleServiceImpl implements FiddleService {

    @Autowired
    FiddleRepository fiddleRepository;

    @Override
    public FiddleDto getFiddle(Long id) {
        FiddleDto fiddle = new FiddleDto(fiddleRepository.findById(id).get());
        return fiddle;
    }

    @Override
    public FiddleDto saveFiddle(FiddleDto fiddleObj) {
        FiddleData fiddleModel = new FiddleData(fiddleObj);
        return new FiddleDto(this.fiddleRepository.save(fiddleModel));
    }

    public List<FiddleDto> getFiddleList(){
        List<FiddleData> fiddleList = fiddleRepository.findAll();
        List<FiddleDto> fiddleDtoList = new ArrayList<>();

        fiddleList.forEach(fiddle -> {
            fiddleDtoList.add(new FiddleDto(fiddle));
        });

        return fiddleDtoList;
    }
}
