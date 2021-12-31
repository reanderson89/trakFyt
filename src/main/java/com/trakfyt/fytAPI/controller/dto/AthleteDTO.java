package com.trakfyt.fytAPI.controller.dto;

public class AthleteDTO {
    private String name;

    private Double weight;

    private Integer height;

    private Integer age;

    public AthleteDTO(String name, Double weight, Integer height, Integer age) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
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
        return "AthleteDTO{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
