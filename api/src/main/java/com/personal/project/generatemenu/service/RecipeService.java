package com.personal.project.generatemenu.service;

import com.personal.project.generatemenu.model.Recipe;
import com.personal.project.generatemenu.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    public RecipeRepository recipeRepository;

    public Recipe save(Recipe recipe){
        return recipeRepository.save(recipe);
    }

    public Recipe findByName(String name){
        return recipeRepository.findByName(name);
    }

    public List<Recipe> findAll(){
        return recipeRepository.findAll();
    }
}
