package com.example.me.gofood1.Repository;

import com.example.me.gofood1.Model.FoodCard;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class FoodCardRepositoryImpl implements IFoodCardRepository{

    static List<FoodCard> foodCardList = new ArrayList<>();

    @Override
    public FoodCard addFoodCardR(FoodCard foodCard){
        foodCardList.add(foodCard);;
        return foodCard;
    }

    @Override
    public FoodCard getFoodCardR(int id) {
        for(FoodCard product : foodCardList){
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }

    @Override
    public List<FoodCard> getfoodCardListR() {
        return foodCardList;
    }

    @Override
    public boolean deleteFoodCardR(int id) {
        for(FoodCard product : foodCardList){
            if(product.getId() == id){
                foodCardList.remove(product);
                return true;
            }
        }
        return false;
    }

}
