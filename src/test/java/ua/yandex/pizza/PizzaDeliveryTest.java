package ua.yandex.pizza;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ua.yandex.pizza.domain.Order;
import ua.yandex.pizza.domain.Pizza;
import ua.yandex.pizza.repository.OrderRepository;
import ua.yandex.pizza.service.OrderService;
import ua.yandex.pizza.service.PizzaService;

import java.util.List;

/**
 * @author Maksym Ternovoy (ternovoy@yandex-team.ru).
 */
public class PizzaDeliveryTest extends ExtendedConfig {

    @Autowired
    private PizzaService pizzaService;
    @Autowired
    private OrderService orderService;

    @Test
    public void testPizzaDelivery() {
        List<Pizza> pizzas = pizzaService.getAllPizzas();
        Order newOrder1 = orderService.createNewOrder();
        newOrder1.addItems( pizzas.get( 0 ), pizzas.get( 1 ) );
        orderService.placeOrder( newOrder1 );
        Order newOrder2 = orderService.createNewOrder();
        newOrder2.addItems( pizzas.get( 0 ) );
        orderService.placeOrder( newOrder2 );
        List<Order> orders = orderService.getAllOrders();
        orders.stream().forEach( System.out::println );
    }
}
