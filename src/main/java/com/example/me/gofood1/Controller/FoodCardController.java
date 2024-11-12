package com.example.me.gofood1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.me.gofood1.Model.FoodCard;
import com.example.me.gofood1.Service.IFoodCardService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class FoodCardController {


    @Autowired
    private IFoodCardService foodCardService;

    @PostMapping("/foodcards")
    public ResponseEntity<FoodCard> createFoodCard(@RequestBody FoodCard foodCard) {
        FoodCard savedFoodCard = foodCardService.addFoodCard(foodCard);
        if (savedFoodCard != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(savedFoodCard);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @GetMapping("/foodcards")
    public ResponseEntity<List<FoodCard>> getAllFoodCards() {
        List<FoodCard> foodCardList = foodCardService.getAllFoodCards();
        if (!foodCardList.isEmpty()) {
            return ResponseEntity.ok(foodCardList);
        }
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(foodCardList);
    }

    @GetMapping("/foodcards/{id}")
    public ResponseEntity<FoodCard> getFoodCardById(@PathVariable("id") Integer id) {
        FoodCard foodCard = foodCardService.getFoodCardById(id);
        if (foodCard != null) {
            return ResponseEntity.ok(foodCard);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @PutMapping("/foodcards/{id}")
    public ResponseEntity<FoodCard> updateFoodCard(@PathVariable("id") Integer id, @RequestBody FoodCard foodCard) {
        FoodCard updatedFoodCard = foodCardService.updateFoodCard(id, foodCard);
        if (updatedFoodCard != null) {
            return ResponseEntity.ok(updatedFoodCard);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @DeleteMapping("/foodcards/{id}")
    public ResponseEntity<String> deleteFoodCard(@PathVariable("id") Integer id) {
        boolean isDeleted = foodCardService.deleteFoodCard(id);
        if (isDeleted) {
            return ResponseEntity.ok("Food card deleted successfully.");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Food card not found.");
    }

}
