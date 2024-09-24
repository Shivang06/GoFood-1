package com.example.me.gofood1.Controller;

import com.example.me.gofood1.Service.IOrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderHistory implements IOrderHistoryService {


    @Qualifier("orderHistoryServiceImpl")
    @Autowired
    private IOrderHistoryService orderHistoryService;

    @Override
    @GetMapping("/history")
    public List<com.example.me.gofood1.Model.OrderHistory> getAllHistory() {
        return orderHistoryService.getAllHistory();
    }

    @Override
    @PostMapping("/add-History")
    public com.example.me.gofood1.Model.OrderHistory addOrderHistory(@RequestBody com.example.me.gofood1.Model.OrderHistory orderHistory) {
        return orderHistoryService.addOrderHistory(orderHistory);
    }


}
