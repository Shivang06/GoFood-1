package com.example.me.gofood1.Service;

import com.example.me.gofood1.Model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICartService {

    public List<Cart> getCart();
    public void addCart(Cart cart);
    public boolean deleteFoodItem(Cart cart);
    public void increaseQuantity(Cart cart);
    public void decreaseQuantity(Cart cart);
}
