package utils;

import cucumber.api.Scenario;
import org.openqa.selenium.WebDriver;
import pages.SearchPage;

public class BaseClass {

    public String baseURL = "http://automationpractice.com/index.php";
    public WebDriver driver;
    public Scenario scn;
    public SearchPage searchPage;

    public void initializePageClasses(WebDriver driver, Scenario scn){
        this.driver = driver;
        this.scn = scn;
        searchPage = new SearchPage(driver, scn);
    }

    public SearchPage getSearchPage(){
        return searchPage;
    }

}
