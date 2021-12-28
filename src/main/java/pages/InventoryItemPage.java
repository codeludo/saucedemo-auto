package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class InventoryItemPage extends PageObject {

    @FindBy(xpath = "//*[@class=\"btn btn_primary btn_small btn_inventory\"]")
    WebElement btnAddToCart;


    public void addToCart() {
        btnAddToCart.click();
    }
}
