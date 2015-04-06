package ua.yandex.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.yandex.pizza.domain.Pizza;
import ua.yandex.pizza.repository.PizzaRepository;

import java.util.List;

/**
 * @author Maksym Ternovoy (ternovoy@yandex-team.ru).
 */
@Service("pizzaService")
public class SimplePizzaService implements PizzaService {
    @Autowired
    private PizzaRepository pizzaRepository;

    @Override
    public List<Pizza> getAllPizzas() {
        return pizzaRepository.getAllPizzas();
    }

    public void setPizzaRepository( PizzaRepository pizzaRepository ) {
        this.pizzaRepository = pizzaRepository;
    }
}
