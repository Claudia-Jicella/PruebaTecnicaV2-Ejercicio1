package com.saucedemo.stepDefinitions;

import com.saucedemo.Setup;
import com.saucedemo.model.form.FormModel;
import com.saucedemo.model.login.LoginModel;
import com.saucedemo.tasks.finishAndValidate.FinalizeAndValidateThePurchase;
import com.saucedemo.tasks.form.FillYourInformation;
import com.saucedemo.tasks.login.OpenPage;
import com.saucedemo.tasks.selectProducts.SelectProducts;
import com.saucedemo.tasks.viewTheCart.ViewTheCart;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.saucedemo.tasks.login.FillLogin.fillLogin;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class StepDefinitionsSaucedemo extends Setup {

    LoginModel loginModel;
    FormModel formModel;

    @Given("que el cliente esta en la pagina Saucedmo")
    public void que_el_cliente_esta_en_la_pagina_saucedmo() {
        actorSetupTheBrowser("cliente");
        theActorInTheSpotlight().wasAbleTo(
                OpenPage.Landing());
    }

    @When("inicia sesion y agrega dos productos al carrito de compras")
    public void inicia_sesion_y_agrega_dos_productos_al_carrito_de_compras(DataTable dataTable) {
        loginModel = new LoginModel();
        loginModel.setUsername(dataTable.row(0).get(1));
        loginModel.setPassword(dataTable.row(1).get(1));

        theActorInTheSpotlight().attemptsTo(
                fillLogin()
                        .withUsername(loginModel.getUsername())
                        .andPassword(loginModel.getPassword()),
                SelectProducts.two());
    }

    @When("visualiza el carrito de compras y completa el formulario")
    public void visualiza_el_carrito_de_compras_y_completa_el_formulario(DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(
                ViewTheCart.two());

        formModel = new FormModel();
        formModel.setFirsName(dataTable.row(0).get(1));
        formModel.setLastName(dataTable.row(1).get(1));
        formModel.setPostalCode(dataTable.row(2).get(1));

        theActorInTheSpotlight().attemptsTo(
                FillYourInformation.form()
                        .withFirsName(formModel.getFirsName())
                        .andLasName(formModel.getLastName())
                        .andPostalCode(formModel.getPostalCode()));
    }

    @Then("el cliente finaliza y confirma la compra")
    public void el_cliente_finaliza_y_confirma_la_compra() {
        theActorInTheSpotlight().attemptsTo(
                FinalizeAndValidateThePurchase.done());
    }
}