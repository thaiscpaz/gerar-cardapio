package com.personal.project.generatemenu.repository;

import com.personal.project.generatemenu.model.Weekday;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WeekdayRepository extends MongoRepository<Weekday, Integer> {
}
