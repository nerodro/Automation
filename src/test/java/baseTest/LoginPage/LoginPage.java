package baseTest.LoginPage;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static baseTest.Constant.base_Url;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement customer_login = $(By.xpath("//button[@ng-click=\"customer()\"]"));
    private SelenideElement dropDownUsers = $(By.xpath("//select[@name=\"userSelect\"]"));
    private SelenideElement HarryPotterButton = $(By.xpath("//option[text()=\"Harry Potter\"]"));
    private SelenideElement LoginButton = $(By.xpath("//button[@ng-show=\"custId != ''\"]"));
    public LoginPage(){
        Selenide.open(base_Url);
    }
    public LoginPage ClickOnCustomerLogin(){
        customer_login.click();
        return this;
    }
    public LoginPage ClickOnDropdown(){
        dropDownUsers.click();
        return this;
    }
    public LoginPage SelectUserInDropDown(){
        HarryPotterButton.click();
        return this;
    }
    public LoginPage LoginClick(){
        LoginButton.click();
        return this;
    }
}
