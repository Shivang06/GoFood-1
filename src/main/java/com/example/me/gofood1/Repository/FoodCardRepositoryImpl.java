package com.example.me.gofood1.Repository;

import com.example.me.gofood1.Model.FoodCard;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FoodCardRepositoryImpl implements IFoodCardRepository{

    static List<FoodCard> foodCardList = new ArrayList<>();
    static{
        foodCardList = new ArrayList<>();
        foodCardList.add(new FoodCard(1001,"Chicken Biryani",250.00,new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6)),new ArrayList<>(Arrays.asList("HAlF","FULL"))));
        foodCardList.add(new FoodCard(1002,"Veg Biryani",200.00,new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6)),new ArrayList<>(Arrays.asList("HAlF","FULL"))));

    }

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
