package com.saucedemo.tasks.viewTheCart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.saucedemo.userinterfaces.Login.ENTER_BUTTON_CHECKOUT;
import static com.saucedemo.userinterfaces.Login.ENTER_CART;

public class ViewTheCart implements Task {

    public static ViewTheCart two() {
        return new ViewTheCart();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ENTER_CART),
                Click.on(ENTER_CART),
                ValidateProducts.amount(),
                Click.on(ENTER_BUTTON_CHECKOUT));
    }
}