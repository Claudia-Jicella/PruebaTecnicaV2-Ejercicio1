package com.saucedemo.tasks.selectProducts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.saucedemo.userinterfaces.Login.*;

public class SelectProducts implements Task {
    public static SelectProducts two() {
        return new SelectProducts();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PRODUCT_ONE),
                Click.on(PRODUCT_ONE),
                Click.on(BUTTON_ADD_TO_CART),
                Click.on(BACK_TO_PRODUCTS),
                Scroll.to(PRODUCT_TWO),
                Click.on(PRODUCT_TWO),
                Click.on(BUTTON_ADD_TO_CART));
    }
}