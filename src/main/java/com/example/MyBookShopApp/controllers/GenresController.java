package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookshop/")
public class GenresController {

 private final MainPageController mainPageController;

    public GenresController(MainPageController mainPageController) {
        this.mainPageController = mainPageController;
    }


     @GetMapping(value = "/homepage")
    public String returnToHomePage(Model model){
        return mainPageController.mainPage(model);
    }



}
