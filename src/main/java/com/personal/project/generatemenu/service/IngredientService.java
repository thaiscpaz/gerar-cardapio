package com.personal.project.generatemenu.service;

import com.personal.project.generatemenu.model.Ingredient;
import com.personal.project.generatemenu.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    @Autowired
    public IngredientRepository ingredientRepository;

    public Ingredient findByName(String name) throws Exception{
        return ingredientRepository.findByName(name);
    }

    public List<Ingredient> findAll() throws Exception{
        return ingredientRepository.findAll();
    }

    public Ingredient save(Ingredient ingredient){
        return ingredientRepository.save(ingredient);
    }

    public List<Ingredient> findAllByName(String searchFor) {
        return ingredientRepository.findAllByName(searchFor);
    }
}
