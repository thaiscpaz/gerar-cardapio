package com.personal.project.generatemenu.repository;

import com.personal.project.generatemenu.model.Ingredient;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface IngredientRepository extends MongoRepository<Ingredient, String>{

    public Ingredient findByName(String name);

}
