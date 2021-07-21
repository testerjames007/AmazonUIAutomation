package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseClass;

import java.util.List;

public class SearchPageSteps {

    private BaseClass base;

    public SearchPageSteps(BaseClass base) {
        this.base = base;
    }

    @When("user search for the product {string}")
    public void userSearchForTheProduct(String productName) {
        base.getSearchPage().searchForAProduct(productName);
    }

    @Then("user should see the products for {string}")
    public void userShouldSeeTheProductsFor(String productName) {
        List<WebElement> productList = base.driver.findElements(By.xpath
                ("//ul[@class='product_list grid row']/li//a[@class='product-name']"));
        for(WebElement product : productList){
            product.getText().contains(productName);
        }
    }
}
