package com.trakfyt.fytAPI.controller;

import com.trakfyt.fytAPI.controller.dto.AthleteDTO;
import com.trakfyt.fytAPI.repository.entities.Athlete;
import com.trakfyt.fytAPI.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/athlete")
public class AthleteController {
    final AthleteService athleteService;


    public AthleteController(@Autowired AthleteService athleteService )
    {
        this.athleteService = athleteService;
    }

    @GetMapping
    public Iterable<Athlete> all()
    {
        return athleteService.all();
    }

    @PostMapping
    public Athlete save( @RequestBody AthleteDTO athleteDTO )
    {
        return athleteService.save( new Athlete( athleteDTO ) );
    }

    @GetMapping( "/{id}" )
    public Athlete findById(@PathVariable Integer id )
    {
        return athleteService.findById( id );
    }

    @PutMapping( "/{id}" )
    public Athlete update( @RequestBody AthleteDTO athleteDTO, @PathVariable Integer id )
    {
        Athlete athlete = athleteService.findById( id );
        athlete.setName( athleteDTO.getName() );
        athlete.setAge( athleteDTO.getAge() );
        athlete.setHeight( athleteDTO.getHeight() );
        athlete.setWeight( athleteDTO.getWeight() );
        return athleteService.save( athlete );
    }

    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer id )
    {
        athleteService.delete( id );
    }


}

