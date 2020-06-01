package com.personal.project.generatemenu.model;

import org.springframework.data.annotation.Id;

import java.util.List;


public class Recipe {

    @Id
    public String name;
    public List<IngredientMeasure> ingredientsWithMeasure;
    public Integer cookTime;
    public RecipeTypeEnum recipeType;
    public Integer servings;
    public String instructions;

    //TODO: Add Nutritional Informations (Calories: 124kcal | Carbohydrates: 27g | Protein: 3g | Fat: 1g)

}
