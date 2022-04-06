package test;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    protected WebDriver webDriver;
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        System.setProperty("webdriver.gecko.driver","/usr/bin/geckodriver");
        //System.setProperty("webdriver.gecko.driver","/Users/felipe/Documents/geckodriver");
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        //webDriver = new RemoteWebDriver(new URL("rewre"),options);
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
