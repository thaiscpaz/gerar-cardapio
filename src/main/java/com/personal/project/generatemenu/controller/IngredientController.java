package com.personal.project.generatemenu.controller;

import com.personal.project.generatemenu.model.Ingredient;
import com.personal.project.generatemenu.service.IngredientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("ingredient")
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

  /*  @GetMapping
    public ResponseEntity<List<Ingredient>> getAll() throws Exception {
        List<Ingredient> ingredients = ingredientService.findAll();
        return ResponseEntity.ok(ingredients);
    }*/

    @GetMapping
    public ResponseEntity<List<Ingredient>> get(@RequestParam(value = "searchFor", required = true) String searchFor) throws Exception {
        List<Ingredient> ingredients = ingredientService.findAllByName(searchFor);
        return ResponseEntity.ok(ingredients);
    }

    @PostMapping
    public ResponseEntity<Ingredient> post(@RequestBody Ingredient request){
        log.info("POST /ingredient BODY {}", request.getName());

        return ResponseEntity.ok(ingredientService.save(request));
    }

}
