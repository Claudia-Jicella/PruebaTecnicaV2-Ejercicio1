package com.saucedemo.questions.validateCompleteOrderMessage;

import com.saucedemo.userinterfaces.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ValidateMessageThankYouForYourOrder implements Task {

    public static ValidateMessageThankYouForYourOrder successful() {
        return new ValidateMessageThankYouForYourOrder();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        AtomicInteger index = new AtomicInteger(0);
        List<String> messageFront = new ArrayList<>();
        final String hopeMessage = "Thank you for your order!";

        messageFront.add(Text.of(Login.SUCCESSFUL_MESSAGE.of(String.valueOf(index.get()))
                .waitingForNoMoreThan(Duration.ofSeconds(20))).answeredBy(actor));


        Ensure.that(messageFront).containsAnyElementsOf(Collections.singleton(hopeMessage))
                .withReportedError("No coincide el mensaje de confirmacion de la compra").performAs(actor);
    }
}