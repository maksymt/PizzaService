package ua.yandex.pizza.domain;

import org.springframework.context.annotation.Bean;

/**
 * @author Maksym Ternovoy (ternovoy@yandex-team.ru).
 */
public class Pizza {
    private String name;
    private double price;
    private PizzaType type;

    public String getName() {
        return name;
    }

    public Pizza setName( String name ) {
        this.name = name;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Pizza setPrice( double price ) {
        this.price = price;
        return this;
    }

    public PizzaType getType() {
        return type;
    }

    public Pizza setType( PizzaType type ) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return com.google.common.base.Objects.toStringHelper( this )
                .add( "name", name )
                .add( "price", price )
                .add( "type", type )
                .toString();
    }
}
