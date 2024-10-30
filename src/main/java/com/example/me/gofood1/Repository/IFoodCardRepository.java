package com.example.me.gofood1.Repository;

import java.util.List;

import com.example.me.gofood1.Model.FoodCard;

public interface IFoodCardRepository {

    public FoodCard addFoodCard(FoodCard foodCard);
    public FoodCard getFoodCard(int id);
    public List<FoodCard> getfoodCardList();
    public boolean deleteFoodCard(int id);//Delete FoodCard
}
