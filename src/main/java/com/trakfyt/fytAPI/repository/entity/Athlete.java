package com.trakfyt.fytAPI.repository.entity;

import com.trakfyt.fytAPI.controller.dto.AthleteDTO;
import com.trakfyt.fytAPI.service.AthleteService;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Athlete {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Double weight;

    private Integer height;

    private Integer age;


    @OneToMany(mappedBy = "athlete", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Workout> workout;

    public Athlete(){
    }

    public Athlete(AthleteDTO athleteDTO) {
        this.name = athleteDTO.getName();
        this.weight = athleteDTO.getWeight();
        this.height = athleteDTO.getHeight();
        this.age = athleteDTO.getAge();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
