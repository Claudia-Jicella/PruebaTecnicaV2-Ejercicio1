package com.saucedemo.tasks.form;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.saucedemo.userinterfaces.Login.*;

public class FillYourInformation implements Task {

    public static FillYourInformation form() {
        return new FillYourInformation();
    }

    private String firsName;
    private String lastName;
    private String postalCode;

    public FillYourInformation withFirsName(String name) {
        this.firsName = name;
        return this;
    }

    public FillYourInformation andLasName(String lasName) {
        this.lastName = lasName;
        return this;
    }

    public FillYourInformation andPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firsName).into(FIRS_NAME),
                Enter.theValue(lastName).into(LAST_NAME),
                Enter.theValue(postalCode).into(POSTAL_CODE),
                Scroll.to(BUTTON_CONTINUE),
                Click.on(BUTTON_CONTINUE));
    }
}