package com.personal.project.generatemenu.service;

import com.personal.project.generatemenu.model.Meal;
import com.personal.project.generatemenu.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MealService {

    @Autowired
    public MealRepository mealRepository;

    public Meal save(Meal meal){
        return mealRepository.save(meal);
    }

}
