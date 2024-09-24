package com.example.me.gofood1.Repository;

import com.example.me.gofood1.Model.FoodCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

//public interface IFoodCardRepository extends JpaRepository<FoodCard, Integer> {

public interface IFoodCardRepository {
    static List<FoodCard> foodCardListR = new ArrayList<>();
    public FoodCard addFoodCardR(FoodCard foodCard);
    public FoodCard getFoodCardR(int id);
    public List<FoodCard> getfoodCardListR();
    public boolean deleteFoodCardR(int id);
}
