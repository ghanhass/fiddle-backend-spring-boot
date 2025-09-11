package com.example.java_spring_boot_backend_2.services.impl;

import com.example.java_spring_boot_backend_2.dto.FiddleDto;
import com.example.java_spring_boot_backend_2.models.Fiddle;
import com.example.java_spring_boot_backend_2.repositories.FiddleRepository;
import com.example.java_spring_boot_backend_2.services.FiddleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

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
        Fiddle fiddleModel = new Fiddle(fiddleObj);
        return new FiddleDto(this.fiddleRepository.save(fiddleModel));
    }

    public List<FiddleDto> getFiddleList(){
        List<Fiddle> fiddleList = fiddleRepository.findAll();
        List<FiddleDto> fiddleDtoList = new ArrayList<>();

        fiddleList.forEach(fiddle -> {
            fiddleDtoList.add(new FiddleDto(fiddle));
        });

        return fiddleDtoList;
    }
}
