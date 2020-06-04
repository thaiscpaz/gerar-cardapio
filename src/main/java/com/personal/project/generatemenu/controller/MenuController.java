package com.personal.project.generatemenu.controller;

import com.personal.project.generatemenu.model.Menu;
import com.personal.project.generatemenu.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("menu")
@Slf4j
public class MenuController {

    @Autowired
    private MenuService menuService;

    @PostMapping
    public ResponseEntity<Menu> post(@RequestBody Menu request){
        log.info("POST /menu BODY {}", request);

        request.setId(UUID.randomUUID().toString());

        request.getDays().forEach(day -> {
            day.setId(UUID.randomUUID().toString());
        });

        /*request.getDays().forEach(menu -> {

            Weekday weekday= Weekday
                    .builder()
                    .id(UUID.randomUUID().toString())
                    .day(menu.getDay())
                    .meals(menu.getMeals())
                    .build()
        });*/

        return ResponseEntity.ok(menuService.save(request));

    }



}
