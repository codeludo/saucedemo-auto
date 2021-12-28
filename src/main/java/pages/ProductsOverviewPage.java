package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class ProductsOverviewPage extends PageObject {

    @FindBy(xpath = "//*[@class=\"inventory_list\"]")
    List<WebElement> products;


    public void chooseProduct() {
        try{
            int numberRandom = RandomUtils.nextInt(1,products.size());
            WebElement anchor = getDriver().findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div["+numberRandom+"]/div[2]/div[1]/a"));
            anchor.click();

        }catch (NotFoundException elementException){
            elementException.printStackTrace();
        }
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
