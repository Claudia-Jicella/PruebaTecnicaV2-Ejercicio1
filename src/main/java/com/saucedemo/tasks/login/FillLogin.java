package com.saucedemo.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.saucedemo.userinterfaces.Login.*;

public class FillLogin implements Task {

    public static FillLogin fillLogin() {
        return new FillLogin();
    }

    private String username;
    private String password;

    public FillLogin withUsername(String user) {
        this.username = user;
        return this;
    }

    public FillLogin andPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(USER_NAME),
                Enter.theValue(username).into(USER_NAME),

                Scroll.to(PASSWORD),
                Enter.theValue(password).into(PASSWORD),

                Scroll.to(BUTTON_LOGIN),
                Click.on(BUTTON_LOGIN)
        );
    }
}