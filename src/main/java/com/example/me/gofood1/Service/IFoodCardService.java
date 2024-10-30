package com.example.me.gofood1.Service;

import java.util.List;

import com.example.me.gofood1.Model.FoodCard;


public interface IFoodCardService {
    public FoodCard addFoodCard(FoodCard foodCard);
    public FoodCard getFoodCardById(int id);
    public List<FoodCard> getAllFoodCards();
    public boolean deleteFoodCard(int id);
    public FoodCard updateFoodCard(int id, FoodCard foodCard);
}