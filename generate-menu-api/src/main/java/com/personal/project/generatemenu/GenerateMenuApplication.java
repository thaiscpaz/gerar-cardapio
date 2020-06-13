package com.personal.project.generatemenu;

import com.personal.project.generatemenu.model.CulinaryMeasureEnum;
import com.personal.project.generatemenu.model.Ingredient;
import com.personal.project.generatemenu.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenerateMenuApplication /*implements CommandLineRunner*/ {

	@Autowired
	private IngredientRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(GenerateMenuApplication.class, args);
	}

}
