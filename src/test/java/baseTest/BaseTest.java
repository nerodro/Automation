package baseTest;

import baseTest.BankPage.BankPage;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;

abstract public class BaseTest {
    public void Settings(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
    }
    @Before
    public void init(){
        Settings();
        BankPage bankPage = new BankPage();
    }
    @After
    public void Close(){
        Selenide.closeWebDriver();
    }

}
