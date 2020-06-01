package com.personal.project.generatemenu.controller;

import com.personal.project.generatemenu.model.Ingredient;
import com.personal.project.generatemenu.model.Recipe;
import com.personal.project.generatemenu.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("recipe")
@Slf4j
public class RecipeController {

    @Autowired
    public RecipeService recipeService;

    @PostMapping
    public ResponseEntity<Recipe> post (@RequestBody Recipe request){
        log.info("POST /request BODY {}", request);

        return ResponseEntity.ok(recipeService.save(request));
    }

    @GetMapping
    public ResponseEntity<List<Recipe>> getAll(){
        List<Recipe> recipe = recipeService.findAll();
        return ResponseEntity.ok(recipe);
    }
}
