package com.personal.project.generatemenu.repository;

import com.personal.project.generatemenu.model.Ingredient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


public interface IngredientRepository extends MongoRepository<Ingredient, String>{

    public Ingredient findByName(String name);

    @Query(value="{ name: { $regex: '^.*?0.*$', $options: 'i' }}")
    public List<Ingredient> findAllByName(String searchFor);
}
