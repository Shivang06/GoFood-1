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
        foodCardList.add(new FoodCard(3, "Paneer Butter Masala", 180.00, 4, "Creamy, spiced curry made with paneer cubes.", "Half"));
        foodCardList.add(new FoodCard(4, "Chicken Tikka Masala", 300.00, 5, "Grilled chicken in a rich, creamy tomato sauce.", "Full"));
        foodCardList.add(new FoodCard(5, "Chole Bhature", 150.00, 4, "Spicy chickpea curry served with deep-fried bread.", "Full"));
        foodCardList.add(new FoodCard(6, "Masala Dosa", 120.00, 3, "Crispy rice crepe filled with spiced potato mix.", "Full"));
        foodCardList.add(new FoodCard(7, "Pav Bhaji", 100.00, 3, "Mixed vegetable curry served with buttered rolls.", "Full"));
        foodCardList.add(new FoodCard(8, "Butter Naan", 40.00, 2, "Soft flatbread with a buttery finish, perfect with curries.", "Full"));
        foodCardList.add(new FoodCard(9, "Samosa", 20.00, 1, "Deep-fried pastry with a spicy potato filling.", "Full"));
        foodCardList.add(new FoodCard(10, "Gulab Jamun", 50.00, 2, "Sweet fried dough balls soaked in sugar syrup.", "Full"));

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
                existingFoodCard.setDescription(foodCard.getDescription());
                return existingFoodCard;
            }
        }
        throw new RuntimeException("FoodCard not found with ID: " + id);
    }
}
