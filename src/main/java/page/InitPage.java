package page;
import org.aspectj.weaver.internal.tools.MatchingContextBasedTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InitPage {
    public InitPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver,this);
    }
    private WebDriver webDriver;
@FindBy(id = "uno")
WebElement uno;

public void getUrl(String url){
    webDriver.get(url);
}
}
