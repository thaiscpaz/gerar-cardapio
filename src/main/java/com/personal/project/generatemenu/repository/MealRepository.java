package com.personal.project.generatemenu.repository;

import com.personal.project.generatemenu.model.Meal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MealRepository extends MongoRepository<Meal, Integer> {
}
