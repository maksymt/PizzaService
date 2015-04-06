package ua.yandex.pizza.repository;

import ua.yandex.pizza.domain.Order;

import java.util.List;

/**
 * @author Maksym Ternovoy (ternovoy@yandex-team.ru).
 */
public interface OrderRepository {
    void save( Order order );

    void find( Order order );

    List<Order> getAllOrders();

    long giveNewOrderId();
}
