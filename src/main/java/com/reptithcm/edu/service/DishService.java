package com.reptithcm.edu.service;
import com.reptithcm.edu.model.Dish;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DishService {
    // giả sử lấy đc từ repository
    public List<Dish> getAllDishes() {
        List<Dish> list = new ArrayList<>();

        list.add(new Dish(1, "Thịt bò nướng", 150000, true));
        list.add(new Dish(2, "Kimchi", 50000, false));
        list.add(new Dish(3, "Mì lạnh", 70000, true));

        return list;
    }
}
