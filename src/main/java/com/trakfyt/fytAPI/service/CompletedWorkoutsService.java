package com.trakfyt.fytAPI.service;

import com.trakfyt.fytAPI.repository.entities.Athlete;
import com.trakfyt.fytAPI.repository.entities.CompletedWorkouts;
import com.trakfyt.fytAPI.repository.entities.Workout;

import java.util.List;

public interface CompletedWorkoutsService {
    CompletedWorkouts save(CompletedWorkouts completedWorkouts );

    void delete( int completedWorkoutId );

    List<CompletedWorkouts> all();

    CompletedWorkouts findById(int completedWorkoutId );

    List<Workout> findByAthleteId(int athleteId);
}
