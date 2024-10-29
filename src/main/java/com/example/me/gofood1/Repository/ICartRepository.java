package com.example.me.gofood1.Repository;

import java.util.List;

import com.example.me.gofood1.Model.Cart;

public interface ICartRepository {

    public List<Cart> getCart();
    public boolean deleteFoodItem(Cart cart);
    public void increaseQuantity(Cart cart);
    public void decreaseQuantity(Cart cart);
}
