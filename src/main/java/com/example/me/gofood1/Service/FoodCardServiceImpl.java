package com.example.me.gofood1.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.me.gofood1.Model.FoodCard;

@Service("FoodCardServiceImpl")
public class FoodCardServiceImpl implements IFoodCardService {
    private static List<FoodCard> foodCardList;
    private static int currentId = 1002; // Start with the last used ID

    static {
        foodCardList = new ArrayList<>();
        foodCardList.add(new FoodCard(1, "Veg Biryani", 250.00, 2, "Aromatic rice dish with mixed vegetables and spices." ,"Half"));
        foodCardList.add(new FoodCard(2, "Pizza", 200.00, 3, "Flatbread topped with sauce, cheese, and toppings.", "Full"));
    }

    @Override
    public FoodCard addFoodCard(FoodCard foodCard) {
        // Increment ID and assign to the new food card
        currentId++;
        foodCard.setId(currentId);
        foodCardList.add(foodCard);
        return foodCard;
    }

    @Override
    public FoodCard getFoodCardById(int id) {
        for (FoodCard foodCard : foodCardList) {
            if (foodCard.getId() == id) {
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
        FoodCard foodCard = getFoodCardById(id);
        if (foodCard == null) {
            return false;
        }
        foodCardList.remove(foodCard);
        return true;
    }

    @Override
    public FoodCard updateFoodCard(int id, FoodCard foodCard) {
        for (FoodCard existingFoodCard : foodCardList) {
            if (existingFoodCard.getId() == id) {
                existingFoodCard.setName(foodCard.getName());
                existingFoodCard.setPrice(foodCard.getPrice());
                existingFoodCard.setQuantity(foodCard.getQuantity());
                existingFoodCard.setCategory(foodCard.getCategory());
                return existingFoodCard;
            }
        }
        throw new RuntimeException("FoodCard not found with ID: " + id);
    }
}
