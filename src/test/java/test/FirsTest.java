package test;
import org.openqa.selenium.firefox.FirefoxOptions;
import page.InitPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class FirsTest {
    private WebDriver webDriver;
@BeforeMethod
    public void setUp(){
    System.setProperty("webdriver.gecko.driver","/usr/bin/geckodriver");
    //System.setProperty("webdriver.gecko.driver","/Users/felipe/Documents/geckodriver");
    FirefoxOptions options = new FirefoxOptions();
    options.setHeadless(true);
    webDriver = new FirefoxDriver(options);

}
@Test
    public void simpleTest(){
    InitPage initPage = new InitPage(webDriver);
    initPage.getUrl("https://google.com");
}
@AfterMethod
    public void cleanUp(){
    webDriver.quit();
    //webDriver.close();
}
}
