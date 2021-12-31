package com.trakfyt.fytAPI.service;

import com.trakfyt.fytAPI.repository.entity.Athlete;

import java.util.List;

public interface AthleteService {
    Athlete save(Athlete athlete );

    void delete( int athleteId );

    List<Athlete> all();

    Athlete findById( int athleteId );
}
