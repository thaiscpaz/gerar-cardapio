package com.personal.project.generatemenu.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Builder
@Data
public class Weekday {

    @Id
    public String id;
    public DayEnum day;
    public List<Meal> meals;

}
