package com.example.me.gofood1.Controller;

import com.example.me.gofood1.Model.Cart;
import com.example.me.gofood1.Service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class CartController {

    @Autowired
    private ICartService cartService;

    @GetMapping("/cart")
    public List<Cart> getCart() {
        return cartService.getCart();
    }

    @PostMapping("/add")
    public void addCart(@RequestBody Cart cart) {
        cartService.addCart(cart);
    }

    @DeleteMapping("/delete")
    public boolean deleteFoodItem(@RequestBody Cart cart) {
        return cartService.deleteFoodItem(cart);
    }

    @PutMapping("/increase")
    public void increaseQuantity(@RequestBody Cart cart) {
        cartService.increaseQuantity(cart);
    }

    @PutMapping("/decrease")
    public void decreaseQuantity(@RequestBody Cart cart) {
        cartService.decreaseQuantity(cart);
    }
}
