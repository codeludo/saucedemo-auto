package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.saucedemo.com/cart.html")
public class ShoppingCartSummaryPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[1]")
    WebElement elementInShoppingCart;


    public String exist() {
        if(elementInShoppingCart.getText().isEmpty()){
            return elementInShoppingCart.getText();
        }else return "null";
    }
}
