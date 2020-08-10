package com.personal.project.generatemenu.service;

import com.personal.project.generatemenu.model.Weekday;
import com.personal.project.generatemenu.repository.WeekdayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeekdayService {

    @Autowired
    public WeekdayRepository weekdayRepository;

    public Weekday save(Weekday weekday){
        return weekdayRepository.save(weekday);
    }

}
