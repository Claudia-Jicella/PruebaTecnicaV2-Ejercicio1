package com.saucedemo.tasks.viewTheCart;

import com.saucedemo.questions.viewCart.NumberOfProducts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

public class ValidateProducts implements Task {

    public static ValidateProducts amount() {
        return new ValidateProducts();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String number = "2";
        final int productSelected = Integer.parseInt(number);

        Ensure.that("La cantidad de productos es la esperada",
                        NumberOfProducts.on())
                .isEqualTo(productSelected)
                .withReportedError("La cantidad de productos no es la esperada")
                .performAs(actor);
    }
}