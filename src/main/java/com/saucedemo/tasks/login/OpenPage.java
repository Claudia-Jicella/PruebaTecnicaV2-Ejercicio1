package com.saucedemo.tasks.login;

import com.saucedemo.userinterfaces.LandingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage implements Task {

    private LandingPage landingPage;

    public static OpenPage Landing() {
        return new OpenPage();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(landingPage));
    }
}