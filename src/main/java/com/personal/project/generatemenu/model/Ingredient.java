package com.personal.project.generatemenu.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Data
public class Ingredient {

    @Id @JsonIgnore
    public ObjectId id;
    public String name;
    public String calories;
    public String protein;
    public String cholesterol;
    public String carbs;
    public String fiber;
    public String sodium;

}
