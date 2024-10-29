package com.example.me.gofood1.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.me.gofood1.Model.FoodCard;

@Service("FoodCardServiceImpl")
public class FoodCardServiceImpl implements IFoodCardService {
    private static List<FoodCard> foodCardList;
    static{
        foodCardList = new ArrayList<>();
        foodCardList.add(new FoodCard(1001,"Chicken Biryani",250.00,1,"HALF"));
        foodCardList.add(new FoodCard(1002,"Veg Biryani",200.00,3,"FULL"));

    }
    @Override
    public FoodCard addFoodCard(FoodCard foodCard) {
        foodCardList.add(foodCard);
        return foodCard;
    }

    @Override
    public FoodCard getFoodCardById(int id) {
        for(FoodCard foodCard : foodCardList){
            if(foodCard.getId()==id){
                return foodCard;
            }
        }
        return null;
    }

    @Override
    public List<FoodCard> getAllFoodCards() {
        return foodCardList;
    }

    @Override
    public boolean deleteFoodCard(int id) {
        if(getFoodCardById(id)==null){
            return false;
        }
        foodCardList.remove(getFoodCardById(id));
        return true;
    }

    @Override
    public FoodCard updateFoodCard(int id, FoodCard foodCard) {
        for (FoodCard foodCard1 : foodCardList) {
            if (foodCard1.getId()==id) {
                // Update the fields
                foodCard1.setName(foodCard.getName());
                foodCard1.setPrice(foodCard.getPrice());
                foodCard1.setQuantity(foodCard.getQuantity());
                foodCard1.setCategory(foodCard.getCategory());
                return foodCard1;
            }
        }
        throw new RuntimeException("FoodCard not found with ID: " + id);
    }
}
