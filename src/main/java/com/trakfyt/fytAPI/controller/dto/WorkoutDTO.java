package com.trakfyt.fytAPI.controller.dto;

public class WorkoutDTO {
    private String type;

    private Double distance;

    private Double duration;

    private String location;

    private String comments;

    public WorkoutDTO(String type, Double distance, Double duration, String location, String comments) {
        this.type = type;
        this.distance = distance;
        this.duration = duration;
        this.location = location;
        this.comments = comments;
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
