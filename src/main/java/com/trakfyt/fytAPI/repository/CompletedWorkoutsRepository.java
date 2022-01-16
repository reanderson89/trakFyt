package com.trakfyt.fytAPI.repository;

import com.trakfyt.fytAPI.repository.entities.CompletedWorkouts;
import com.trakfyt.fytAPI.repository.entities.Workout;
import org.springframework.data.repository.CrudRepository;

public interface CompletedWorkoutsRepository extends CrudRepository<CompletedWorkouts, Integer> {
Iterable<CompletedWorkouts> findByAthleteId(Integer athleteId );
}
