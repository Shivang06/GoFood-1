package com.example.me.gofood1.Repository;

import com.example.me.gofood1.Model.FoodCard;

import java.util.ArrayList;
import java.util.List;

public class FoodCardRepositoryImpl implements IFoodCardRepository{

    static List<FoodCard> foodCardList = new ArrayList<>();

    @Override
    public FoodCard addFoodCard(FoodCard foodCard){
        foodCardList.add(foodCard);;
        return foodCard;
    }

    @Override
    public FoodCard getFoodCard(int id) {
        for(FoodCard product : foodCardList){
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }

    @Override
    public List<FoodCard> getfoodCardList() {
        return foodCardList;
    }

    @Override
    public boolean deleteFoodCard(int id) {
        for(FoodCard product : foodCardList){
            if(product.getId() == id){
                foodCardList.remove(product);
                return true;
            }
        }
        return false;
    }

}
