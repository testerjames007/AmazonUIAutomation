package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.BaseClass;

public class LoginPageSteps {

    private BaseClass base;

    public LoginPageSteps(BaseClass base) {
        this.base = base;
    }

    @Given("user is on a login page")
    public void userIsOnALoginPage() {
        base.driver.get(base.baseURL + "?controller=authentication&back=my-account");
        base.scn.write("User has started the application");
    }

    @When("user has provided valid credentials")
    public void userHasProvidedValidCredentials() {
        base.driver.findElement(By.id("email")).sendKeys("blog.cucumber@gmail.com");
        base.driver.findElement(By.id("passwd")).sendKeys("Cucumber@blog");
        base.driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("user should be able to login")
    public void userShouldBeAbleToLogin() {
        String exp_message = "Welcome to your account. Here you can manage all of your personal information and orders.";
        String actual = base.driver.findElement(By.cssSelector(".info-account")).getText();
        Assert.assertEquals(exp_message, actual);
    }

}
