package com.example.me.gofood1.Controller;

import com.example.me.gofood1.Model.FoodCard;
import com.example.me.gofood1.Service.IFoodCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FoodCardController {

    @Autowired
    private IFoodCardService foodCardService;

    @PostMapping("/foodcards")
    public FoodCard saveProduct(@RequestBody FoodCard foodCard) {

        FoodCard savedfoodCard = foodCardService.addFoodCard(foodCard);
        return savedfoodCard;
    }

    @GetMapping("/foodcards")
    public List<FoodCard> getAllProducts() {
         List<FoodCard> foodCardList = foodCardService.getAllFoodCards();
        return foodCardList;
    }

    @GetMapping("/foodcards/{id}")
    public FoodCard getFoodCard(@PathVariable Integer id) {

        FoodCard foodCard = foodCardService.getFoodCardById(id);
        return foodCard;
    }

    @DeleteMapping("/foodcards/{id}")
    public String deleteFoodCard(Integer id) {
        if(foodCardService.deleteFoodCard(id)) {
            return "Food Card deleted successfully";
        }
        return "Food Card is not found to delete";
    }
}
