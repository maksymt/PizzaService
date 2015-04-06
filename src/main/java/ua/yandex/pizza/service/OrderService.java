package ua.yandex.pizza.service;

import ua.yandex.pizza.domain.Order;

import java.util.List;

/**
 * @author Maksym Ternovoy (ternovoy@yandex-team.ru).
 */
public interface OrderService {
    List<Order> getAllOrders();
    Order createNewOrder(); // Order should be a prototype bean
    void placeOrder(Order order);
}
