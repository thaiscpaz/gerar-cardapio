package com.personal.project.generatemenu.repository;

import com.personal.project.generatemenu.model.Menu;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MenuRepository extends MongoRepository<Menu, Integer> {
}
