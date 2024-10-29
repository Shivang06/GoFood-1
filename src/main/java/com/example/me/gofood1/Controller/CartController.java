package com.example.me.gofood1.Controller;

import com.example.me.gofood1.Model.Cart;
import com.example.me.gofood1.Service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CartController  {


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
       if(cartService.deleteFoodItem(cart)){
           return true;
       }
       return false;
    }


    @PutMapping("/increase")
    public void increaseQuantity(@RequestBody Cart cart) {

        cartService.increaseQuantity(cart);
    }


    @GetMapping("/decrease")
    public void decreaseQuantity(@RequestBody Cart cart) {

        cartService.decreaseQuantity(cart);
    }
}
