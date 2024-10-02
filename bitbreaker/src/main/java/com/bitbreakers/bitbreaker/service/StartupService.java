package com.bitbreakers.bitbreaker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bitbreakers.bitbreaker.model.StartupModel;
import com.bitbreakers.bitbreaker.repo.StartupRepo;

@Service
public class StartupService {
    StartupRepo startupRepo;
    public StartupService(StartupRepo startupRepo){
        this.startupRepo = startupRepo;
    }

    public void addStartup(StartupModel startup){
        this.startupRepo.save(startup);
    }

    public List<StartupModel> getAllStartup(){
        return this.startupRepo.findAll();
    } 
}
