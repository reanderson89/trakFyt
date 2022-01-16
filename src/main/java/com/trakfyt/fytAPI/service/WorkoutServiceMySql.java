package com.trakfyt.fytAPI.service;

import com.trakfyt.fytAPI.repository.WorkoutRepository;
import com.trakfyt.fytAPI.repository.entities.Workout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WorkoutServiceMySql implements WorkoutService{
    private final WorkoutRepository workoutRepository;

    public WorkoutServiceMySql(@Autowired WorkoutRepository workoutRepository )
    {
        this.workoutRepository = workoutRepository;
    }

    @Override
    public Workout save(Workout workout )
    {
        return workoutRepository.save( workout );
    }

    @Override
    public void delete( int workoutId )
    {
        workoutRepository.deleteById( workoutId );
    }

    @Override
    public List<Workout> all()
    {
        List<Workout> result = new ArrayList<>();
        workoutRepository.findAll().forEach( result::add );
        return result;
    }

    @Override
    public Workout findById(int workoutId )
    {
        Optional<Workout> optional = workoutRepository.findById(workoutId);
        Workout workout = null;
        if(optional.isPresent()){
            workout = optional.get();
        }else{
            throw new RuntimeException("Employee not for id ::" + workoutId);
        }
        return workout ;
    }
}
