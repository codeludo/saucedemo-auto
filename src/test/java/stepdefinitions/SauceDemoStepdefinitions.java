package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LoginPageSteps;
import steps.ProductToShoppingCarSteps;

public class SauceDemoStepdefinitions {

    /**
     * Test to login
     */
    @Steps
    LoginPageSteps loginSteps;

    @Given("user wants login sauce demo web site")
    public void userWantsLoginSauceDemoWebSite() {
        loginSteps.goToSaucedemoWebPage();
    }
    @When("he enters his username {string} and  password {string}")
    public void heEntersHisUsernameAndPassword(String username, String password) {
        loginSteps.userEnterCredentials(username, password);
    }
    @Then("he can see the page of products {string}")
    public void heCanSeeThePageOfProducts(String page) {
        loginSteps.validateUrl(page);
    }

    /**
     * Test to add a product to the shopping cart
     */
    @Steps
    ProductToShoppingCarSteps productToShoppingCartStep;

    @Given("that I open the browser at sauce lab page")
    public void thatIOpenTheBrowserAtSauceLabPage() {
        loginSteps.goToSaucedemoWebPage();
        loginSteps.userEnterCredentials("standard_user", "secret_sauce");
    }
    @When("I select any displayed result to go to the shopping cart")
    public void iSelectAnyDisplayedResultToGoToTheShoppingCart() {
        productToShoppingCartStep.chooseRandomProduct();
        productToShoppingCartStep.addToShoppingCart();
    }
    @Then("should the shopping cart show the product is not {string}")
    public void shouldTheShoppingCartShowTheProductIsNot(String string) {
        productToShoppingCartStep.goToCartPage();
        productToShoppingCartStep.validateShoppingCart();

    }
}
