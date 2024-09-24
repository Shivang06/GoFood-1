package com.example.me.gofood1.Repository;

import com.example.me.gofood1.Model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICartRepository {


    public List<Cart> getCart();
    public boolean deleteFoodItem(Cart cart);
    public void increaseQuantity(Cart cart);
    public void decreaseQuantity(Cart cart);
}
