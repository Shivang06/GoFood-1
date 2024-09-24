package com.example.me.gofood1.Service;

import com.example.me.gofood1.Model.Cart;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ICartServiceImpl implements ICartService {

    static List<Cart> Carts = new ArrayList<>();
    static {

        Carts.add(new Cart("Chicken Biryani", 2, 200.90));
        Carts.add(new Cart("Veg Biryani", 1, 90.80));
    }


    @Override
    public List<Cart> getCart() {
        return Carts;
    }

    @Override
    public boolean deleteFoodItem(Cart cart) {
        if (Carts.contains(cart)) {
            Carts.remove(cart);
            return true;
        }
        return false;
    }

    @Override
    public void increaseQuantity(Cart cart) {

        for(Cart cart1 : Carts) {
            if(cart1.equals(cart)) {
                cart1.setQuantity(cart1.getQuantity() + 1);
            }
        }
    }

    @Override
    public void decreaseQuantity(Cart cart) {

        for(Cart cart1 : Carts) {
            if(cart1.equals(cart)) {
                cart1.setQuantity(cart1.getQuantity() - 1);
            }
        }
    }

    @Override
    public void addCart(Cart cart) {
        Carts.add(cart);
    }


}
