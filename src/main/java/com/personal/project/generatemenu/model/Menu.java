package com.personal.project.generatemenu.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Menu {

    @Id
    public Integer id;
    public List<Weekday> days;


}
