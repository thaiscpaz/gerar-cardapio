package com.personal.project.generatemenu.repository;

import com.personal.project.generatemenu.model.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeRepository extends MongoRepository<Recipe, String> {

    public Recipe findByName(String name);

}
