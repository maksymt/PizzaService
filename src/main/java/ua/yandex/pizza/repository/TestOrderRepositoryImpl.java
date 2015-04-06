package ua.yandex.pizza.repository;

import org.springframework.stereotype.Repository;
import ua.yandex.pizza.domain.Order;
import ua.yandex.pizza.domain.Pizza;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Maksym Ternovoy (ternovoy@yandex-team.ru).
 */
@Repository("orderRepository")
public class TestOrderRepositoryImpl implements OrderRepository {
    private List<Order> orders = new LinkedList<>();

    @Override
    public List<Order> getAllOrders() {
        return orders;
    }
    
    @Override
    public void save( Order order ) {
        orders.add( order );
    }

    @Override
    public long giveNewOrderId() {
        return orders.size() + 1;
    }

    @Override
    public void find( Order order ) {

    }
}
