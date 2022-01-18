package com.trakfyt.fytAPI.service;

import com.trakfyt.fytAPI.controller.dto.WorkoutDTO;
import com.trakfyt.fytAPI.repository.entities.Workout;

import java.util.List;

public interface WorkoutService {
    Workout save(Workout workout );

    Workout update(WorkoutDTO workoutDTO, Integer id);

    void delete( int workoutId );

    List<Workout> all();

    Workout findById(int workoutId );
}
