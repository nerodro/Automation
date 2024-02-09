package pages.login;

import org.openqa.selenium.WebDriver;
import pages.Bank.general.BankPageActions;

public class LoginAction extends LoginPage {
    public LoginAction(WebDriver driver) {
        super(driver);
    }
    public LoginAction ClickOnCustomerLogin(){
        _driver.findElement(customer_login).click();
        return this;
    }
    public LoginAction ClickOnDropdown(){
        _driver.findElement(dropDownUsers).click();
        return this;
    }
    public LoginAction SelectUserInDropDown(){
        _driver.findElement(HarryPotterButton).click();
        return this;
    }
    public LoginAction LoginClick(){
        _driver.findElement(LoginButton).click();
        return this;
    }
}
