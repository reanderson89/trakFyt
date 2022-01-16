package com.trakfyt.fytAPI.service;

import com.trakfyt.fytAPI.repository.AthleteRepository;
import com.trakfyt.fytAPI.repository.CompletedWorkoutsRepository;
import com.trakfyt.fytAPI.repository.entities.Athlete;
import com.trakfyt.fytAPI.repository.entities.CompletedWorkouts;
import com.trakfyt.fytAPI.repository.entities.Workout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CompletedWorkoutsServiceMySql implements CompletedWorkoutsService {
    private final CompletedWorkoutsRepository completedWorkoutsRepository;

    public CompletedWorkoutsServiceMySql(@Autowired CompletedWorkoutsRepository completedWorkoutsRepository )
    {
        this.completedWorkoutsRepository = completedWorkoutsRepository;
    }

    @Override
    public CompletedWorkouts save(CompletedWorkouts completedWorkouts )
    {
        return completedWorkoutsRepository.save( completedWorkouts );
    }

    @Override
    public void delete( int completedWorkoutsId )
    {
        completedWorkoutsRepository.deleteById( completedWorkoutsId );
    }

    @Override
    public List<CompletedWorkouts> all()
    {
        List<CompletedWorkouts> result = new ArrayList<>();
        completedWorkoutsRepository.findAll().forEach( result::add );
        return result;
    }

    @Override
    public CompletedWorkouts findById(int completedWorkoutsId )
    {
        Optional<CompletedWorkouts> optional = completedWorkoutsRepository.findById(completedWorkoutsId);
        CompletedWorkouts completedWorkouts = null;
        if(optional.isPresent()){
            completedWorkouts = optional.get();
        }else{
            throw new RuntimeException("not for id ::" + completedWorkoutsId);
        }
        return completedWorkouts;
    }

    @Override
    public void findByAthleteId(int athleteId){
        Iterable<CompletedWorkouts> listOfCompletedWorkouts = completedWorkoutsRepository.findByAthleteId(athleteId);
        listOfCompletedWorkouts.forEach(System.out::println);

    }
}
