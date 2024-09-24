package com.example.me.gofood1.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="foodcard")
public class FoodCard {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private double price;
    @ElementCollection
    private List<Integer> quantity = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    @ElementCollection
    private List<String> option = new ArrayList<>(Arrays.asList("HALF","FULL"));
}
