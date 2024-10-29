package com.example.me.gofood1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orderHistory")

public class OrderHistory {

    @Id
    private int orderId;
    private LocalDate date;
    private String foodName;
    private String option;
    private int quantity;
    private double price;
}
