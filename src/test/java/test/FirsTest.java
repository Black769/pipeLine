package test;

import io.qameta.allure.*;
import page.InitPage;
import org.testng.annotations.*;
import utils.TestListener;

@Listeners({ TestListener.class })
@Epic("Allure TestNG Suite Tests")
@Feature("Allure TestNG Tests")
public class FirsTest extends BaseTest{

    @Test(priority=0, description="Realizar una búsqueda con resultados")
    @Severity(SeverityLevel.NORMAL)
    @Description("Realizar una búsqueda con resultados")
    @Attachment(value="Page screenshot",type="png")
    public void simpleTest(){
    InitPage initPage = new InitPage(webDriver);
    initPage.getUrl("https://google.com");
}
}
