package com.example.me.gofood1.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

    private String id; // Unique identifier for each cart item
    private String foodName;
    private int quantity;
    private double price;
    private String option;

    // Constructor to generate an ID automatically when creating a new Cart item
    public Cart(String foodName, int quantity, double price, String option) {
        this.id = UUID.randomUUID().toString();
        this.foodName = foodName;
        this.quantity = quantity;
        this.price = price;
        this.option = option;
    }
}
