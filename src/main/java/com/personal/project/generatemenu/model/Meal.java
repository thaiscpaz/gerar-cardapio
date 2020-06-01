package com.personal.project.generatemenu.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Meal {

    @Id
    public Integer id;
    public MealEnum meal;
    public List<Recipe> recipes;
}
