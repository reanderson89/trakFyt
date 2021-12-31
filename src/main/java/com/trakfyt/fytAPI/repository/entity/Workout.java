package com.trakfyt.fytAPI.repository.entity;

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
    @JoinColumn(name = "Athlete_id")
    private Athlete athlete;


}
