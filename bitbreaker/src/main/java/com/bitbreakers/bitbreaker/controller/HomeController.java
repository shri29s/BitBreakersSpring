package com.bitbreakers.bitbreaker.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitbreakers.bitbreaker.model.StartupModel;
import com.bitbreakers.bitbreaker.service.StartupService;

import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api")
@CrossOrigin
public class HomeController {
    StartupService startupService;
    public HomeController(StartupService startupService){
        this.startupService = startupService;
    }

    @GetMapping("/")
    public String homes() {
        return "Success";
    }

    @GetMapping("/all")
    public List<StartupModel> getAllStartup() {
        return this.startupService.getAllStartup();
    }
    

    @PostMapping("/addStartup")
    public ResponseEntity<String> addStartup(@RequestBody StartupModel startup) {
        this.startupService.addStartup(startup);
        return new ResponseEntity<>("Saved", HttpStatus.OK);
    }
}
