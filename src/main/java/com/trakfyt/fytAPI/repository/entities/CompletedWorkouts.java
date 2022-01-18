package com.trakfyt.fytAPI.repository.entities;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "completed_workouts")
public class CompletedWorkouts {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "completed_workouts_seq")
    private Integer id;

    @Column(name = "athlete_id")
    private Integer athleteId;

    @Column(name = "workout_id")
    private Integer workoutId;

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    public CompletedWorkouts(){

    }

    public CompletedWorkouts(Integer athleteId, Integer workoutId) {
        this.athleteId = athleteId;
        this.workoutId = workoutId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAthlete_id() {
        return athleteId;
    }

    public void setAthlete_id(Integer athleteId) {
        this.athleteId = athleteId;
    }

    public Integer getWorkout_id() {
        return workoutId;
    }

    public void setWorkout_id(Integer workoutId) {
        this.workoutId = workoutId;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    public LocalDateTime getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(LocalDateTime updateDateTime) {
        this.updateDateTime = updateDateTime;
    }
}
