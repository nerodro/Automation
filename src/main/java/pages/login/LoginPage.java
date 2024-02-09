package pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By customer_login = By.xpath("//button[@ng-click=\"customer()\"]");
    By dropDownUsers = By.xpath("//select[@name=\"userSelect\"]");
    By HarryPotterButton = By.xpath("//option[text()=\"Harry Potter\"]");
    By LoginButton = By.xpath("//button[@ng-show=\"custId != ''\"]");
}
