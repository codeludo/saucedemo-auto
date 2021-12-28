Feature: login standard user
  As a standard user of saucedemo
  I want login
  And have a successful login

  @loginSuccessful
  Scenario: login successful
    Given user wants login sauce demo web site
    When he enters his username "standard_user" and  password "secret_sauce"
    Then he can see the page of products "https://www.saucedemo.com/inventory.html"