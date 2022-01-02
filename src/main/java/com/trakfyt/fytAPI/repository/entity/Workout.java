package com.trakfyt.fytAPI.repository.entity;

import com.trakfyt.fytAPI.controller.dto.WorkoutDTO;

import javax.persistence.*;

@Entity
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String type;

    private Double distance;

    private Double duration;

    private String location;

    private String comments;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "athlete_id")
    private Athlete athlete;

    public Workout() {
    }

    public Workout(WorkoutDTO workoutDTO) {
        this.type = workoutDTO.getType();
        this.distance = workoutDTO.getDistance();
        this.duration = workoutDTO.getDuration();
        this.location = workoutDTO.getLocation();
        this.comments = workoutDTO.getComments();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }
}
