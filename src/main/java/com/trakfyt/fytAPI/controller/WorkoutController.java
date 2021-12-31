package com.trakfyt.fytAPI.controller;

import com.trakfyt.fytAPI.controller.dto.AthleteDTO;
import com.trakfyt.fytAPI.controller.dto.WorkoutDTO;
import com.trakfyt.fytAPI.repository.entity.Athlete;
import com.trakfyt.fytAPI.repository.entity.Workout;
import com.trakfyt.fytAPI.service.AthleteService;
import com.trakfyt.fytAPI.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/workout")
public class WorkoutController {
    final WorkoutService workoutService;


    public WorkoutController(@Autowired WorkoutService workoutService )
    {
        this.workoutService = workoutService;
    }

    @GetMapping( "/all" )
    public Iterable<Workout> all()
    {
        return workoutService.all();
    }

    @PostMapping
    public Workout save(@RequestBody WorkoutDTO workoutDTO )
    {
        return workoutService.save( new Workout( workoutDTO ) );
    }

    @GetMapping( "/{id}" )
    public Workout findById(@PathVariable Integer id )
    {
        return workoutService.findById( id );
    }

    @PutMapping( "/{id}" )
    public Workout update( @RequestBody WorkoutDTO workoutDTO, @PathVariable Integer id )
    {
        Workout workout = workoutService.findById( id );
        workout.setType( workoutDTO.getType() );
        workout.setDistance( workoutDTO.getDistance() );
        workout.setDuration( workoutDTO.getDuration() );
        workout.setLocation( workoutDTO.getLocation() );
        workout.setComments( workoutDTO.getComments() );
        return workoutService.save( workout );
    }

    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer id )
    {
        workoutService.delete( id );
    }

}
