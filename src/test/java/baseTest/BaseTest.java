package baseTest;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.Bank.general.BankPageActions;
import pages.base.BasePage;
import pages.login.LoginAction;

public class BaseTest {
    protected WebDriver driver = CommonActions.create();
    protected BasePage basePage = new BasePage(driver);
    protected BankPageActions bankPageActions = new BankPageActions(driver);
    protected LoginAction loginAction = new LoginAction(driver);
    //@AfterTest
    public void cleanCookies(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        driver.manage().deleteAllCookies();
        javascriptExecutor.executeAsyncScript("window.sessionStorage.clear()");
    }
    @AfterSuite(alwaysRun = true)
    public void close(){
        driver.quit();
    }
}
