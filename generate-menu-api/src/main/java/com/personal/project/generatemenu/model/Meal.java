package com.personal.project.generatemenu.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@Builder
public class Meal {

    @Id @JsonIgnore
    public Integer id;
    public MealEnum meal;
    public List<Recipe> recipes;
}
