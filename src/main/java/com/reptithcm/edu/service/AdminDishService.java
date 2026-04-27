package com.reptithcm.edu.service;

import com.reptithcm.edu.model.Dish;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminDishService {

    private final List<Dish> dishes = new ArrayList<>();

    public AdminDishService() {
        dishes.add(new Dish(1, "Thịt bò nướng", 150000, true));
        dishes.add(new Dish(2, "Kimchi", 50000, false));
        dishes.add(new Dish(3, "Mì lạnh", 70000, true));
    }

    public Dish findById(int id) {
        return dishes.stream()
                .filter(d -> d.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Dish> getAll() {
        return dishes;
    }
}