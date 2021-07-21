package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.BaseClass;

import java.util.concurrent.TimeUnit;

public class Hooks {

    private BaseClass base;

    public Hooks(BaseClass base) {
        this.base = base;
    }

    @Before
    public  void initDriver(Scenario scn){
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        base.driver = new ChromeDriver(chromeOptions);
        base.driver.manage().deleteAllCookies();
        base.driver.manage().window().maximize();
        base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        base.scn = scn;
        base.scn.write("Launched the chrome browser");
        base.initializePageClasses(base.driver, base.scn);
    }

    @After
    public void teardown(Scenario scn) {
        if(base.scn.isFailed()){
        final byte[] screenshot = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.BYTES);
        scn.embed(screenshot, "image/png");
        }
        base.scn.write("Closed the browser");
        base.driver.quit();
    }
}
