package com.example.me.gofood1.Repository;

import com.example.me.gofood1.Model.OrderHistory;

import java.util.List;

public interface IOrderHistoryRepository {

    public List<OrderHistory> getAllHistory();
    public OrderHistory addOrderHistory(OrderHistory orderHistory);
}
