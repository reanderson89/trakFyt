package com.trakfyt.fytAPI.controller.dto;

import com.trakfyt.fytAPI.repository.entities.Athlete;

public class WorkoutDTO {
    private String type;

    private Double distance;

    private Double duration;

    private String location;

    private String comments;

    private Integer athlete_id;

    public WorkoutDTO(String type, Double distance, Double duration, String location, String comments, Integer athlete_id) {
        this.type = type;
        this.distance = distance;
        this.duration = duration;
        this.location = location;
        this.comments = comments;
        this.athlete_id = athlete_id;
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

    public Integer getAthlete_id() {
        return athlete_id;
    }

    public void setAthlete_id(Integer athlete_id) {
        this.athlete_id = athlete_id;
    }

    @Override
    public String toString() {
        return "WorkoutDTO{" +
                "type='" + type + '\'' +
                ", distance=" + distance +
                ", duration=" + duration +
                ", location='" + location + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
