package com.example.me.gofood1.Repository;

import com.example.me.gofood1.Model.FoodCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodCardRepository extends JpaRepository<FoodCard, Integer> {

}
