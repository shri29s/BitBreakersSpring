package com.bitbreakers.bitbreaker.service;

import org.springframework.stereotype.Service;

import com.bitbreakers.bitbreaker.Startup;

@Service
public class StartupService {
    Startup startupModel;
    public StartupService(Startup startup){
        this.startupModel = startup;
    }
}
