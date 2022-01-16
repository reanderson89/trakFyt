package com.trakfyt.fytAPI.service;

import com.trakfyt.fytAPI.repository.AthleteRepository;

import com.trakfyt.fytAPI.repository.entities.Athlete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AthleteServiceMySql implements AthleteService {
    private final AthleteRepository athleteRepository;

    public AthleteServiceMySql(@Autowired AthleteRepository athleteRepository )
    {
        this.athleteRepository = athleteRepository;
    }

    @Override
    public Athlete save(Athlete athlete )
    {
        return athleteRepository.save( athlete );
    }

    @Override
    public void delete( int athleteId )
    {
        athleteRepository.deleteById( athleteId );
    }

    @Override
    public List<Athlete> all()
    {
        List<Athlete> result = new ArrayList<>();
        athleteRepository.findAll().forEach( result::add );
        return result;
    }

    @Override
    public Athlete findById(int athleteId )
    {
        Optional<Athlete> optional = athleteRepository.findById(athleteId);
        Athlete athlete = null;
        if(optional.isPresent()){
            athlete = optional.get();
        }else{
            throw new RuntimeException("Employee not for id ::" + athleteId);
        }
        return athlete ;
    }

}
