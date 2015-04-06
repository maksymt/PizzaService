package ua.yandex.pizza.domain;

import com.google.common.base.Objects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Maksym Ternovoy (ternovoy@yandex-team.ru).
 */
@Component("order")
@Scope(value = "prototype")
public class Order {
    private long id;
    private LocalDate date;
    private String name;
    private List<Pizza> pizzas = new LinkedList<Pizza>();
    private double price;


    public Order setId( long id ) {
        this.id = id;
        return this;
    }

    public Order setDate( LocalDate date ) {
        this.date = date;
        return this;
    }

    public long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas( List<Pizza> pizzas ) {
        this.pizzas = pizzas;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice( double price ) {
        this.price = price;
    }

    public void addItems( Pizza item ) {
        pizzas.add( item );
    }

    public void addItems( Pizza firstItem, Pizza secondItem ) {
        pizzas.add( firstItem );
        pizzas.add( secondItem );
    }

    @Override
    public String toString() {
        return Objects.toStringHelper( this )
                .add( "id", id )
                .add( "date", date )
                .add( "name", name )
                .add( "pizzas", pizzas )
                .add( "price", price )
                .toString();
    }
}
