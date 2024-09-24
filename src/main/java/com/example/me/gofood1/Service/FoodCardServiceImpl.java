package com.example.me.gofood1.Service;

import com.example.me.gofood1.Model.FoodCard;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class FoodCardServiceImpl implements IFoodCardService {
    private static List<FoodCard> foodCardList;
    static{
        foodCardList = new ArrayList<>();
        foodCardList.add(new FoodCard(1001,"Chicken Biryani",250.00,new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6)),new ArrayList<>(Arrays.asList("HAlF","FULL"))));
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
    public FoodCard updateFoodCard(FoodCard foodCard) {
        for (int i = 0; i < foodCardList.size(); i++) {
            FoodCard foodCard1 = foodCardList.get(i);
            if (foodCard1.getId() == foodCard.getId()) {
                foodCard1.setName(foodCard.getName());
                foodCard1.setPrice(foodCard.getPrice());
                foodCard1.setQuantity(foodCard.getQuantity());
                return foodCard1;
            }
        }
        return null;
    }
}
