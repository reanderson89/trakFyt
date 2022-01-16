package com.trakfyt.fytAPI.service;

import com.trakfyt.fytAPI.repository.entities.Workout;

import java.util.List;

public interface WorkoutService {
    Workout save(Workout workout );

    void delete( int workoutId );

    List<Workout> all();

    Workout findById(int workoutId );
}
