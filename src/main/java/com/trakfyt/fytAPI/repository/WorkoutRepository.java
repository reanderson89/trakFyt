package com.trakfyt.fytAPI.repository;

import com.trakfyt.fytAPI.repository.entity.Workout;
import org.springframework.data.repository.CrudRepository;

public interface WorkoutRepository extends CrudRepository<Workout, Integer> {

}
