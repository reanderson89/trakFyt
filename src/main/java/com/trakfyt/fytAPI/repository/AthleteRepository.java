package com.trakfyt.fytAPI.repository;

import com.trakfyt.fytAPI.repository.entities.Athlete;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface AthleteRepository extends CrudRepository<Athlete, Integer> {

}
