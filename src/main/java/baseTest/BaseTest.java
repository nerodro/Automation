package baseTest;

import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

abstract public class BaseTest {
    public void Settings(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
    }
    @BeforeTest
    public void init(){
        Settings();
    }
    @AfterMethod
    public void Close(){
        Selenide.closeWebDriver();
    }
}
