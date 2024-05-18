package com.saucedemo.tasks.finishAndValidate;

import com.saucedemo.questions.validateCompleteOrderMessage.ValidateMessageThankYouForYourOrder;
import com.saucedemo.tasks.viewTheCart.ValidateProducts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.saucedemo.userinterfaces.Login.BUTTON_FINISH;

public class FinalizeAndValidateThePurchase implements Task {

    public static FinalizeAndValidateThePurchase done() {
        return new FinalizeAndValidateThePurchase();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ValidateProducts.amount(),
                Scroll.to(BUTTON_FINISH),
                Click.on(BUTTON_FINISH),
                ValidateMessageThankYouForYourOrder.successful());
    }
}