package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.LoginPage;

public class LoginPageSteps {

    LoginPage page;

    @Step
    public void goToSaucedemoWebPage() {
        page.open();
    }

    @Step
    public void userEnterCredentials(String username, String password) {
        page.EnterCredentials(username, password);
    }

    @Step
    public void validateUrl(String url) {
        Assert.assertEquals(page.resultUrl(), url);
    }
}
