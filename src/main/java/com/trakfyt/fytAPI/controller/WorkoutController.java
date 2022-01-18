package com.trakfyt.fytAPI.controller;

import com.trakfyt.fytAPI.controller.dto.WorkoutDTO;
import com.trakfyt.fytAPI.repository.entities.CompletedWorkouts;
import com.trakfyt.fytAPI.repository.entities.Workout;
import com.trakfyt.fytAPI.service.CompletedWorkoutsService;
import com.trakfyt.fytAPI.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/athlete")
public class WorkoutController {
    final WorkoutService workoutService;
    final CompletedWorkoutsService completedWorkoutsService;


    public WorkoutController(@Autowired WorkoutService workoutService, @Autowired CompletedWorkoutsService completedWorkoutsService )
    {
        this.workoutService = workoutService;
        this.completedWorkoutsService = completedWorkoutsService;
    }

//    Get all workouts
    @GetMapping( "/workouts" )
    public Iterable<Workout> all()
    {
        return workoutService.all();
    }

//    create a method to get all workouts by athlete id
    @GetMapping("/{athleteId}/workouts")
    public List<Workout> findAllWorkoutsForAnAthlete(@PathVariable Integer athleteId){
        return completedWorkoutsService.findByAthleteId(athleteId);
    }

    @PostMapping("/{athleteId}/workouts")
    public Workout save(@RequestBody WorkoutDTO workoutDTO, @PathVariable Integer athleteId )
    {
        Workout savedWorkout = workoutService.save( new Workout( workoutDTO ) );
        CompletedWorkouts completedWorkouts = new CompletedWorkouts(athleteId, savedWorkout.getId());
        completedWorkoutsService.save(completedWorkouts);
        return savedWorkout;
    }

    @GetMapping( "/workouts/{id}" )
    public Workout findById(@PathVariable Integer id )
    {
        return workoutService.findById( id );
    }

    @PutMapping( "/workouts/{id}" )
    public Workout update( @RequestBody WorkoutDTO workoutDTO, @PathVariable Integer id )
    {
        return workoutService.update( workoutDTO, id );
    }

    @DeleteMapping( "/workouts/{id}" )
    public void delete( @PathVariable Integer id )
    {
        workoutService.delete( id );
    }

}
