package ua.yandex.pizza.repository;

import org.springframework.stereotype.Repository;
import ua.yandex.pizza.domain.Pizza;

import java.util.List;

/**
 * @author Maksym Ternovoy (ternovoy@yandex-team.ru).
 */
public interface PizzaRepository {
    List<Pizza> getAllPizzas();
}
