package com.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;

public class Login {

    //region login
    public static final Target USER_NAME = Target
            .the("Campo para ingresar el usuario")
            .located(id("user-name"));

    public static final Target PASSWORD = Target
            .the("Campo para ingresar la contraseña")
            .located(id("password"));

    public static final Target BUTTON_LOGIN = Target
            .the("boton para ingresar")
            .located(id("login-button"));
    //endregion

    //region selection
    public static final Target PRODUCT_ONE = Target
            .the("seleccionar producto uno")
            .located(id("item_0_title_link"));

    public static final Target BUTTON_ADD_TO_CART = Target
            .the("boton para ingresar")
            .located(id("add-to-cart"));

    public static final Target PRODUCT_TWO = Target
            .the("seleccionar producto two")
            .located(id("item_3_title_link"));

    public static final Target BACK_TO_PRODUCTS = Target
            .the("volver al listado de productos")
            .located(id("back-to-products"));
    //endregion

    //region cart
    public static final Target ENTER_CART = Target
            .the("ingresar al carrito")
            .located(id("shopping_cart_container"));

    public static final Target QUANTITY_OF_PRODUCTS = Target
            .the("mapear la cantidad de productos")
            .locatedBy("div.cart_list div.cart_item");

    public static final Target ENTER_BUTTON_CHECKOUT = Target
            .the("verificar la compra")
            .located(id("checkout"));
    //endregion

    //region form
    public static final Target FIRS_NAME = Target
            .the("Campo para ingresar el nombre")
            .located(id("first-name"));

    public static final Target LAST_NAME = Target
            .the("Campo para ingresar el apellido")
            .located(id("last-name"));

    public static final Target POSTAL_CODE = Target
            .the("campo para ingresar el codigo postal")
            .located(id("postal-code"));

    public static final Target BUTTON_CONTINUE = Target
            .the("boton para continuar")
            .located(id("continue"));
    //endregion

    //region finish
    public static final Target BUTTON_FINISH = Target
            .the("boton para finalizar")
            .located(id("finish"));

    public static final Target SUCCESSFUL_MESSAGE = Target
            .the("mensaje exitoso Thank you for your order!")
            .locatedBy("div.checkout_complete_container h2.complete-header");
    //endregion
}