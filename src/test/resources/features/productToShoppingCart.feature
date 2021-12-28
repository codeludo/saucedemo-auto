Feature: Add a product to shopping cart
  As a user I want to add a product to the cart

  @productToShoppingCart
  Scenario: choose a product and it is displayed in the shopping cart successfully
    Given that I open the browser at sauce lab page
    When I select any displayed result to go to the shopping cart
    Then should the shopping cart show the product is not "null"