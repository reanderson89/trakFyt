package com.trakfyt.fytAPI.controller;

import com.trakfyt.fytAPI.repository.AthleteRepository;
import com.trakfyt.fytAPI.repository.entity.Athlete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/athlete")
public class AthleteController {
    final AthleteRepository athleteRepository;


    public AthleteController(@Autowired AthleteRepository athleteRepository )
    {
        this.athleteRepository = athleteRepository;
    }

    @GetMapping
    public Iterable<Athlete> getItems(){
        return athleteRepository.findAll();
    }
}

