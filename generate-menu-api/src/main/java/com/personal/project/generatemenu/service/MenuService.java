package com.personal.project.generatemenu.service;

import com.personal.project.generatemenu.model.Menu;
import com.personal.project.generatemenu.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    @Autowired
    public MenuRepository menuRepository;

    public Menu save(Menu menu){
        return menuRepository.save(menu);
    }

}
