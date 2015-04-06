package ua.yandex.pizza.repository;

import org.springframework.stereotype.Repository;
import ua.yandex.pizza.domain.Pizza;
import ua.yandex.pizza.domain.PizzaType;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Maksym Ternovoy (ternovoy@yandex-team.ru).
 */
public class TestPizzaRepositoryImpl implements PizzaRepository {
    private List<Pizza> pizzas;


    @Override
    public List<Pizza> getAllPizzas() {
        return pizzas;
    }

    public void setPizzas( List<Pizza> pizzas ) {
        this.pizzas = pizzas;
    }
}
