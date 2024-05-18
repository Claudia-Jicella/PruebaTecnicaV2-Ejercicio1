package com.saucedemo.questions.viewCart;

import com.saucedemo.userinterfaces.Login;
import com.saucedemo.utils.KeyToRemember;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

public class NumberOfProducts implements Question<Integer> {

    public static NumberOfProducts on() {
        return new NumberOfProducts();
    }

    @Override
    public Integer answeredBy(Actor actor) {
        final List<String> quantityOfProducts = new ArrayList<>();

        Login.QUANTITY_OF_PRODUCTS.resolveAllFor(actor).forEach(forEachProducts ->
                quantityOfProducts.add(forEachProducts.getText())
        );
        actor.remember(KeyToRemember.NUMBER_PRODUCTS_ENABLER.name(), quantityOfProducts.size());
        return quantityOfProducts.size();
    }
}