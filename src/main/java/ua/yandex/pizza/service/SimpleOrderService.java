package ua.yandex.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;
import ua.yandex.pizza.domain.Order;
import ua.yandex.pizza.repository.OrderRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Maksym Ternovoy (ternovoy@yandex-team.ru).
 */
@Service("orderService")
public class SimpleOrderService implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Lookup(value = "order")
    public Order createEmptyOrder(){return null;};

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    @Override
    public Order createNewOrder() {
        return createEmptyOrder()
                .setId( orderRepository.giveNewOrderId() )
                .setDate( LocalDate.now() );
    }

    @Override
    public void placeOrder( Order order ) {
        orderRepository.save( order );
    }

    public void setOrderRepository( OrderRepository orderRepository ) {
        this.orderRepository = orderRepository;
    }
}
