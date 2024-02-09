package pages.base;

import jdk.jfr.Timespan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constant.TimeOut.Interval_var;

public class BasePage {
    protected WebDriver _driver;
    public BasePage(WebDriver driver){
        _driver = driver;
    }
    public void open(String url){
        _driver.get(url);
    }
    public WebElement waitElement(WebElement element){
        new WebDriverWait(_driver, Duration.ofSeconds(Interval_var)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }


}
