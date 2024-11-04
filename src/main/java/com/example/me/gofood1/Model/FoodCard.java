package com.example.me.gofood1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="foodcard")
public class FoodCard {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "foodcard_seq")
    @SequenceGenerator(name = "foodcard_seq", sequenceName = "foodcard_sequence", allocationSize = 1)
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String description;
    private String category;
}
