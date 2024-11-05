package com.example.me.gofood1.Service;

import com.example.me.gofood1.Model.Cart;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CartServiceImpl implements ICartService {

    private static List<Cart> carts = new ArrayList<>();

    static {
        // Add sample items
        // carts.add(new Cart("Chicken Biryani", 200.90, 3, "Best Biryani", "Half"));
        // carts.add(new Cart("Veg Biryani", 190.80, 3, "Best Veg Biryani", "Full"));
    }

    @Override
    public List<Cart> getCart() {
        return carts;
    }

    @Override
    public boolean deleteFoodItem(Cart cart) {
        return carts.removeIf(c -> c.getId().equals(cart.getId()));
    }

    @Override
    public void increaseQuantity(Cart cart) {
        findCartById(cart.getId()).ifPresent(c -> c.setQuantity(c.getQuantity() + 1));
    }

    @Override
    public void decreaseQuantity(Cart cart) {
        findCartById(cart.getId()).ifPresent(c -> c.setQuantity(Math.max(c.getQuantity() - 1, 0)));
    }

    @Override
    public void addCart(Cart cart) {
        cart.setId(UUID.randomUUID().toString()); // Generate a unique ID for the new cart item
        carts.add(cart);
    }

    private Optional<Cart> findCartById(String id) {
        return carts.stream().filter(c -> c.getId().equals(id)).findFirst();
    }
}
