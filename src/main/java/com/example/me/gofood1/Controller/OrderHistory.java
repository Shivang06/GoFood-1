package com.example.me.gofood1.Controller;

import com.example.me.gofood1.Service.IOrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderHistory  {



    @Autowired
    private IOrderHistoryService orderHistoryService;


    @GetMapping("/history")
    public List<com.example.me.gofood1.Model.OrderHistory> getAllHistory() {
        return orderHistoryService.getAllHistory();
    }


    @PostMapping("/add-History")
    public com.example.me.gofood1.Model.OrderHistory addOrderHistory(@RequestBody com.example.me.gofood1.Model.OrderHistory orderHistory) {
        return orderHistoryService.addOrderHistory(orderHistory);
    }


}
