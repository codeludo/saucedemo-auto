package steps;

import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;
import pages.InventoryItemPage;
import pages.ProductsOverviewPage;
import pages.ShoppingCartSummaryPage;

public class ProductToShoppingCarSteps {

    ProductsOverviewPage productOverview;
    InventoryItemPage item;
    ShoppingCartSummaryPage itemInCart;

    @Step
    public void chooseRandomProduct() {
        productOverview.chooseProduct();
    }

    @Step
    public void addToShoppingCart() {
        item.addToCart();
    }

    @Step
    public void goToCartPage() {
        itemInCart.open();
    }

    @Step
    public void validateShoppingCart() {
        itemInCart.exist();
    }


}
