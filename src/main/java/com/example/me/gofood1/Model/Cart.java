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
    private double price;
    private int quantity;
    private String description;
    private String category;

    // Constructor to generate an ID automatically when creating a new Cart item
    public Cart(String foodName, double price, int quantity, String description, String category) {
        this.id = UUID.randomUUID().toString();
        this.foodName = foodName;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.category = category;
    }
}
