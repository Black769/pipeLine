package test;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
public class BaseTest {
    protected WebDriver webDriver;
    @BeforeMethod
    public void setUp(){
        //System.setProperty("webdriver.gecko.driver","/usr/bin/geckodriver");
        System.setProperty("webdriver.gecko.driver","/Users/felipe/Documents/geckodriver");
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        webDriver = new FirefoxDriver(options);
    }
    public WebDriver getWebDriver(){
        return webDriver;
    }
    @AfterMethod
    public void cleanUp(){
        webDriver.quit();
        //webDriver.close();
    }
}
