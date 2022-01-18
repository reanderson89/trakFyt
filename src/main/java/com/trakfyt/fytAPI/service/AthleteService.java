package com.trakfyt.fytAPI.service;

import com.trakfyt.fytAPI.controller.dto.AthleteDTO;
import com.trakfyt.fytAPI.repository.entities.Athlete;

import java.util.List;

public interface AthleteService {
    Athlete save(Athlete athlete );

    Athlete update(AthleteDTO athleteDTO, Integer id);

    void delete( int athleteId );

    List<Athlete> all();

    Athlete findById(int athleteId );
}
