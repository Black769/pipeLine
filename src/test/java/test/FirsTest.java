package test;
import page.InitPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class FirsTest {
    private WebDriver webDriver;
@BeforeMethod
    public void setUp(){
    System.setProperty("webdriver.gecko.driver","/home/felipe/geckodriver");
    //System.setProperty("webdriver.gecko.driver","/Users/felipe/Documents/geckodriver");
    webDriver = new FirefoxDriver();
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
