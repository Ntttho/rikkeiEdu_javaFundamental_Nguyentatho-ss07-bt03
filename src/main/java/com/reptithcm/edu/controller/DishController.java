package com.reptithcm.edu.controller;

import com.reptithcm.edu.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DishController {
    private DishService dishService;

    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @GetMapping("/bai2/dishes")
    public String showDishes(Model model) {
        model.addAttribute("dishes", dishService.getAllDishes());
        return "dish-list";
    }
}