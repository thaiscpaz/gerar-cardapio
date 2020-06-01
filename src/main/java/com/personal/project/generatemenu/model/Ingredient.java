package com.personal.project.generatemenu.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Ingredient {

    @Id
    public String name;

}
