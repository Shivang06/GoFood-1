package com.example.me.gofood1.Controller;

import com.example.me.gofood1.Model.FoodCard;
import com.example.me.gofood1.Service.IFoodCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FoodCardController {


    private IFoodCardService foodCardService;

    @PostMapping("/foodcards")
    public ResponseEntity<FoodCard> saveProduct(@RequestBody FoodCard foodCard) {
        FoodCard savedfoodCard = foodCardService.addFoodCard(foodCard);
        if(savedfoodCard != null) {
            return ResponseEntity.ok(savedfoodCard);
        }
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/foodcards")
    public ResponseEntity<List<FoodCard>> getAllProducts() {
        List<FoodCard> foodCardList = foodCardService.getAllFoodCards();
        if(foodCardList.size()>0) {
            return ResponseEntity.ok(foodCardList);
        }
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }


    @GetMapping("/foodcards/{id}")
    public ResponseEntity<FoodCard> getProductById(@PathVariable("id") Integer id) {
        FoodCard foodCard = foodCardService.getFoodCardById(id);
        if(foodCard!=null) {
            return ResponseEntity.ok(foodCard);
        }
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/foodcards/{id}")
    public ResponseEntity<String> deleteProductById(@PathVariable("id") Integer id) {
        boolean isDeleted = foodCardService.deleteFoodCard(id);
        if (isDeleted) {
            return ResponseEntity.ok("Food card deleted successfully.");
        }
        return new ResponseEntity<>("Food card not found.", HttpStatus.NOT_FOUND);
    }

}
