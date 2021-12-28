package pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"user-name\"]")
    WebElement textBoxUsername;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement textBoxPassword;

    @FindBy(xpath = "//*[@id=\"login-button\"]")
    WebElement btnLogin;


    public void EnterCredentials(String username, String password) {
        textBoxUsername.sendKeys(username);
        textBoxPassword.sendKeys(password);
        btnLogin.submit();

        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    public String resultUrl() {
        return getDriver().getCurrentUrl();
    }
}
