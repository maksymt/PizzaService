package ua.yandex.pizza;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.yandex.pizza.domain.Order;
import ua.yandex.pizza.domain.Pizza;
import ua.yandex.pizza.service.OrderService;
import ua.yandex.pizza.service.PizzaService;

import java.util.Arrays;
import java.util.List;

/**
 * @author Maksym Ternovoy (ternovoy@yandex-team.ru).
 */
public class AppRunner {
    public static void main( String[] args ) {

        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext( "secondConfig.xml" );
        ConfigurableApplicationContext appContext
                = new ClassPathXmlApplicationContext( new String[]{ "springConfig.xml" }, applicationContext );

        PizzaService pizzaService = appContext.
                getBean( PizzaService.class );
        List<Pizza> pizzas = pizzaService.getAllPizzas();
        OrderService orderService = appContext.
                getBean( "orderService", OrderService.class );
        Order newOrder1 = orderService.createNewOrder();
        newOrder1.addItems( pizzas.get( 0 ), pizzas.get( 1 ) );
        orderService.placeOrder( newOrder1 );
        Order newOrder2 = orderService.createNewOrder();
        newOrder2.addItems( pizzas.get( 0 ) );
        orderService.placeOrder( newOrder2 );
        List<Order> orders = orderService.getAllOrders();
        orders.stream().forEach( System.out::println );
        System.out.println( "\n!!!!!!!!!!!!!!!\n" );

        Arrays.asList( appContext.getBeanDefinitionNames() ).forEach( System.out::println );
        Arrays.asList( applicationContext.getBeanDefinitionNames() ).forEach( System.out::println );
    }
}
