package ua.yandex.pizza.service;

import ua.yandex.pizza.domain.Pizza;

import java.util.List;

/**
 * @author Maksym Ternovoy (ternovoy@yandex-team.ru).
 */
public interface PizzaService {
    List<Pizza> getAllPizzas();
}
