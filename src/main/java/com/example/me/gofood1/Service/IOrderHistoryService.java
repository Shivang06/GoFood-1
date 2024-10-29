package com.example.me.gofood1.Service;

import com.example.me.gofood1.Model.OrderHistory;

import java.util.List;

public interface IOrderHistoryService {


    public List<OrderHistory> getAllHistory();
    public OrderHistory addOrderHistory(OrderHistory orderHistory);

}
