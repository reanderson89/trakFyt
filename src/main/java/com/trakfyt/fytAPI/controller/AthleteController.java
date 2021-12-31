package com.trakfyt.fytAPI.controller;

import com.trakfyt.fytAPI.controller.dto.AthleteDTO;
import com.trakfyt.fytAPI.repository.entity.Athlete;
import com.trakfyt.fytAPI.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/athlete")
public class AthleteController {
    final AthleteService athleteService;


    public AthleteController(@Autowired AthleteService athleteService )
    {
        this.athleteService = athleteService;
    }

    @GetMapping( "/all" )
    public Iterable<Athlete> all()
    {
        System.out.println("I WAS HITTTTTT!!!!!");
        return athleteService.all();
    }

    @PostMapping
    public Athlete save( @RequestBody AthleteDTO athleteDTO )
    {
        return athleteService.save( new Athlete( athleteDTO ) );
    }

    @GetMapping( "/{id}" )
    public Optional<Athlete> findById(@PathVariable Integer id )
    {
        System.out.println("GOT HIT");
        return athleteService.findById( id );
    }

//    @PutMapping( "/{id}" )
//    public Athlete update( @RequestBody AthleteDTO athleteDTO, @PathVariable Integer id )
//    {
//        Athlete athlete = athleteService.findById( id );
//        athlete.setName( athlete.getName() );
//        athlete.setAge( athlete.getAge() );
//        athlete.setHeight( athlete.getHeight() );
//        athlete.setWeight( athlete.getWeight() );
//        return athleteService.save( athlete );
//    }

    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer id )
    {
        athleteService.delete( id );
    }

}

