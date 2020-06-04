package com.personal.project.generatemenu.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Menu {

    @Id @JsonIgnore
    public String id;
    public List<Weekday> days;


}
