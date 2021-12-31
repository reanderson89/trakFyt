package com.trakfyt.fytAPI.service;

import com.trakfyt.fytAPI.repository.entity.Athlete;

import java.util.List;
import java.util.Optional;

public interface AthleteService {
    Athlete save(Athlete athlete );

    void delete( int athleteId );

    List<Athlete> all();

    Optional<Athlete> findById(int athleteId );
}
