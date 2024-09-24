package com.example.me.gofood1.Service;

import com.example.me.gofood1.Model.FoodCard;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IFoodCardService {
    public FoodCard addFoodCard(FoodCard foodCard);
    public FoodCard getFoodCardById(int id);
    public List<FoodCard> getAllFoodCards();
    public boolean deleteFoodCard(int id);
    public FoodCard updateFoodCard(FoodCard foodCard);
}