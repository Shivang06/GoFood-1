package com.example.me.gofood1.Repository;

import com.example.me.gofood1.Model.FoodCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

//public interface IFoodCardRepository extends JpaRepository<FoodCard, Integer> {

    public interface IFoodCardRepository {
    static List<FoodCard> foodCardList = new ArrayList<>();
    public FoodCard addFoodCard(FoodCard foodCard);
    public FoodCard getFoodCard(int id);
    public List<FoodCard> getfoodCardList();
    public boolean deleteFoodCard(int id);
}
