Feature: Compra en la pagina Saucedemo

  Background:
    Given que el cliente esta en la pagina Saucedmo

  @Scenario1
  Scenario Outline: compra de productos
    When inicia sesion y agrega dos productos al carrito de compras
      | username | <username> |
      | password | <password> |

    And visualiza el carrito de compras y completa el formulario
      | firsname   | <firsname>   |
      | lasname    | <lasname>    |
      | postalcode | <postalcode> |


    Then el cliente finaliza y confirma la compra

    Examples:
      | username      | password     | firsname | lasname | postalcode |
      | standard_user | secret_sauce | Juana    | Garces  | 410011     |