package pages;
/***
 * @author Shital Pashankar
 */

import cucumber.api.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;



public class SearchPage {
    WebDriver driver;

    @FindBy(id="search_query_top")
    WebElement txtbxSearch;

    @FindBy(name="submit_search")
    WebElement btnSubmit;

    public SearchPage(WebDriver driver, Scenario scn){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchForAProduct(String productName){
        txtbxSearch.sendKeys(productName);
        btnSubmit.click();
    }


}
