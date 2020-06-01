package com.personal.project.generatemenu.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Weekday {

    @Id
    public Integer id; //ObjectId id = new ObjectId(); ou UUID.randomUUID().toString();
    public DayEnum day;
    public List<Meal> meals;

}
