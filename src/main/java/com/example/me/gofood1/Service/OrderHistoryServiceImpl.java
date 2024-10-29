package com.example.me.gofood1.Service;

import com.example.me.gofood1.Model.OrderHistory;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderHistoryServiceImpl implements IOrderHistoryService {

    private static List<OrderHistory> orderHistoryList = new ArrayList<>();
    static {

        OrderHistory orderHistory = new OrderHistory(1, LocalDate.now(),"Chicken Biryani", "HALF", 2, 200.90);
        OrderHistory orderHistory1 = new OrderHistory(2,LocalDate.now(), "Veg Biryani", "FULL",1,100.80);
        orderHistoryList.add(orderHistory);
        orderHistoryList.add(orderHistory1);

    }
    @Override
    public List<OrderHistory> getAllHistory() {
        return orderHistoryList;
    }

    @Override
    public OrderHistory addOrderHistory(OrderHistory orderHistory) {
        orderHistoryList.add(orderHistory);
        return orderHistory;
    }
}
